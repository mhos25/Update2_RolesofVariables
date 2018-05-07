grammar Additionrecursion;

program: (statement)+;

statement: println ';'
         | print ';'
         | varDeclaration ';'
         | assignment ';'
         | branch
         | do_while ';'
         | while_statement
         ;

expression: lft= expression '/' rght=expression #Div
                | lft=expression '*' rght=expression #Mult
                | lft=expression '-' rght=expression #Minus
                | lft=expression '+' rght=expression #Plus
                | lft=expression operator = ('<'| '<=' | '>' |'>=') rght=expression #Relational
                | lft=expression '&&' rght=expression #And
                | lft=expression '||' rght=expression #Or
		| number=NUM #Number
                | txt= STRING #String
                | varName=IDENTIFIER #Variable 
                ;

varDeclaration: 'int' varName=IDENTIFIER '=' exp = expression   #VarDeclarationAndAssignment
                |'int' varName=IDENTIFIER   #SimpleVarDeclaration
                ;

assignment: varName=IDENTIFIER '=' expr=expression  #directVarAssignment
            | varName= IDENTIFIER '=' input = userInput #InputVar
            ;

println: 'println(' txt=STRING '+' varName=IDENTIFIER ')' #PrintStatementAndVariable
         | 'println(' argument=expression ')' #simplePrintStatement 
         ;

print: 'print(' argument=expression ')' ;

branch: 'if' '(' condition= expression ')' onTrue=block 'else' onFalse=block ;

do_while : 'do' loop=block 'while' '(' condition= expression ')';

while_statement: 'while' '(' condition = expression ')' loopCondition= block;

block: '{'statement* '}';

userInput: 'UserInputReader.readInt()';

NUM: [0-9]+;

NEWLINE : [\r\n]+ ;

IDENTIFIER: [a-zA-Z][a-zA-Z0-9]*;

WHITESPACE: [ \t\n\r]+ -> skip;

STRING: '"' .*? '"';