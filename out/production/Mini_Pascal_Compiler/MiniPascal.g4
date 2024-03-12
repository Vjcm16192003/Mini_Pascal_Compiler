grammar MiniPascal;



program: PROGRAM ID ';' block '.' (decl | function_decl | procedure_decl | statement | function_call | procedure_call)+ EOF
       ;

block: BEGIN (decl | function_decl | procedure_decl | statement | function_call | procedure_call)* END
     ;

decl: variable_decl
    | array_decl
    ;

variable_decl:  ID (',' ID)* ':' type (ASSIGN value)? ';'
    ;

array_decl: ID ':' array_type '=' array_value
    ;

statement: expr ';'                 # exprStatement
         | if_statement            # ifStatement
         | while_statement         # whileStatement
         | for_statement           # forStatement
         | repeat_statement        # repeatStatement
         | function_call ';'      # functionCallStatement
         | procedure_call ';'     # procedureCallStatement
         ;

if_statement: IF expr THEN program (ELSE program)? END ';'      # ifStatementRule
            ;

while_statement: WHILE expr DO program END ';'        # whileStatementRule
               ;

for_statement: FOR ID ':' expr TO expr DO program END ';'        # forStatementRule
             ;

repeat_statement: REPEAT program UNTIL expr ';'        # repeatStatementRule
                ;

/* Expressions */

expr: expr AND expr           # andExpr
    | expr OR expr            # orExpr
    | NOT expr                # notExpr
    | expr '>' expr           # greaterThanExpr
    | expr '<' expr           # lessThanExpr
    | expr '>=' expr          # greaterThanOrEqualExpr
    | expr '<=' expr          # lessThanOrEqualExpr
    | expr '=' expr           # equalToExpr
    | expr '<>' expr          # notEqualToExpr
    | expr '*' expr           # mulExpr
    | expr '/' expr           # divExpr
    | expr '+' expr           # addExpr
    | expr '-' expr           # subExpr
    | expr 'div' expr         # divExpr
    | expr 'mod' expr         # modExpr
    | '(' expr ')'            # parenthesesExpr
    | ID                      # idExpr
    | NUM                     # numExpr
    | CONSTCHAR               # constCharExpr
    | STRING_LITERAL          # stringLiteralExpr
    | BOOLEAN                 # booleanExpr
    | array_access            # arrayAccessExpr
    ;

array_access: ID '[' index_expr ']' ('[' index_expr ']')?
    ;

index_expr: expr
    ;

/* Types */

type: INT_TYPE
    | CHAR_TYPE
    | STRING_TYPE
    | BOOLEAN_TYPE
    | ARRAY_TYPE
    ;

array_type: type ('[' NUM ']')+
    ;

/* Values */

value: NUM
    | CONSTCHAR
    | STRING_LITERAL
    | BOOLEAN
    ;

array_value: '[' value (',' value)* ']' ((',' value)+)+
    ;

/* Functions */

function_decl: FUNCTION ID '(' params ')' ':' type ';' program END ';'
             ;

params: (param (',' param)*)?
      ;

param: VAR? ID ':' type
     ;

function_call: ID '(' args ')'
             ;

args: (expr (',' expr)*)?
    ;

/* Procedures */

procedure_decl: PROCEDURE ID '(' params ')' ';' program END ';'
              ;

procedure_call: ID '(' args ')'
              ;

/* Main */

main: MAIN ';' program END ';'
    ;

/* Tokens */

PROGRAM: 'program';
FUNCTION: 'function';
PROCEDURE: 'procedure';
BEGIN: 'begin';
MAIN: 'main';
VAR: 'var';
ASSIGN: ':=';
END: 'end';
READ: 'read';
WRITE: 'write';
CONSTSTR: 'conststr';
AND: 'and';
OR: 'or';
NOT: 'not';
IF: 'if';
THEN: 'then';
ELSE: 'else';
WHILE: 'while';
DO: 'do';
FOR: 'for';
TO: 'to';
REPEAT: 'repeat';
UNTIL: 'until';
ID: [a-zA-Z][a-zA-Z0-9_]*;
NUM: '0' | '-'?[1-9][0-9]*;
CONSTCHAR: '\'' ~'\'' '\'';
STRING_LITERAL: '"' ~'"'* '"';
BOOLEAN: 'true' | 'false';
INT_TYPE: 'Integer';
CHAR_TYPE: 'Char';
STRING_TYPE: 'String';
BOOLEAN_TYPE: 'Boolean';
ARRAY_TYPE: 'Array';
WS: [ \t\r\n]+ -> skip; // Ignore whitespace characters
COMMENT: '{' ~[\r\n]* '}' -> skip;

