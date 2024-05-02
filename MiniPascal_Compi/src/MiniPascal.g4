grammar MiniPascal;

@header{
     import java.util.HashMap;
     import java.lang.Math;
     import java.util.Scanner;
     }

@members {
    Scanner io = new Scanner(System.in);
}


start:
    program EOF;

program:
    PROGRAM identifier ';' varBlock functionDecs block '.';

varBlock:
    | VAR varDecs
    ;

varDecs:
    //nothing
    | varDec varDecs
    ;

varDec:
    ID ':' type=(BOOLEAN | INTEGER | STRING | CHAR) ':=' expr ';'                    #initDec
    | ID ':' type=(BOOLEAN | INTEGER | STRING | CHAR) ';'                           #normDec
    ;

functionDecs:
    | funcOrProcDec functionDecs
    ;

funcOrProcDec:
    funcDec
    | procDec
    ;

funcDec:
    FUNCTION ID LPAREN (formalParameterList)? RPAREN ':' type=(INTEGER | BOOLEAN | STRING | CHAR) ';' varBlock block ';'
    ;

procDec:
    PROCEDURE ID LPAREN (formalParameterList)? RPAREN ';' varBlock block ';'
    ;

formalParameterList:
    paramGroup (';' paramGroup)*
    ;

paramGroup:
    variableList ':' variableType
    ;

variableList:
    identifier (',' identifier)*
    ;

variableType:
    INTEGER
    | BOOLEAN
    | STRING
    | CHAR
    ;

functionCall:
    func_identifier LPAREN parameters RPAREN
;

procedureCall:
    func_identifier LPAREN parameters RPAREN ';'
;

parameters:
    | expr (',' expr)*
    ;



block:
    | BEGIN statements END
    ;

statements:
    | statement statements
    ;

statement:
    varAssign
    | procedureCall
    | loopType
    | ifStatement
    | caseStatement
    | readLn
    | writeLn
    | write
    | eval_break
    | eval_continue
    ;



varAssign:
    ID ':=' functionCall ';'                            #funcAssignment
    | ID ':=' expr ';'                                  #exprAssignment
    ;


readLn:
    'readln' LPAREN ID RPAREN ';'
    ;

writeLn:
    'writeln' LPAREN ( line DELIM?)+ RPAREN ';'
    ;

write:
    'write' LPAREN (line DELIM?)+ RPAREN ';'
    ;
line:
    expr                                #exprLine
    | STRING_LITERAL                    #strLine

    ;




loopType:
    whileLoop
    | forLoop
    ;

whileLoop:
    WHILE LPAREN? expr RPAREN DO loopBlock
    ;

forLoop:
    FOR varForAssign (TO|DOWNTO) element DO loopBlock?
    ;

varForAssign:
    ID ':=' expr
    ;

loopBlock:
    BEGIN loopStatements END ';'
    ;

loopStatements:
    //nothing
    | loopStatement loopStatements
    ;

loopStatement:
    varDec
    | statement
    | eval_break
    | eval_continue
    ;

eval_break:
    BREAK ';'
    ;

eval_continue:
    CONTINUE ';'
    ;





ifStatement:
    IF condBlock (ELSE IF condBlock)* (ELSE stateBlock)?
    ;

condBlock:
    LPAREN? expr RPAREN? THEN stateBlock
    ;

stateBlock:
    block ';'
    | statement
    ;

caseStatement:
    CASE LPAREN? expr RPAREN? OF (caseBlock)+ END ';'
    ;

caseBlock:
    expr ':' statement
    ;

expr:
    SUBT expr                                             #unaryExpr
    | NOT expr                                              #notExpr
    | lEx=expr op=(MULT | DIV | MOD) rEx=expr               #multExpr
    | lEx=expr op=(ADD | SUBT) rEx=expr                     #addExpr
    | lEx=expr op=(LTE | GTE | LT | GT) rEx=expr            #compareExpr
    | lEx=expr op=(EQ | NEQ) rEx=expr                       #equalityExpr
    | lEx=expr AND rEx=expr                                 #andExpr
    | lEx=expr OR rEx=expr                                  #orExpr
    | functionCall                                          #functCallExpr
    | element                                               #elementExpr
    ;

