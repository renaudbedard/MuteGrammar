grammar Mute;

// ============
// PARSER RULES
// ============

parse
	: statement+ EOF
	;

statement
	: MODULE assignmentList						// module setting
	| ID assignmentList condition* operation?	// named statement (standard order)
	| ID condition* assignmentList operation?	// named statement (inverted order)
	| ID condition* operation					// named statement (without assignment)	
	| assignmentList* condition* operation		// unnamed statement
	| operation									// stray operations
	;
	
operation
	: '{' STRING (',' rValueExpression)*? '}'
	| '{' lValueExpression assignmentList '}'	
	| '{' rValueExpression '}'
	;

condition
	: '(' rValueExpression COMP_OPERATOR rValueExpression ')'
	;
	
assignmentList
	: '[' assignment (',' assignment)*? ']' 
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
	: rValueExpression CALC_OPERATOR rValueExpression 
	| (MODULE '.')? lValueExpression
	| (STRING | INT | RANGE) 
	;
	
// ===========
// LEXER RULES
// ===========

COMMENT : '#' ~[\r\n]* -> skip ;
	
STRING : '"' CHARACTER*? '"' ;
MODULE : '<' ID '>' ;
ID : ID_LETTER (ID_LETTER | DIGIT)* | '$' ;
RANGE : INT '~' INT ;
INT : DIGIT+ ;
	
CALC_OPERATOR : '+' | '/' | '-' | '*' | '&' | '|' ;
COMP_OPERATOR : '>=' | '>' | '<=' | '<' | '=' ;

fragment CHARACTER : ~[\r\n] ;
fragment ID_LETTER : [a-zA-Z_] ;
fragment DIGIT : [0-9] ;

EOL : '\r'? '\n' -> skip ;
WHITESPACE : [ \t]+ -> skip ;