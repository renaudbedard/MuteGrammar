grammar Mute;

@lexer::members {
	boolean inStatement = false;
}

// ============
// PARSER RULES
// ============

parse
	: statement+ EOF
	;

statement
	: MODULE statementPart+ EOL
	| ID? statementPart+ EOL
	;
	
statementPart
	: assignmentList
	| operation
	| condition
	;

operation
	: OPERATION_BEGIN STRING (',' rValueExpression)*? '}'
	| OPERATION_BEGIN lValueExpression assignmentList '}'	
	| OPERATION_BEGIN rValueExpression '}'
	;

condition
	: CONDITION_BEGIN rValueExpression COMP_OPERATOR rValueExpression ')'
	| CONDITION_BEGIN lValueExpression ')' // existence predicate
	;
	
assignmentList
	: ASSIGNMENT_BEGIN assignment (',' assignment)*? ']' 
	;
	
assignment
	: ID ':' rValueExpression
	| rValueExpression
	;
	
// An l-value expression is an alias to a location in memory; an assignable expression 
lValueExpression
	: lValueExpression '.' (lValueExpression | INT)
	| ID
	;
	
// An r-value expression is a expression that translates to a value, in-memory or literal
rValueExpression
    : '-' rValueExpression                							
    | rValueExpression ('*' | '/') rValueExpression					
    | rValueExpression ('+' | '-' | '&' | '|') rValueExpression
    | (MODULE '.')? lValueExpression
    | INT | RANGE | STRING
    | '(' rValueExpression ')'
    ;
    
// ===========
// LEXER RULES
// ===========

COMMENT : '#' ~[\r\n]* -> skip ;
	
STRING : '"' CHARACTER*? '"' ;
MODULE : '<' ID '>' {inStatement = true;} ;
ID : (ID_LETTER (ID_LETTER | DIGIT)* | '$') {inStatement = true;} ;
RANGE : INT '~' INT ;
INT : DIGIT+ ; 
	
COMP_OPERATOR : '>=' | '>' | '<=' | '<' | '=' ;

OPERATION_BEGIN : '{' {inStatement = true;} ;
CONDITION_BEGIN : '(' {inStatement = true;}  ;
ASSIGNMENT_BEGIN : '[' {inStatement = true;} ;

fragment CHARACTER : ~[\r\n] ;
fragment ID_LETTER : [a-zA-Z_] ;
fragment DIGIT : [0-9] ;

IGNORED_EOL : ('\r'? '\n') {!inStatement}? -> skip ;
EOL : ('\r'? '\n') {inStatement = false;} ;
WHITESPACE : [ \t]+ -> skip ;