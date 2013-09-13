grammar Mute;

parse
	: statement+ EOF
	;

statement
	: module condition* assignmentList EOL			# moduleStatement
	| ID condition* assignmentList+ operation* EOL	# namedStatement
	| assignmentList* condition* operation+ EOL		# unnamedStatement
	| EOL											# emptyStatement
	;
	
module
	: '<' ID '>'
	;

operation
	: '{' VALUE '}'
	;

condition
	: '(' VALUE ')'
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
	
ID : ID_LETTER (ID_LETTER | DIGIT)* | '$';

VALUE
	: STRING
	| INT
	| FLOAT
	;

fragment STRING : '"' CHARACTER*? '"' ;
fragment CHARACTER : ~[\r\n] ;
fragment INT : DIGIT+ ;
fragment FLOAT
	: DIGIT+ '.' DIGIT*
	| '.' DIGIT+
	;

fragment ID_LETTER : [a-zA-Z_] ;
fragment DIGIT : [0-9] ;

COMMENT : '#' .*? EOL -> skip ;
EOL : '\r'? '\n' | '\r' ;	
WHITESPACE : [ \t]+ -> skip ;
