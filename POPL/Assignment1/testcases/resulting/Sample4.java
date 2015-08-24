class Sample4 { public static void main ( String[] micro_a) {
new new_Sample4().print();
}
}
class new_Sample4 {
public void print() {
micro_Test variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Test();
variable2 = new extra_int();
variable1.micro_test(42, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Test {
public void micro_test(int variable4, extra_int return_value) {
int micro_a;
boolean micro_test;
micro_Test1 micro_test1;
int micro_ret;
int micro_sum1;
boolean micro_foo;
micro_Test1 variable5;
extra_boolean variable6;
boolean variable7;
micro_Test1 variable8;
extra_int variable9;
int variable10;
micro_a = variable4;
micro_test = false;
micro_test1 = new micro_Test1();
variable5 = micro_test1;
variable6 = new extra_boolean();
variable5.micro_init(variable6);
variable7 = variable6.first;
micro_foo = variable7;
variable8 = micro_test1;
variable9 = new extra_int();
variable8.micro_sum(variable9);
variable10 = variable9.first;
micro_sum1 = variable10;
if(micro_a<micro_sum1){
micro_test = false;
}
else {
if(micro_sum1<micro_a){
micro_test = false;
}
else {
micro_test = true;
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
}
class micro_Test1 {
int[] micro_c;
public void micro_init(extra_boolean return_value) {
micro_c = new int[5];
micro_c[0] = 1;
micro_c[1] = 2;
micro_c[2] = 3;
micro_c[3] = 2;
micro_c[4] = 1;
return_value.first = true;
}
public void micro_sum(extra_int return_value) {
int micro_i;
boolean micro_found;
int micro_j;
int micro_sum;
int[] variable11;
variable11 = micro_c;
micro_j = variable11.length;
micro_i = 0;
micro_sum = 0;
micro_found = false;
while(micro_i<(micro_j)){
{
micro_sum = micro_sum+(micro_c[micro_i]);
micro_i = micro_i+1;
}
}
return_value.first = micro_sum;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Test { micro_Test first;}
class extra_micro_Test1 { micro_Test1 first;}

