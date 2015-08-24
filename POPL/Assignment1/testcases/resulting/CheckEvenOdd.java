class CheckEvenOdd { public static void main ( String[] micro_a) {
new new_CheckEvenOdd().print();
}
}
class new_CheckEvenOdd {
public void print() {
micro_EO variable1;
extra_int variable2;
int variable3;
variable1 = new micro_EO();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_EO {
public void micro_start(extra_int return_value) {
micro_EO variable4;
extra_boolean variable5;
boolean variable6;
micro_EO variable7;
extra_boolean variable8;
boolean variable9;
micro_EO variable10;
extra_boolean variable11;
boolean variable12;
micro_EO variable13;
extra_boolean variable14;
boolean variable15;
micro_EO variable16;
extra_boolean variable17;
boolean variable18;
micro_EO variable19;
extra_boolean variable20;
boolean variable21;
micro_EO variable22;
extra_boolean variable23;
boolean variable24;
micro_EO variable25;
extra_boolean variable26;
boolean variable27;
variable4 = this;
variable5 = new extra_boolean();
variable4.micro_check(8, variable5);
variable6 = variable5.first;
if(variable6){
System.out.println(1);
}
else {
System.out.println(0);
}
variable7 = this;
variable8 = new extra_boolean();
variable7.micro_check(19, variable8);
variable9 = variable8.first;
if(variable9){
System.out.println(1);
}
else {
System.out.println(0);
}
variable10 = this;
variable11 = new extra_boolean();
variable10.micro_check(20, variable11);
variable12 = variable11.first;
if(variable12){
System.out.println(1);
}
else {
System.out.println(0);
}
variable13 = this;
variable14 = new extra_boolean();
variable13.micro_check(21, variable14);
variable15 = variable14.first;
if(variable15){
System.out.println(1);
}
else {
System.out.println(0);
}
variable16 = this;
variable17 = new extra_boolean();
variable16.micro_check(37, variable17);
variable18 = variable17.first;
if(variable18){
System.out.println(1);
}
else {
System.out.println(0);
}
variable19 = this;
variable20 = new extra_boolean();
variable19.micro_check(38, variable20);
variable21 = variable20.first;
if(variable21){
System.out.println(1);
}
else {
System.out.println(0);
}
variable22 = this;
variable23 = new extra_boolean();
variable22.micro_check(39, variable23);
variable24 = variable23.first;
if(variable24){
System.out.println(1);
}
else {
System.out.println(0);
}
variable25 = this;
variable26 = new extra_boolean();
variable25.micro_check(50, variable26);
variable27 = variable26.first;
if(variable27){
System.out.println(1);
}
else {
System.out.println(0);
}
return_value.first = 0;
}
public void micro_check(int variable28, extra_boolean return_value) {
int micro_num;
boolean micro_bs01;
int micro_count01;
int micro_count02;
int micro_aux01;
int micro_aux02;
micro_EO variable29;
extra_boolean variable30;
boolean variable31;
micro_num = variable28;
micro_count01 = 0;
micro_count02 = 0;
micro_aux01 = micro_num-1;
while(micro_count02<micro_aux01){
{
micro_count01 = micro_count01+1;
micro_count02 = micro_count02+2;
}
}
micro_aux02 = micro_count01*2;
variable29 = this;
variable30 = new extra_boolean();
variable29.micro_compare(micro_aux02,  micro_num, variable30);
variable31 = variable30.first;
if(variable31){
micro_bs01 = true;
}
else {
micro_bs01 = false;
}
return_value.first = micro_bs01;
}
public void micro_compare(int variable32, int variable33, extra_boolean return_value) {
int micro_num1;
int micro_num2;
boolean micro_retval;
int micro_aux03;
micro_num1 = variable32;
micro_num2 = variable33;
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
class extra_micro_EO { micro_EO first;}

