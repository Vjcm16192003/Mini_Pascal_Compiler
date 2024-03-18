grammar MiniPascal;

program
    : PROGRAM identifier SEMI block*
    ;

block
    : (variableDeclarationPart)? procedureAndFunctionDeclarationPart? compoundStatement
    ;


variableDeclarationPart
    : VAR (variableDeclaration SEMI)+
    ;

variableDeclaration
    : identifierList COLON typeIdentifier
    ;

procedureAndFunctionDeclarationPart
    : (procedureDeclaration | functionDeclaration SEMI)+
    ;

procedureDeclaration
    : PROCEDURE identifier SEMI block
    ;



resultType
    : typeIdentifier
    ;

functionDeclaration
    : FUNCTION identifier (LPAREN formalParameterList? RPAREN)? COLON resultType
    ;

formalParameterList
    : (formalParameterSection (SEMI formalParameterSection)*)?
    ;

formalParameterSection
    : (VAR)? identifierList COLON typeIdentifier
    ;

typeIdentifier
    : INTEGER
    | CHAR
    | STRING
    | BOOLEAN
    | arrayType
    ;

arrayType
    : ARRAY LBRACK constant DOTDOT constant RBRACK OF typeIdentifier
    | ARRAY LBRACK constant DOTDOT constant COMMA constant DOTDOT constant RBRACK OF typeIdentifier
    ;

constant
    : unsignedNumber
    | sign unsignedNumber
    | identifier
    | sign identifier
    | string
    | constantChr
    ;

sign
    : PLUS
    | MINUS
    ;
constantChr
    : CHR LPAREN unsignedInteger RPAREN
    ;
unsignedNumber
    : unsignedInteger
    | unsignedReal
    ;

unsignedInteger
    : NUM_INT
    ;
unsignedReal
    : NUM_REAL
    ;
string
    : STRING_LITERAL
    ;

compoundStatement
    : BEGIN statements blockEnd
    ;

blockEnd:
END
;

statements
    : statement (SEMI statement)* SEMI
    ;

statement
    : assignmentStatement
    | procedureStatement
    | compoundStatement
    | ifStatement
    | whileStatement
    | forStatement
    | repeatStatement
    | writeStatement
    | writelnStatement
    | readStatement
    ;

writelnStatement
    :WRITELN LPAREN conststr (COMMA variable)? RPAREN
    ;

assignmentStatement
    : variable ASSIGN expression
    ;

procedureStatement
    : identifier (LPAREN actualParameterList RPAREN)?
    ;

actualParameterList
    : actualParameter (COMMA actualParameter)*
    ;

actualParameter
    : expression
    ;

ifStatement
    : IF expression THEN statement (ELSE statement)?
    ;

whileStatement
    : WHILE expression DO statement
    ;

forStatement
    : FOR identifier ASSIGN expression (TO | DOWNTO) expression DO statement
    ;

repeatStatement
    : REPEAT statements UNTIL expression
    ;

writeStatement
    : WRITE LPAREN conststr (COMMA variable)? RPAREN
    ;

readStatement
    : READ LPAREN variable RPAREN
    ;

expression
    : simpleExpression (relationaloperator simpleExpression)?
    ;

    relationaloperator
        : EQUAL
        | NOT_EQUAL
        | LT
        | LE
        | GE
        | GT
        | IN
        ;

simpleExpression
    : term (additiveoperator term)*
    ;

    additiveoperator
        : PLUS
        | MINUS
        | OR
        ;

term
    : factor (multiplicativeoperator factor)*
    ;

    multiplicativeoperator
        : STAR
        | SLASH
        | DIV
        | MOD
        | AND
        ;

factor
    : variable
    | number
    | conststr
    | LPAREN expression RPAREN
    | NOT factor
    ;

variable
    : identifier
    | identifier LBRACK expression RBRACK
    | identifier LBRACK expression COMMA expression RBRACK
    ;

identifierList
    : identifier (COMMA identifier)*
    ;

conststr
    : STRING_LITERAL
    ;

identifier
    : IDENT
    ;
number
    : NUM_INT
    ;

CONST
    : 'Const'
    ;

VAR
    : 'var'
    ;

INTEGER
    : 'Integer'
    ;

CHAR
    : 'Char'
    ;

CHR
    : 'CHR'
    ;

STRING
    : 'String'
    ;

BOOLEAN
    : 'Boolean'
    ;

ARRAY
    : 'Array'
    ;

IN
    : 'In'
    ;

OF
    : 'of'
    ;

FUNCTION
    : 'Function'
    ;

PROCEDURE
    : 'Procedure'
    ;

PROGRAM
    : 'program'
    ;

BEGIN
    : 'begin'
    ;

END
    : 'end'
    ;

IF
    : 'If'
    ;

THEN
    : 'Then'
    ;

ELSE
    : 'Else'
    ;

WHILE
    : 'While'
    ;

DO
    : 'Do'
    ;

FOR
    : 'For'
    ;

TO
    : 'To'
    ;

DOWNTO
    : 'Downto'
    ;

REPEAT
    : 'Repeat'
    ;

UNTIL
    : 'Until'
    ;

WRITE
    : 'write'
    ;

WRITELN
    : 'writeln'
    ;

READ
    : 'read'
    ;

NOT
    : 'Not'
    ;

AND
    : 'And'
    ;

OR
    : 'Or'
    ;

PLUS
    : '+'
    ;

MINUS
    : '-'
    ;

STAR
    : '*'
    ;

SLASH
    : '/'
    ;

DIV
    : 'div'
    ;

MOD
    : 'mod'
    ;

ASSIGN
    : ':='
    ;

EQUAL
    : '='
    ;

NOT_EQUAL
    : '<>'
    ;

LT
    : '<'
    ;

LE
    : '<='
    ;

GT
    : '>'
    ;

GE
    : '>='
    ;

LPAREN
    : '('
    ;

RPAREN
    : ')'
    ;

LBRACK
    : '['
    ;

RBRACK
    : ']'
    ;

COMMA
    : ','
    ;

SEMI
    : ';'
    ;

COLON
    : ':'
    ;

DOT
    : '.'
    ;

DOTDOT
    : '..'
    ;

NUM_INT
    : ('0' .. '9')+
    ;

STRING_LITERAL
    : '\'' (~[\r\n])* '\''
    ;

IDENT
    : ('a' .. 'z' | 'A' .. 'Z') ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_')*
    ;


NUM_REAL
    : ('0' .. '9')+ (('.' ('0' .. '9')+ (EXPONENT)?)? | EXPONENT)
    ;

WS
    : [ \t\r\n] -> skip
    ;

COMMENT: '{' ~[\r\n]*'}'->skip;
fragment EXPONENT
    : ('E') ('+' | '-')? ('0'..'9')+;