class Fibonacci1 { public static void main ( String[] micro_a) {
new new_Fibonacci1().print();
}
}
class new_Fibonacci1 {
public void print() {
micro_Fib variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Fib();
variable2 = new extra_int();
variable1.micro_ComputeFib(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Fib {
public void micro_ComputeFib(int variable4, extra_int return_value) {
int micro_fibCount;
int micro_i;
int micro_first;
int micro_second;
int micro_temp;
micro_fibCount = variable4;
micro_i = 2;
micro_first = 1;
micro_second = 2;
if(micro_fibCount<2){
{
System.out.println(micro_fibCount);
}
}
else {
if(micro_fibCount<3){
{
System.out.println(micro_first);
System.out.println(micro_second);
}
}
else {
{
System.out.println(micro_first);
System.out.println(micro_second);
while(micro_i<micro_fibCount){
{
micro_temp = micro_first+micro_second;
micro_first = micro_second;
micro_second = micro_temp;
System.out.println(micro_second);
micro_i = micro_i+1;
}
}
}
}
}
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Fib { micro_Fib first;}

