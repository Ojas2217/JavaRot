grammar JavaRot;

program: statement+;

type
    : TAX ('[' ']')? //int
    | ONG ('[' ']')?  //boolean
    | GONE // void
    | CHAT ('[' ']')?  //char
    | SKIBIDI ('[' ']')?  //String
    | TUAH ('[' ']')? //double
    | IDENTIFIER
    ;

statement
    :variableDeclaration
    | assignment
    | ifStatement
    | whileStatement
    | forStatement
    | returnStatement
    | expressionStatement
    | breakStatement
    | continueStatement
    | tryCatchStatement
    | printStatement
    | methodDeclaration
    ;
methodDeclaration
    : type IDENTIFIER '(' parameterList? ')' block
    ;
parameterList
    : type IDENTIFIER (',' type IDENTIFIER)*
    ;

variableDeclaration
    : type IDENTIFIER (TS  expression | TS  '{' expression (',' expression)* '}' | TS  NEW type '[' expression ']')? statementEnd
    ;

assignment
    : (IDENTIFIER|arrayIndex) TS  expression statementEnd
    ;
arrayIndex
    : IDENTIFIER '[' expression ']'
    ;
ifStatement
    : HUZZ '(' expression ')' block (BRUZZ block)?//if-else
    ;

whileStatement
    : EDGE '(' expression ')' block
    ;
forStatement
    : GOON '('
      (variableDeclaration | expressionStatement)? expressionStatement? expression? ')' block
    ;

returnStatement
    : JS_GIMME_MY_MONEY expression? statementEnd
    ;

printStatement
    : PRNT '(' argumentList? ')' statementEnd
    ;

expressionStatement
    : expression statementEnd
    ;

expression
    : IDENTIFIER
    | IDENTIFIER '(' argumentList? ')'
    | literal
    | expression operator expression
    | '(' expression ')'
    | NEW type '[' expression ']'
    | TS_NT expression  // !c;
    |  IDENTIFIER LONG_AHH // c++;
    | IDENTIFIER SMALL_AHH  // c--;
    | expression '[' expression ']'  // array indexing
     ;

literal
    : TAX_LITERAL
    | ONG_LITERAL
    | SKIBIDI_LITERAL
    | CHAT_LITERAL
    | TUAH_LITERAL
    ;

operator
    : ADD_TS //+
    | SUB_TS //-
    | MUL_TS //*
    | DIV_TS // /
    | MOD_TS // %
    | TS_EQL // ==
    | TS_NOT_EQL // !=
    | TS_LES_OR_EQL // <=
    | TS_GRTR_OR_EQL // >=
    | TS_LES // <
    | TS_GRTR // >


    | ND // &&
    | OR // ||
    ;

block
    : '{' statement* '}'
    ;

argumentList
    : expression (',' expression)*
    ;

tryCatchStatement
    : TS_GON_WRK block (TS_PMO_GNG '(' IDENTIFIER ')' block)* (FNLY block)?
    ;

breakStatement
    : SYBAU statementEnd
    ;

continueStatement
    : GO_ON statementEnd
    ;

statementEnd
    : SEMI          // Semicolon as one option
    | PMO_HEART       // 'ts pmo heart' as an alternative
    ;

THS_SHI         : 'ths shi';            //class
TS_GON_WRK      : 'ts gon wrk';         //try
TS_PMO_GNG      : 'ts pmo gng';         //catch
JS_GIMME_MY_MONEY: 'js gimme my money'; //return
PBLC            : 'pblc';               //public
PRVT            : 'prvt';               //private
STTC            : 'sttc';               //static
FNLY            : 'fnly';               //finally
FN              : 'fn';                 //final
HUZZ            : 'huzz';               //if
BRUZZ           : 'bruzz';              //else
EDGE            : 'edge';               //while
GOON            : 'goon';               //for
SYBAU           : 'sybau';              //break
GO_ON           : 'go on';              //continue
NEW             : 'new';                //new
PRNT            : 'prnt';               //print

// Types
TAX             : 'tax';                //int
ONG             : 'ong';                //boolean
GONE            : 'gone';               //void
CHAT            : 'chat';               //char
SKIBIDI         : 'Skibidi';            //String
TUAH            : 'tuah';               //double

// Operators
ADD_TS          : 'add ts';             //+
SUB_TS          : 'sub ts';             //-
MUL_TS          : 'mul ts';             //*
DIV_TS          : 'div ts';             ///
MOD_TS          : 'mod ts';             //%
TS_EQL          : 'ts eql';             //==
TS_LES_OR_EQL   : 'ts les or eql';      //<=
TS_GRTR_OR_EQL  : 'ts grtr or eql';     //>=
TS_LES          : 'ts les';             //<
TS_GRTR         : 'ts grtr';            //>
TS_NOT_EQL      : 'ts not eql';         //!=
LONG_AHH        : 'long ahh';           //c++ (incrementing an integer 'c')
SMALL_AHH       : 'small ahh';          //c-- (decrementing an integer 'c')
TS_NT           : 'ts nt';              //!c (negating a boolean c)
ND              : 'nd';                 //&&
OR              : 'or';                 //||
TS              : 'ts';                 //=

// Terminators
SEMI            : ';';                  //You can use the default line terminator
PMO_HEART     : '💔';                   //but i'd encourage you to use this one

// Literals
TAX_LITERAL     : [0-9]+;
ONG_LITERAL     : 'fr' | 'cap';
SKIBIDI_LITERAL : '"' (ESC | ~["\\])* '"';
CHAT_LITERAL    : '\'' (ESC | ~['\\]) '\'';
TUAH_LITERAL    : [0-9]+ '.' [0-9]* ([eE][+-]?[0-9]+)?;
IDENTIFIER      : [a-zA-Z_][a-zA-Z_0-9]*;


// Whitespace/Comments
WS              : [ \t\r\n]+ -> skip;
COMMENT         : '🥀*' .*? '*🥀' -> skip;
LINE_COMMENT    : '🥀' ~[\r\n]* -> skip;
ESC    : '\\' [btnfr"'\\];