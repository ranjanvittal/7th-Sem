class Sample5 { public static void main ( String[] micro_a) {
new new_Sample5().print();
}
}
class new_Sample5 {
public void print() {
micro_Test variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Test();
variable2 = new extra_int();
variable1.micro_test(7, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Test {
public void micro_test(int variable4, extra_int return_value) {
int micro_a;
boolean micro_test;
int micro_ret;
int micro_temp;
int micro_divRes;
boolean micro_foo;
int micro_i;
micro_Test variable5;
extra_int variable6;
int variable7;
micro_a = variable4;
micro_test = true;
micro_i = 2;
while(micro_i<micro_a){
{
variable5 = this;
variable6 = new extra_int();
variable5.micro_div(micro_a,  micro_i, variable6);
variable7 = variable6.first;
micro_divRes = variable7;
micro_temp = (micro_divRes*micro_i);
if(micro_a<micro_temp){
micro_test = micro_test&true;
}
else {
if(micro_temp<micro_a){
micro_test = micro_test&true;
}
else {
micro_test = micro_test&false;
}
}
micro_i = micro_i+1;
}
}
if(micro_test){
micro_ret = 1;
}
else {
micro_ret = 0;
}
return_value.first = micro_ret;
}
public void micro_div(int variable8, int variable9, extra_int return_value) {
int micro_a;
int micro_b;
int micro_i;
int micro_ret;
int micro_test;
boolean micro_tmp;
micro_a = variable8;
micro_b = variable9;
micro_i = 1;
micro_ret = 1;
if(micro_a<micro_b){
micro_ret = 0;
}
else {
{
micro_tmp = false;
while(!micro_tmp){
{
micro_test = micro_b*micro_i;
if(micro_test<micro_a){
micro_tmp = false;
}
else {
if(micro_a<micro_test){
{
micro_tmp = true;
micro_ret = micro_i-1;
}
}
else {
{
micro_tmp = true;
micro_ret = micro_i;
}
}
}
micro_i = micro_i+1;
}
}
}
}
return_value.first = micro_ret;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Test { micro_Test first;}