func_identifier:
    ID
    ;

element:
    LPAREN expr RPAREN                              #parElement
    | ID                                            #idElement
    | (TRUE | FALSE)                                #boolElement
    | NUM                                           #realElement
    ;

//Might?? cause some issues. Idk though


identifier:
    ID
    ;


fragment A
   : ('a' | 'A')
   ;

fragment B
   : ('b' | 'B')
   ;

fragment C
   : ('c' | 'C')
   ;

fragment D
   : ('d' | 'D')
   ;

fragment E
   : ('e' | 'E')
   ;

fragment F
   : ('f' | 'F')
   ;

fragment G
   : ('g' | 'G')
   ;

fragment H
   : ('h' | 'H')
   ;

fragment I
   : ('i' | 'I')
   ;

fragment J
   : ('j' | 'J')
   ;

fragment K
   : ('k' | 'K')
   ;

fragment L
   : ('l' | 'L')
   ;

fragment M
   : ('m' | 'M')
   ;

fragment N
   : ('n' | 'N')
   ;

fragment O
   : ('o' | 'O')
   ;

fragment P
   : ('p' | 'P')
   ;

fragment Q
   : ('q' | 'Q')
   ;

fragment R
   : ('r' | 'R')
   ;

fragment S
   : ('s' | 'S')
   ;

fragment T
   : ('t' | 'T')
   ;

fragment U
   : ('u' | 'U')
   ;

fragment V
   : ('v' | 'V')
   ;

fragment W
   : ('w' | 'W')
   ;

fragment X
   : ('x' | 'X')
   ;

fragment Y
   : ('y' | 'Y')
   ;

fragment Z
   : ('z' | 'Z')
   ;



PROGRAM:
    P R O G R A M
    ;

VAR:
    V A R
    ;

FUNCTION:
    F U N C T I O N
    ;

PROCEDURE:
    P R O C E D U R E
    ;

TRUE:
    T R U E
    ;

FALSE:
    F A L S E
    ;

BOOLEAN:
    B O O L E A N
    ;

AND:
    A N D
    ;

OR:
    O R
    ;

NOT:
    N O T
    ;

MOD:
    M O D
    ;

STRING:
    S T R I N G
;

CHAR:
    C H A R
;

INTEGER:
    I N T E G E R
    ;

FOR:
    F O R
    ;

WHILE:
    W H I L E
    ;

DO:
    D O
    ;

TO:
    T O
    ;
DOWNTO:
    D O W N T O
;

BREAK:
    B R E A K
    ;

CONTINUE:
    C O N T I N U E
    ;

IF:
    I F
    ;

THEN:
    T H E N
    ;

ELSE:
    E L S E
    ;

CASE:
    C A S E
    ;

OF:
    O F
    ;

BEGIN:
    B E G I N
    ;

END:
    E N D
    ;

LPAREN:
    '('
    ;

RPAREN:
    ')'
    ;

MULT: '*';
DIV: '/';
ADD: '+';
SUBT: '-';
EQ: '=';
GT: '>';
LT: '<';
GTE: '>=';
LTE: '<=';
NEQ: '<>';
DELIM: ',';

ID: ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')* ;
STRING_LITERAL: '\'' ('\'\'' | ~ ('\''))* '\'';
NUM: ('0'..'9')+ | ('0'..'9')+'.'('0'..'9')+;
WS : [ \t\r\n]+ -> skip ;
COMMENT_1
   : '{*' .*? '*}' -> skip
   ;
COMMENT_2
   : '{' .*? '}' -> skip
   ;

