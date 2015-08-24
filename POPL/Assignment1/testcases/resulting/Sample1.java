class Sample1 { public static void main ( String[] micro_a) {
new new_Sample1().print();
}
}
class new_Sample1 {
public void print() {
micro_Test variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Test();
variable2 = new extra_int();
variable1.micro_Print(1, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Test {
public void micro_Print(int variable4, extra_int return_value) {
int micro_sz;
micro_sz = variable4;
return_value.first = 42;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Test { micro_Test first;}

