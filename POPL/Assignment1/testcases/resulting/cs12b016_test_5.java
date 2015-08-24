class cs12b016_test_5 { public static void main ( String[] micro_a) {
new new_cs12b016_test_5().print();
}
}
class new_cs12b016_test_5 {
public void print() {
micro_Random variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Random();
variable2 = new extra_int();
variable1.micro_Get(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Random {
public void micro_Get(int variable4, extra_int return_value) {
int micro_n;
micro_Random variable5;
extra_array variable6;
int[] variable7;
int[] variable8;
micro_n = variable4;
variable5 = this;
variable6 = new extra_array();
variable5.micro_Put((micro_n*micro_n), variable6);
variable7 = variable6.first;
variable8 = (variable7);
return_value.first = (variable8.length);
}
public void micro_Put(int variable9, extra_array return_value) {
int micro_n;
int micro_i;
int[] micro_arr;
micro_n = variable9;
micro_arr = new int[micro_n];
micro_i = 0;
while(micro_i<micro_n){
{
System.out.println(micro_i);
if(0<micro_i){
micro_arr[micro_i] = (micro_arr[(micro_i-1)])+(micro_i*micro_i);
}
else {
{
}
}
micro_i = micro_i+1;
}
}
return_value.first = micro_arr;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Random { micro_Random first;}

