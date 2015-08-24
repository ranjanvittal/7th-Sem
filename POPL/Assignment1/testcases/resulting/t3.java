class t3 { public static void main ( String[] micro_a) {
new new_t3().print();
}
}
class new_t3 {
public void print() {
micro_myClass2 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_myClass2();
variable2 = new extra_int();
variable1.micro_f1(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_myClass2 {
public void micro_f1(extra_int return_value) {
micro_myClass2 variable4;
micro_myClass2 variable5;
extra_int variable6;
int variable7;
extra_int variable8;
int variable9;
variable4 = this;
variable5 = this;
variable6 = new extra_int();
variable5.micro_f2(1, variable6);
variable7 = variable6.first;
variable8 = new extra_int();
variable4.micro_f2(variable7, variable8);
variable9 = variable8.first;
return_value.first = variable9;
}
public void micro_f2(int variable10, extra_int return_value) {
int micro_i;
micro_i = variable10;
return_value.first = micro_i+1;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_myClass2 { micro_myClass2 first;}

