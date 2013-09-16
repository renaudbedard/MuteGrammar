MuteGrammar
===========

[ANTLR v4](https://github.com/antlr/antlr4) Grammar for [aliceffekt](https://github.com/aliceffekt)'s [mute](https://github.com/user/repo/blob/branch/other_file.md) scripting language.

## How to test

### Using the jar file

In a command line environment with Java 7 JRE installed, run :

```
java -jar MuteCompiler.jar <filename>
```

Where  ``<filename>`` is a text file containing valid mute code.
The compiler currently outputs the lisp-style parse tree it detects, with a line-break for every statement.

### Using the ANTLR4 tools

- See "Getting Started" instructions at http://www.antlr.org/ to have the aliases ready
- antlr4 .\src\Mute.g4
- javac -d .\bin .\src\Mute*.java
- grun .\bin\Mute parse -gui 
- Enter mute script in console window followed by ^D (or ^Z in Windows)

## Status

The ``Mute.g4`` grammar will parse everything from the [official Mute benchmark](https://github.com/aliceffekt/mute/blob/master/mute.benchmark.txt) at the time of this writing, but does nothing with the parsed output :)
There are still ambiguities with newline handling, right now the grammar does not count newlines as data. This could change depending on what the specification intends.