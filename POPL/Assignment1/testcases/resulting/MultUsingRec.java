class MultUsingRec { public static void main ( String[] micro_a) {
new new_MultUsingRec().print();
}
}
class new_MultUsingRec {
public void print() {
micro_Multiply variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Multiply();
variable2 = new extra_int();
variable1.micro_computeMul(10,  20, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Multiply {
public void micro_computeMul(int variable4, int variable5, extra_int return_value) {
int micro_num1;
int micro_num2;
int micro_num_aux;
int micro_aux01;
int micro_aux02;
micro_Multiply variable6;
extra_boolean variable7;
boolean variable8;
micro_Multiply variable9;
extra_boolean variable10;
boolean variable11;
micro_Multiply variable12;
extra_boolean variable13;
boolean variable14;
micro_Multiply variable15;
extra_int variable16;
int variable17;
micro_num1 = variable4;
micro_num2 = variable5;
micro_aux01 = 0;
micro_aux02 = 1;
variable6 = this;
variable7 = new extra_boolean();
variable6.micro_compare(micro_aux01,  micro_num1, variable7);
variable8 = variable7.first;
if(variable8){
micro_num_aux = 0;
}
else {
variable9 = this;
variable10 = new extra_boolean();
variable9.micro_compare(micro_aux01,  micro_num2, variable10);
variable11 = variable10.first;
if(variable11){
micro_num_aux = 0;
}
else {
variable12 = this;
variable13 = new extra_boolean();
variable12.micro_compare(micro_aux02,  micro_num2, variable13);
variable14 = variable13.first;
if(variable14){
micro_num_aux = micro_num1;
}
else {
variable15 = this;
variable16 = new extra_int();
variable15.micro_computeMul(micro_num1,  micro_num2-1, variable16);
variable17 = variable16.first;
micro_num_aux = (variable17)+micro_num1;
}
}
}
return_value.first = micro_num_aux;
}
public void micro_compare(int variable18, int variable19, extra_boolean return_value) {
int micro_num1;
int micro_num2;
boolean micro_retval;
int micro_aux03;
micro_num1 = variable18;
micro_num2 = variable19;
micro_retval = false;
micro_aux03 = micro_num2+1;
if(micro_num1<micro_num2){
micro_retval = false;
}
else {
if(!(micro_num1<micro_aux03)){
micro_retval = false;
}
else {
micro_retval = true;
}
}
return_value.first = micro_retval;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Multiply { micro_Multiply first;}

