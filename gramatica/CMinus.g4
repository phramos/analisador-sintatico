grammar  CMinus;

//TODO: Tirar minusculo de identifier

// starting point for parsing a java file
compilationUnit
    :   (localVariableDeclarationStatement | methodDeclaration | structDeclarationStatement)* EOF
    ;

/* We use rule this even for void methods which cannot have [] after parameters.
   This simplifies grammar and we can consider void to be a type, which
   renders the [] matching as a context-sensitive issue or a semantic check
   for invalid return type after parsing.
 */
 //TODO: verificar | ; )
methodDeclaration
    :   (typeType|'void') Identifier formalParameters ('[' ']')*
        (   methodBody |   ';')
    ;

variableDeclarators
    :   variableDeclarator
    ;

variableDeclarator
    :   variableDeclaratorId ('=' variableInitializer)?
    ;

variableDeclaratorId
    :   Identifier
    ;

//TODO: Verificar necessidade
variableInitializer
    :   expression
    ;

typeType
    :   primitiveType
    ;

//TODO:fazer char functionar la embaixo
//TODO:fazer struct funcionar certinho
primitiveType
    :   'int'
    |   'float'
    |   'char'
    ;

formalParameters
    :   '(' formalParameterList? ')'
    ;

formalParameterList
    :   formalParameter (',' formalParameter)*
    ;

formalParameter
    :   typeType variableDeclaratorId
    ;

methodBody
    :   block
    ;


literal
    :   IntegerLiteral
    |   FloatingPointLiteral
    |   CharacterLiteral
    ;

//Struct
structDeclaration
    :   'struct' Identifier '{' (structVaribleDeclaration)+ '}'
    ;

structVaribleDeclaration
    :   primitiveType Identifier ('=' structVariableInitializer)? ';'
    ;

structVariableInitializer
    :   literal
    ;

structDeclarationStatement
    :   structDeclaration ';'
    ;

// STATEMENTS / BLOCKS


block
    :   '{' blockStatement* '}'
    ;

blockStatement
    :   localVariableDeclarationStatement
    |   structDeclarationStatement
    |   statement
    ;

localVariableDeclarationStatement
    :    localVariableDeclaration ';'
    ;

localVariableDeclaration
    :   typeType variableDeclarators
    ;

//TODO: Ajustar o if, e while
statement
    :   block
    |   'if' parExpression statement ('else' statement)?
    |   'while' parExpression statement
    |   'return' expression? ';'
    |   ';'
    |   statementExpression ';'
    ;

// EXPRESSIONS

parExpression
    :   '(' expression ')'
    ;

expressionList
    :   expression (',' expression)*
    ;

statementExpression
    :   expression
    ;

//TODO: olhar mais a respeito do  |   expression '(' expressionList? ')'
expression
    :   primary
//    |   expression '(' expressionList? ')'
    |   expression ('*'|'/') expression
    |   expression ('+'|'-') expression
    |   expression ('<=' | '>=' | '>' | '<') expression
    |   expression ('==' | '!=') expression
    |   <assoc=right> expression '=' expression
    ;

primary
    :   '(' expression ')'
    |   literal
    |   Identifier
    ;

arguments
    :   '(' expressionList? ')'
    ;

// LEXER

// §3.9 Keywords



INT     : 'int';
FLOAT   : 'float';
STRUCT  : 'struct';
IF      : 'if';
ELSE    : 'else';
WHILE   : 'while';
VOID    : 'void';
RETURN  : 'return';

// §3.10.1 Integer Literals

IntegerLiteral
    :   DecimalIntegerLiteral
    ;

fragment
DecimalIntegerLiteral
    :   DecimalNumeral+
    ;

fragment
DecimalNumeral
    :   '0'
    |   NonZeroDigit
    ;

fragment
Digits
    :   Digit+
    ;

fragment
Digit
    :   '0'
    |   NonZeroDigit
    ;

fragment
NonZeroDigit
    :   [1-9]
    ;

// §3.10.2 Floating-Point Literals

FloatingPointLiteral
    :   DecimalFloatingPointLiteral
    ;

fragment
DecimalFloatingPointLiteral
    :   Digits '.' Digits? ExponentPart?
    |   Digits ExponentPart
    |   Digits
    ;

fragment
ExponentPart
    :   ExponentIndicator SignedInteger
    ;

fragment
ExponentIndicator
    :   [E]
    ;

fragment
SignedInteger
    :   Sign? Digits
    ;

fragment
Sign
    :   [+-]
    ;

// §3.10.3 Boolean Literals

// §3.10.4 Character Literals
// §3.10.4 Character Literals

CharacterLiteral
    :   '\'' SingleCharacter '\''
    ;

fragment
SingleCharacter
    :   ~['\\]
    ;

// §3.10.5 String Literals

StringLiteral
    :   '"' StringCharacters? '"'
    ;

fragment
StringCharacters
    :   StringCharacter+
    ;

fragment
StringCharacter
    :   ~["\\]
    ;

// §3.11 Separators

LPAREN          : '(';
RPAREN          : ')';
LBRACE          : '{';
RBRACE          : '}';
LBRACK          : '[';
RBRACK          : ']';
SEMI            : ';';

// §3.12 Operators

ASSIGN          : '=';
LT              : '<';
EQUAL           : '==';
LE              : '<=';
GE              : '>=';
NOTEQUAL        : '!=';
ADD             : '+';
SUB             : '-';
MUL             : '*';
DIV             : '/';

// §3.8 Identifiers (must appear after all keywords in the grammar)

Identifier
    :   Letter (Letter | Digit)*
    ;

fragment
Letter
    :   [a-z] // these are the "java letters" below 0x7F
    ;


//
// Whitespace and comments
//

WS  :  [ \t\r\n\u000C]+ -> channel(HIDDEN)
    ;

COMMENT
    :   '/*' .*? '*/' -> channel(HIDDEN)
    ;
