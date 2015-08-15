class mytest6 { public static void main ( String[] micro_a) {
new new_mytest6().print();
}
}
class new_mytest6 {
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
public void micro_assign_int(int variable4, extra_boolean return_value) {
int micro_val;
micro_val = variable4;
micro_first = micro_val;
return_value.first = true;
}
}
class micro_MyStarter {
public void micro_start(extra_int return_value) {
micro_MyInt micro_a;
boolean micro_b;
micro_MyInt variable5;
extra_boolean variable6;
boolean variable7;
micro_MyFac variable8;
extra_int variable9;
int variable10;
micro_a = new micro_MyInt();
variable5 = micro_a;
variable6 = new extra_boolean();
variable5.micro_assign_int(10, variable6);
variable7 = variable6.first;
micro_b = variable7;
variable8 = new micro_MyFac();
variable9 = new extra_int();
variable8.micro_ComputeFac(micro_a, variable9);
variable10 = variable9.first;
return_value.first = variable10;
}
}
class micro_A {
boolean micro_fi;
public void micro_get_fi(extra_boolean return_value) {
return_value.first = micro_fi;
}
public void micro_set_fi(boolean variable11, extra_boolean return_value) {
boolean micro_a;
micro_a = variable11;
micro_fi = micro_a;
return_value.first = true;
}
}
class micro_MyFac {
public void micro_ComputeFac(micro_MyInt variable12, extra_int return_value) {
micro_MyInt micro_num;
int micro_num_aux;
int micro_accumulator;
micro_A micro_a;
boolean micro_t;
micro_A variable13;
extra_boolean variable14;
boolean variable15;
micro_MyInt variable16;
extra_int variable17;
int variable18;
micro_A variable19;
extra_boolean variable20;
boolean variable21;
micro_A variable22;
extra_boolean variable23;
boolean variable24;
micro_num = variable12;
micro_accumulator = 1;
micro_num_aux = 1;
micro_a = new micro_A();
variable13 = micro_a;
variable14 = new extra_boolean();
variable13.micro_set_fi(true, variable14);
variable15 = variable14.first;
micro_t = variable15;
variable16 = micro_num;
variable17 = new extra_int();
variable16.micro_my_first(variable17);
variable18 = variable17.first;
while(micro_num_aux<((variable18)+1)){
{
micro_accumulator = (micro_accumulator*micro_num_aux);
micro_num_aux = micro_num_aux+1;
}
variable16 = micro_num;
variable17 = new extra_int();
variable16.micro_my_first(variable17);
variable18 = variable17.first;
}
variable19 = (micro_a);
variable20 = new extra_boolean();
variable19.micro_get_fi(variable20);
variable21 = variable20.first;
while(variable21){
{
micro_a = new micro_A();
variable22 = micro_a;
variable23 = new extra_boolean();
variable22.micro_set_fi(false, variable23);
variable24 = variable23.first;
micro_t = variable24;
}
variable19 = (micro_a);
variable20 = new extra_boolean();
variable19.micro_get_fi(variable20);
variable21 = variable20.first;
}
return_value.first = micro_accumulator;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_MyInt { micro_MyInt first;}
class extra_micro_MyStarter { micro_MyStarter first;}
class extra_micro_A { micro_A first;}
class extra_micro_MyFac { micro_MyFac first;}

