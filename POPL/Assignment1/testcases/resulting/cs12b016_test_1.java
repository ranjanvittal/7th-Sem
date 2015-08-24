class cs12b016_test_1 { public static void main ( String[] micro_a) {
new new_cs12b016_test_1().print();
}
}
class new_cs12b016_test_1 {
public void print() {
micro_Fibonacci variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Fibonacci();
variable2 = new extra_int();
variable1.micro_Get(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Fibonacci {
public void micro_Get(int variable4, extra_int return_value) {
int micro_n;
int micro_a;
int micro_b;
int micro_ans;
int micro_tmp;
micro_n = variable4;
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
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Fibonacci { micro_Fibonacci first;}

