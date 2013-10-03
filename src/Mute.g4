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
	: assignmentList	# assignmentStatementPart
	| operation			# operationStatementPart
	| condition			# conditionStatementPart
	;

operation
	: OPERATION_BEGIN lValueExpression assignmentList '}'	# assignmentOperation	
	| OPERATION_BEGIN rValueExpression '}'					# genericOperation
	;

condition
	: CONDITION_BEGIN rValueExpression COMP_OPERATOR rValueExpression ')'	# genericCondition
	| CONDITION_BEGIN lValueExpression ')'									# existenceCondition
	;
	
assignmentList
	: ASSIGNMENT_BEGIN assignment (',' assignment)*? ']' 
	;
	
assignment
	: (ID | INT) ':' rValueExpression
	| rValueExpression
	;
	
// An l-value expression is an alias to a location in memory; an assignable expression 
lValueExpression
	: lValueExpression '.' (ID | INT)
	| ID
	;
	
// An r-value expression is a expression that translates to a value, in-memory or literal
rValueExpression
    : '-' rValueExpression									# unaryExpression						
    | rValueExpression ('*' | '/') rValueExpression			# binaryNumericExpression
    | rValueExpression ('+' | '-') rValueExpression			# binaryNumericExpression
    | rValueExpression ('&' | '|') rValueExpression			# binaryStringExpression
    | (MODULE '.')? lValueExpression						# lValueWrapper
    | STRING (',' rValueExpression)*?						# stringExpansion
    | INT													# numericAtom
    | rValueExpression '~' rValueExpression					# range
    | '(' rValueExpression ')'								# parenthezisedExpression
    ;
   
// ===========
// LEXER RULES
// ===========

COMMENT : '#' ~[\r\n]* -> skip ;
	
STRING : '"' CHARACTER*? '"' ;
MODULE : '<' ID '>' {inStatement = true;} ;
ID : (ID_LETTER (ID_LETTER | DIGIT)* | '$') {inStatement = true;} ;
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