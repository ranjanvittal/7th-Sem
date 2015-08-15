class mytest4 { public static void main ( String[] micro_a) {
new new_mytest4().print();
}
}
class new_mytest4 {
public void print() {
micro_MyStarter4 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_MyStarter4();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Random {
public void micro_return_itself(int[] variable4, extra_array return_value) {
int[] micro_a;
micro_a = variable4;
return_value.first = micro_a;
}
}
class micro_MyStarter4 {
public void micro_start(extra_int return_value) {
int[] micro_a;
boolean micro_b;
int micro_i;
micro_SumOfArray variable5;
extra_int variable6;
int variable7;
micro_a = new int[10];
micro_i = 0;
while(micro_i<10){
{
micro_a[micro_i] = micro_i;
micro_i = micro_i+1;
}
}
variable5 = new micro_SumOfArray();
variable6 = new extra_int();
variable5.micro_ComputeSum(micro_a, variable6);
variable7 = variable6.first;
return_value.first = variable7;
}
}
class micro_SumOfArray {
public void micro_ComputeSum(int[] variable8, extra_int return_value) {
int[] micro_a;
int micro_num_aux;
int micro_length1;
int micro_sum;
int micro_i;
boolean micro_b;
micro_Random variable9;
extra_array variable10;
int[] variable11;
int[] variable12;
micro_a = variable8;
micro_sum = 0;
micro_i = 0;
variable9 = new micro_Random();
variable10 = new extra_array();
variable9.micro_return_itself(micro_a, variable10);
variable11 = variable10.first;
variable12 = (variable11);
micro_length1 = variable12.length;
while(micro_i<micro_length1){
{
micro_sum = micro_sum+(micro_a[micro_i]);
micro_i = micro_i+1;
}
}
return_value.first = micro_sum;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Random { micro_Random first;}
class extra_micro_MyStarter4 { micro_MyStarter4 first;}
class extra_micro_SumOfArray { micro_SumOfArray first;}

