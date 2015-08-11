class mytest1 { public static void main ( String[] micro_a) {
new new_mytest1().print();
}
}
class new_mytest1 {
public void print() {
micro_MyStarter variable1;
extra_int variable2;
int variable3;
variable1 = new micro_MyStarter();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_MyInt {
int micro_first;
public void micro_my_first(extra_int return_value) {
return_value.first = micro_first;
}
public void micro_assign_int(int micro_val, extra_boolean return_value) {
micro_first = micro_val;
return_value.first = true;
}
}
class micro_MyStarter {
public void micro_start(extra_int return_value) {
micro_MyInt micro_a;
boolean micro_b;
micro_MyInt variable4;
extra_boolean variable5;
boolean variable6;
micro_MyFac variable7;
extra_int variable8;
int variable9;
micro_a = new micro_MyInt();
variable4 = micro_a;
variable5 = new extra_boolean();
variable4.micro_assign_int(10, variable5);
variable6 = variable5.first;
micro_b = variable6;
variable7 = new micro_MyFac();
variable8 = new extra_int();
variable7.micro_ComputeFac(micro_a, variable8);
variable9 = variable8.first;
return_value.first = variable9;
}
}
class micro_MyFac {
public void micro_ComputeFac(micro_MyInt micro_num, extra_int return_value) {
int micro_num_aux;
int micro_accumulator;
micro_MyInt variable10;
extra_int variable11;
int variable12;
micro_accumulator = 1;
micro_num_aux = 1;
variable10 = micro_num;
variable11 = new extra_int();
variable10.micro_my_first(variable11);
variable12 = variable11.first;
while(micro_num_aux<((variable12)+1)){
{
micro_accumulator = (micro_accumulator*micro_num_aux);
micro_num_aux = micro_num_aux+1;
}
variable10 = micro_num;
variable11 = new extra_int();
variable10.micro_my_first(variable11);
variable12 = variable11.first;
}
return_value.first = micro_accumulator;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_MyInt { micro_MyInt first;}
class extra_micro_MyStarter { micro_MyStarter first;}
class extra_micro_MyFac { micro_MyFac first;}

