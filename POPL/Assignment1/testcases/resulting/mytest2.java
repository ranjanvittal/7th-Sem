class mytest2 { public static void main ( String[] micro_a) {
new new_mytest2().print();
}
}
class new_mytest2 {
public void print() {
micro_MyStarter2 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_MyStarter2();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_MyInt2 {
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
class micro_MyStarter2 {
public void micro_start(extra_int return_value) {
micro_MyInt2 micro_num;
micro_MyInt2 micro_accumulator;
boolean micro_b;
micro_MyInt2 variable5;
extra_boolean variable6;
boolean variable7;
micro_MyFac2 variable8;
extra_micro_MyInt2 variable9;
micro_MyInt2 variable10;
micro_MyInt2 variable11;
extra_int variable12;
int variable13;
micro_num = new micro_MyInt2();
micro_accumulator = new micro_MyInt2();
variable5 = micro_num;
variable6 = new extra_boolean();
variable5.micro_assign_int(10, variable6);
variable7 = variable6.first;
micro_b = variable7;
variable8 = new micro_MyFac2();
variable9 = new extra_micro_MyInt2();
variable8.micro_ComputeFac(micro_num,  micro_accumulator, variable9);
variable10 = variable9.first;
variable11 = (variable10);
variable12 = new extra_int();
variable11.micro_my_first(variable12);
variable13 = variable12.first;
return_value.first = variable13;
}
}
class micro_MyFac2 {
public void micro_ComputeFac(micro_MyInt2 variable14, micro_MyInt2 variable15, extra_micro_MyInt2 return_value) {
micro_MyInt2 micro_num;
micro_MyInt2 micro_accumulator;
int micro_num_aux;
boolean micro_b;
micro_MyInt2 variable16;
extra_boolean variable17;
boolean variable18;
micro_MyInt2 variable19;
extra_int variable20;
int variable21;
micro_MyInt2 variable22;
micro_MyInt2 variable23;
extra_int variable24;
int variable25;
extra_boolean variable26;
boolean variable27;
micro_num = variable14;
micro_accumulator = variable15;
variable16 = micro_accumulator;
variable17 = new extra_boolean();
variable16.micro_assign_int(1, variable17);
variable18 = variable17.first;
micro_b = variable18;
micro_num_aux = 1;
variable19 = micro_num;
variable20 = new extra_int();
variable19.micro_my_first(variable20);
variable21 = variable20.first;
while(micro_num_aux<((variable21)+1)){
{
variable22 = micro_accumulator;
variable23 = micro_accumulator;
variable24 = new extra_int();
variable23.micro_my_first(variable24);
variable25 = variable24.first;
variable26 = new extra_boolean();
variable22.micro_assign_int((variable25)*(micro_num_aux), variable26);
variable27 = variable26.first;
micro_b = variable27;
micro_num_aux = micro_num_aux+1;
}
variable19 = micro_num;
variable20 = new extra_int();
variable19.micro_my_first(variable20);
variable21 = variable20.first;
}
return_value.first = micro_accumulator;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_MyInt2 { micro_MyInt2 first;}
class extra_micro_MyStarter2 { micro_MyStarter2 first;}
class extra_micro_MyFac2 { micro_MyFac2 first;}

