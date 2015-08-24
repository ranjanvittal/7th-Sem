class Stack { public static void main ( String[] micro_a) {
new new_Stack().print();
}
}
class new_Stack {
public void print() {
micro_S variable1;
extra_int variable2;
int variable3;
variable1 = new micro_S();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_S {
int[] micro_a;
int micro_top;
public void micro_init(extra_int return_value) {
micro_a = new int[10];
micro_top = 0;
return_value.first = 0;
}
public void micro_push(int variable4, extra_int return_value) {
int micro_val;
micro_val = variable4;
micro_top = micro_top+1;
micro_a[micro_top] = micro_val;
return_value.first = 0;
}
public void micro_pop(extra_int return_value) {
int micro_temp;
micro_temp = micro_a[micro_top];
micro_top = micro_top-1;
return_value.first = micro_temp;
}
public void micro_Start(extra_int return_value) {
int micro_ret;
micro_S variable5;
extra_int variable6;
int variable7;
micro_S variable8;
extra_int variable9;
int variable10;
micro_S variable11;
extra_int variable12;
int variable13;
micro_S variable14;
extra_int variable15;
int variable16;
micro_S variable17;
extra_int variable18;
int variable19;
variable5 = this;
variable6 = new extra_int();
variable5.micro_init(variable6);
variable7 = variable6.first;
micro_ret = variable7;
variable8 = this;
variable9 = new extra_int();
variable8.micro_push(10, variable9);
variable10 = variable9.first;
micro_ret = variable10;
variable11 = this;
variable12 = new extra_int();
variable11.micro_push(1, variable12);
variable13 = variable12.first;
micro_ret = variable13;
variable14 = this;
variable15 = new extra_int();
variable14.micro_push(20, variable15);
variable16 = variable15.first;
micro_ret = variable16;
variable17 = this;
variable18 = new extra_int();
variable17.micro_pop(variable18);
variable19 = variable18.first;
micro_ret = variable19;
return_value.first = micro_ret;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_S { micro_S first;}

