grammar Mute;

parse
	: Statement* EOF
	;

Statement
	: Identifier? Condition* Assignment* Operation* EOL
	;

Identifier
	: ~(
		  '[' | ']' 
		| '<' | '>' 
		| '(' | ')' 
		| '{' | '}' 
		| '#' | '"' | ':' | ',' | '$' | '.' | '~'
		| ' ' | '\t'
	)+
	;

Operation
	: 
	;

Condition
	:
	;
	
Assignment
	:
	;
	
COMMENT
	: '#' .*? EOL -> skip
	;
	
EOL	
	: '\r'? '\n' | '\r'
	;
	
WHITESPACE
	: [ \t\u000C]+ -> skip
	;
