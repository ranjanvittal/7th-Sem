class t1 { public static void main ( String[] micro_a) {
new new_t1().print();
}
}
class new_t1 {
public void print() {
micro_myClass2 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_myClass2();
variable2 = new extra_int();
variable1.micro_method(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_myClass2 {
public void micro_method(extra_int return_value) {
int micro_one;
int micro_two;
boolean micro_three;
micro_one = 1;
micro_two = 2;
micro_three = micro_two<micro_one;
return_value.first = 1;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_myClass2 { micro_myClass2 first;}

