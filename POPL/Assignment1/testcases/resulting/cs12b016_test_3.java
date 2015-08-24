class cs12b016_test_3 { public static void main ( String[] micro_a) {
new new_cs12b016_test_3().print();
}
}
class new_cs12b016_test_3 {
public void print() {
micro_Fibonacci variable1;
micro_Fibonacci variable2;
extra_int variable3;
int variable4;
extra_int variable5;
int variable6;
variable1 = new micro_Fibonacci();
variable2 = new micro_Fibonacci();
variable3 = new extra_int();
variable2.micro_SmallestLargerFiboPosition(10, variable3);
variable4 = variable3.first;
variable5 = new extra_int();
variable1.micro_Get(variable4, variable5);
variable6 = variable5.first;
System.out.println(variable6);
}
}
class micro_Fibonacci {
public void micro_Get(int variable7, extra_int return_value) {
int micro_n;
int micro_a;
int micro_b;
int micro_ans;
int micro_tmp;
micro_n = variable7;
micro_a = 1;
micro_b = 1;
if(micro_n<3){
micro_ans = 1;
}
else {
{
}
}
while(2<micro_n){
{
micro_tmp = micro_b;
micro_b = micro_a+micro_b;
micro_a = micro_tmp;
micro_n = micro_n-1;
}
}
micro_ans = micro_b;
return_value.first = micro_ans;
}
public void micro_SmallestLargerFiboPosition(int variable8, extra_int return_value) {
int micro_n;
int micro_a;
int micro_b;
int micro_ans;
int micro_i;
int micro_tmp;
micro_n = variable8;
micro_a = 1;
micro_b = 1;
if(micro_n<1){
micro_ans = 1;
}
else {
{
micro_i = 2;
while(!(micro_n<micro_b)){
{
micro_tmp = micro_b;
micro_b = micro_a+micro_b;
micro_a = micro_tmp;
micro_i = micro_i+1;
}
}
micro_ans = micro_i;
}
}
return_value.first = micro_ans;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Fibonacci { micro_Fibonacci first;}

