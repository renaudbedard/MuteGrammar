MuteGrammar
===========

ANTLRv4 Grammar for MuteScript

How to test
===========

- See "Getting Started" instructions at http://www.antlr.org/ to have the aliases ready
- antlr4 .\src\Mute.g4
- javac -d .\bin .\src\Mute*.java
- grun .\bin\Mute parse -gui 
- Enter mute script in console window followed by ^D (or ^Z in Windows)

Note that this is just starting and right now the grammar emits warnings that probably makes it unable to parse anything. Just wanted to get the ball rolling :)