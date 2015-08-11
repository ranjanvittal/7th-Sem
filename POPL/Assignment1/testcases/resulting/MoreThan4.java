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
public void micro_Start(int micro_p1, int micro_p2, int micro_p3, int micro_p4, int micro_p5, int micro_p6, extra_int return_value) {
int micro_aux;
micro_MT4 variable4;
extra_int variable5;
int variable6;
System.out.println(micro_p1);
System.out.println(micro_p2);
System.out.println(micro_p3);
System.out.println(micro_p4);
System.out.println(micro_p5);
System.out.println(micro_p6);
variable4 = this;
variable5 = new extra_int();
variable4.micro_Change(micro_p6,  micro_p5,  micro_p4,  micro_p3,  micro_p2,  micro_p1, variable5);
variable6 = variable5.first;
micro_aux = variable6;
return_value.first = micro_aux;
}
public void micro_Change(int micro_p1, int micro_p2, int micro_p3, int micro_p4, int micro_p5, int micro_p6, extra_int return_value) {
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

