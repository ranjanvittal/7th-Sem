class Fibonacci { public static void main ( String[] micro_a) {
new new_Fibonacci().print();
}
}
class new_Fibonacci {
public void print() {
micro_Fib variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Fib();
variable2 = new extra_int();
variable1.micro_computeFib(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Fib {
public void micro_computeFib(int variable4, extra_int return_value) {
int micro_num;
int micro_num_aux;
int micro_aux01;
int micro_aux02;
micro_Fib variable5;
extra_boolean variable6;
boolean variable7;
micro_Fib variable8;
extra_boolean variable9;
boolean variable10;
micro_Fib variable11;
extra_int variable12;
int variable13;
micro_Fib variable14;
extra_int variable15;
int variable16;
micro_num = variable4;
micro_aux01 = 0;
micro_aux02 = 1;
variable5 = this;
variable6 = new extra_boolean();
variable5.micro_compare(micro_aux01,  micro_num, variable6);
variable7 = variable6.first;
if(variable7){
micro_num_aux = 0;
}
else {
variable8 = this;
variable9 = new extra_boolean();
variable8.micro_compare(micro_aux02,  micro_num, variable9);
variable10 = variable9.first;
if(variable10){
micro_num_aux = 1;
}
else {
variable11 = this;
variable12 = new extra_int();
variable11.micro_computeFib(micro_num-1, variable12);
variable13 = variable12.first;
variable14 = this;
variable15 = new extra_int();
variable14.micro_computeFib(micro_num-2, variable15);
variable16 = variable15.first;
micro_num_aux = (variable13)+(variable16);
}
}
return_value.first = micro_num_aux;
}
public void micro_compare(int variable17, int variable18, extra_boolean return_value) {
int micro_num1;
int micro_num2;
boolean micro_retval;
int micro_aux03;
micro_num1 = variable17;
micro_num2 = variable18;
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
class extra_micro_Fib { micro_Fib first;}

