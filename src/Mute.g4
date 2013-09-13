grammar Mute;

// parser rules

parse
	: statement+ EOF
	;

statement
	: MODULE condition* assignmentList EOL
	| MODULE assignmentList condition* EOL			
	| ID condition* assignmentList+ operation* EOL	
	| ID assignmentList+ condition* operation* EOL	
	| assignmentList* condition* operation+ EOL		
	| condition* assignmentList* operation+ EOL
	| EOL											
	;
	
operation
	: '{' VALUE (',' expression)*? '}'
	;

condition
	: '(' expression OPERATOR VALUE ')'
	;
	
assignmentList
	: '[' assignment (',' assignment)*? ']'
	;
	
assignment
	: expression ':' (ID | VALUE)
	| VALUE
	;
	
expression
	: ID
	| expression '.' ID
	;
	
// lexer rules
	
ID : ID_LETTER (ID_LETTER | DIGIT)* | '$';

VALUE
	: STRING
	| INT
	| FLOAT
	| RANGE
	;

MODULE : '<' ID '>'	;
	
OPERATOR : '>=' | '>' | '<=' | '<' | '==' ;

fragment STRING : '"' CHARACTER*? '"' ;
fragment CHARACTER : ~[\r\n] ;
fragment INT : DIGIT+ ;

fragment FLOAT
	: DIGIT+ '.' DIGIT*
	| '.' DIGIT+
	;
	
fragment RANGE
	: INT '~' INT
	| FLOAT '~' FLOAT
	;

fragment ID_LETTER : [a-zA-Z_] ;
fragment DIGIT : [0-9] ;

COMMENT : '#' .*? EOL -> skip ;
WHITESPACE : [ \t]+ -> skip ;

EOL : '\r'? '\n' | '\r' ;	
