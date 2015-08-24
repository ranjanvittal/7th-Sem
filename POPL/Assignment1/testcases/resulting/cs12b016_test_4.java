class cs12b016_test_4 { public static void main ( String[] micro_a) {
new new_cs12b016_test_4().print();
}
}
class new_cs12b016_test_4 {
public void print() {
micro_Successor variable1;
micro_Predecessor variable2;
micro_Successor variable3;
extra_int variable4;
int variable5;
extra_int variable6;
int variable7;
extra_int variable8;
int variable9;
variable1 = new micro_Successor();
variable2 = new micro_Predecessor();
variable3 = new micro_Successor();
variable4 = new extra_int();
variable3.micro_Get(10, variable4);
variable5 = variable4.first;
variable6 = new extra_int();
variable2.micro_Get(variable5, variable6);
variable7 = variable6.first;
variable8 = new extra_int();
variable1.micro_Get(variable7, variable8);
variable9 = variable8.first;
System.out.println(variable9);
}
}
class micro_Successor {
public void micro_Get(int variable10, extra_int return_value) {
int micro_n;
micro_n = variable10;
return_value.first = (micro_n+1);
}
}
class micro_Predecessor {
public void micro_Get(int variable11, extra_int return_value) {
int micro_n;
micro_n = variable11;
return_value.first = (micro_n-1);
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Successor { micro_Successor first;}
class extra_micro_Predecessor { micro_Predecessor first;}

