grammar ccal;

program:				decl_list function_list main ;

// Non-Terminals
decl_list:				decl SEMI decl_list | empty ;

decl:					var_decl
						| const_decl
						;

var_decl:				VAR ID COLON type ;

const_decl:				CONST ID COLON type EQUALS expression ;

function_list:			function function_list
						| empty
						;

function:				type ID LBR parameter_list RBR
						LCB
						decl_list
						statement_block
						RETURN LBR expression | empty RBR SEMI
						RCB
						;

type:					INTEGER
						| BOOLEAN
						| VOID
						;

parameter_list:			nemp_parameter_list | empty ;

nemp_parameter_list:	ID COLON type
						| ID COLON type COMMA nemp_parameter_list
						;

main:					MAIN LCB
						decl_list
						statement_block
						RCB
						;

statement_block:		statement statement_block | empty ;

statement:				ID EQUALS expression SEMI
						| ID LBR arg_list RBR SEMI
						| LCB statement_block RCB
						| IF condition LCB statement_block RCB ELSE LCB statement_block RCB
						| WHILE condition LCB statement_block RCB
						| SKIPPING SEMI
						;

expression:				frag binary_arith_op frag
						| LBR expression RBR
						| ID LBR arg_list RBR
						| frag
						;

binary_arith_op:		PLUS | MINUS ;

frag:					ID | MINUS ID | NUMBER | TRUE | FALSE | LBR expression RBR ;

condition:				TILDE condition
						| LBR condition RBR
						| expression comp_op expression
						| condition ( OR | AND ) condition
						;

comp_op:				COMP | NOT | LESS_THAN | LESS_OR_EQUAL | GREATER_THAN | GREATER_OR_EQUAL ;

arg_list:				nemp_arg_list | empty ;

nemp_arg_list:			ID | ID COMMA nemp_arg_list ;

empty: 					;

// Fragments
fragment Digit: [0-9];
fragment LeadingDigit: [1-9];
fragment Letter: [a-zA-Z];
fragment Underscore: '_';

// Case Insensitivity
fragment A:	'a'|'A';
fragment B:	'b'|'B';
fragment C:	'c'|'C';
fragment D:	'd'|'D';
fragment E:	'e'|'E';
fragment F:	'f'|'F';
fragment G:	'g'|'G';
fragment H:	'h'|'H';
fragment I:	'i'|'I';
fragment J:	'j'|'J';
fragment K:	'k'|'K';
fragment L:	'l'|'L';
fragment M:	'm'|'M';
fragment N:	'n'|'N';
fragment O:	'o'|'O';
fragment P:	'p'|'P';
fragment Q:	'q'|'Q';
fragment R:	'r'|'R';
fragment S:	's'|'S';
fragment T:	't'|'T';
fragment U:	'u'|'U';
fragment V:	'v'|'V';
fragment W:	'w'|'W';
fragment X:	'x'|'X';
fragment Y:	'y'|'Y';
fragment Z:	'z'|'Z';

// Tokens
COMMA: ',';
SEMI: ';';
COLON: ':';
EQUALS: '=';
LCB: '{';
RCB: '}';
LBR: '(';
RBR: ')';
PLUS: '+';
MINUS: '-';
TILDE: '~';
OR: '||';
AND: '&&';
COMP: '==';
NOT: '!=';
LESS_THAN: '<';
LESS_OR_EQUAL: '<=';
GREATER_THAN: '>';
GREATER_OR_EQUAL: '>=';

// Reserved Words
VAR:		V A R;
CONST:		C O N S T;
RETURN:		R E T U R N;
INTEGER: 	I N T E G E R;
BOOLEAN:	B O O L E A N;
VOID: 		V O I D;
MAIN:		M A I N;
IF:			I F;
ELSE:		E L S E;
TRUE:		T R U E;
FALSE:		F A L S E;
WHILE:		W H I L E;
SKIPPING:	S K I P;

// Additional Tokens
ID: Letter (Letter | Digit | Underscore)*;
NUMBER: Digit | MINUS? LeadingDigit Digit*;

// Comments
SINGLE_LINE_COMM: '//' .*? '\n' -> skip;
MULTI_LINE_COMM: '/*' (MULTI_LINE_COMM | .)*? '*/' -> skip;

// Whitespace
WS: [ \t\r\n]+ -> skip;

