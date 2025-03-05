grammar JavaRot;

program:   (classDeclaration | methodDeclaration | statement)+;

classDeclaration
    : 'ths shi' IDENTIFIER '{' (methodDeclaration | statement)* '}'
    ;

methodDeclaration
    : 'pblc' 'sttc'? 'gone' IDENTIFIER '(' parameterList? ')' block
    ;

parameterList
    : type IDENTIFIER (',' type IDENTIFIER)*
    ;

type
    : 'tax' //int
    | 'ong?' //boolean
    | 'gone' // void
    | 'chat' //char
    | 'Skibidi' //String
    | 'tuah' //double
    | IDENTIFIER
    ;

statement
    : variableDeclaration
    | assignment
    | ifStatement
    | whileStatement
    | forStatement
    | returnStatement
    | expressionStatement
    ;

variableDeclaration
    : type IDENTIFIER ('ts' expression)?statementEnd
    ;

assignment
    : IDENTIFIER 'ts' expression statementEnd
    ;

ifStatement
    : 'huzz' '(' expression ')' block ('bruzz' block)?statementEnd //if-else
    ;

whileStatement
    : 'edge' '(' expression ')' block statementEnd
    ;
forStatement
    : 'goon' '(' expression? statementEnd expression? statementEnd expression? ')' block statementEnd
    ;
returnStatement
    : 'js gimme my money' expression?statementEnd
    ;

expressionStatement
    : expression statementEnd
    ;

expression
    : IDENTIFIER
    | literal
    | expression operator expression
    | '(' expression ')' statementEnd
    ;

literal
    : TAX_LITERAL
    | ONG_LITERAL
    | SKIBIDI_LITERAL
    | CHAT_LITERAL
    ;

operator
    : 'add ts' //+
    | 'sub ts' //-
    | 'mul ts' //*
    | 'div ts' // /
    | 'mod ts' // %
    | 'ts eql' // ==
    | 'ts not eql' // !=
    | 'ts les' // <
    | 'ts grtr' // >
    | 'ts les or eql' // <=
    | 'ts grtr or eql' // >=
    | 'nd' // &&
    | 'or' // ||
    ;

block
    : '{' statement* '}'
    ;

IDENTIFIER
    : [a-zA-Z_][a-zA-Z_0-9]*
    ;

TAX_LITERAL
    : [0-9]+
    ;

ONG_LITERAL
    : 'fr' | 'cap'
    ;

SKIBIDI_LITERAL
    : '"' (ESC | ~["\\])* '"'
    ;

CHAT_LITERAL
    : '\'' (ESC | ~['\\]) '\''
    ;

ESC
    : '\\' [btnfr"'\\]
    ;

WS
    : [ \t\r\n]+ -> skip
    ;

COMMENT
    : '/*' .*? '*/' -> skip
    ;

LINE_COMMENT
    : ':)' ~[\r\n]* -> skip
    ;
statementEnd
    : ';'           // Semicolon as one option
    | '💔'       // 'ts pmo heart' as an alternative
    ;