class MoreThan4 { public static void main ( String[] micro_a) {
new new_MoreThan4().print();
}
}
class new_MoreThan4 {
public void print() {
micro_MT4 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_MT4();
variable2 = new extra_int();
variable1.micro_Start(1,  2,  3,  4,  5,  6, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_MT4 {
public void micro_Start(int variable4, int variable5, int variable6, int variable7, int variable8, int variable9, extra_int return_value) {
int micro_p1;
int micro_p2;
int micro_p3;
int micro_p4;
int micro_p5;
int micro_p6;
int micro_aux;
micro_MT4 variable10;
extra_int variable11;
int variable12;
micro_p1 = variable4;
micro_p2 = variable5;
micro_p3 = variable6;
micro_p4 = variable7;
micro_p5 = variable8;
micro_p6 = variable9;
System.out.println(micro_p1);
System.out.println(micro_p2);
System.out.println(micro_p3);
System.out.println(micro_p4);
System.out.println(micro_p5);
System.out.println(micro_p6);
variable10 = this;
variable11 = new extra_int();
variable10.micro_Change(micro_p6,  micro_p5,  micro_p4,  micro_p3,  micro_p2,  micro_p1, variable11);
variable12 = variable11.first;
micro_aux = variable12;
return_value.first = micro_aux;
}
public void micro_Change(int variable13, int variable14, int variable15, int variable16, int variable17, int variable18, extra_int return_value) {
int micro_p1;
int micro_p2;
int micro_p3;
int micro_p4;
int micro_p5;
int micro_p6;
micro_p1 = variable13;
micro_p2 = variable14;
micro_p3 = variable15;
micro_p4 = variable16;
micro_p5 = variable17;
micro_p6 = variable18;
System.out.println(micro_p1);
System.out.println(micro_p2);
System.out.println(micro_p3);
System.out.println(micro_p4);
System.out.println(micro_p5);
System.out.println(micro_p6);
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_MT4 { micro_MT4 first;}

