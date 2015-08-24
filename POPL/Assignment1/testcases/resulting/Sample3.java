class Sample3 { public static void main ( String[] micro_a) {
new new_Sample3().print();
}
}
class new_Sample3 {
public void print() {
micro_Test variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Test();
variable2 = new extra_int();
variable1.micro_test(42,  21, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Test {
public void micro_test(int variable4, int variable5, extra_int return_value) {
int micro_a;
int micro_b;
boolean micro_test;
micro_Test1 micro_test1;
int micro_ret;
boolean micro_foo;
micro_Test1 variable6;
extra_boolean variable7;
boolean variable8;
micro_Test1 variable9;
extra_boolean variable10;
boolean variable11;
micro_a = variable4;
micro_b = variable5;
micro_test = false;
micro_test1 = new micro_Test1();
variable6 = micro_test1;
variable7 = new extra_boolean();
variable6.micro_init(variable7);
variable8 = variable7.first;
micro_foo = variable8;
variable9 = micro_test1;
variable10 = new extra_boolean();
variable9.micro_isInC(micro_a, variable10);
variable11 = variable10.first;
micro_test = variable11;
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
micro_c[3] = 4;
micro_c[4] = 5;
return_value.first = true;
}
public void micro_isInC(int variable12, extra_boolean return_value) {
int micro_d;
int micro_i;
boolean micro_found;
int micro_j;
int[] variable13;
micro_d = variable12;
variable13 = micro_c;
micro_j = variable13.length;
micro_i = 0;
micro_found = false;
while(micro_i<(micro_j)){
{
if(!micro_found){
{
if(micro_d<(micro_c[micro_i])){
micro_found = false;
}
else {
if((micro_c[micro_i])<micro_d){
micro_found = false;
}
else {
micro_found = true;
}
}
}
}
else {
micro_found = true;
}
micro_i = micro_i+1;
}
}
return_value.first = micro_found;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Test { micro_Test first;}
class extra_micro_Test1 { micro_Test1 first;}

