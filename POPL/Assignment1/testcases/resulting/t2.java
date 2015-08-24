class t2 { public static void main ( String[] micro_a) {
new new_t2().print();
}
}
class new_t2 {
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
int micro_i;
micro_myClass2 variable4;
extra_int variable5;
int variable6;
variable4 = this;
variable5 = new extra_int();
variable4.micro_f2(variable5);
variable6 = variable5.first;
micro_i = variable6;
return_value.first = micro_i;
}
public void micro_f2(extra_int return_value) {
int micro_j;
micro_myClass2 variable7;
extra_int variable8;
int variable9;
variable7 = this;
variable8 = new extra_int();
variable7.micro_f1(variable8);
variable9 = variable8.first;
micro_j = variable9;
return_value.first = micro_j;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_myClass2 { micro_myClass2 first;}

