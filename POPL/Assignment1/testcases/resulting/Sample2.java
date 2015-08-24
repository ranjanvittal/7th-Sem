class Sample2 { public static void main ( String[] micro_a) {
new new_Sample2().print();
}
}
class new_Sample2 {
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
micro_a = variable4;
micro_b = variable5;
while(micro_b<micro_a){
{
micro_a = micro_a-1;
}
}
return_value.first = micro_a;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Test { micro_Test first;}

