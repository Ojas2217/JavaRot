grammar JavaRot;

program : statement+;
statement : let;

let : VAR '=' INT ;git


VAR : [a-z]+ ;
INT : [0–9]+ ;
WS : [ \n\t]+ -> skip;