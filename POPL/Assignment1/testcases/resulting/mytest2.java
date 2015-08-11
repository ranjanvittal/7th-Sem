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
public void micro_assign_int(int micro_val, extra_boolean return_value) {
micro_first = micro_val;
return_value.first = true;
}
}
class micro_MyStarter2 {
public void micro_start(extra_int return_value) {
micro_MyInt2 micro_num;
micro_MyInt2 micro_accumulator;
boolean micro_b;
micro_MyInt2 variable4;
extra_boolean variable5;
boolean variable6;
micro_MyFac2 variable7;
extra_micro_MyInt2 variable8;
micro_MyInt2 variable9;
micro_MyInt2 variable10;
extra_int variable11;
int variable12;
micro_num = new micro_MyInt2();
micro_accumulator = new micro_MyInt2();
variable4 = micro_num;
variable5 = new extra_boolean();
variable4.micro_assign_int(10, variable5);
variable6 = variable5.first;
micro_b = variable6;
variable7 = new micro_MyFac2();
variable8 = new extra_micro_MyInt2();
variable7.micro_ComputeFac(micro_num,  micro_accumulator, variable8);
variable9 = variable8.first;
variable10 = (variable9);
variable11 = new extra_int();
variable10.micro_my_first(variable11);
variable12 = variable11.first;
return_value.first = variable12;
}
}
class micro_MyFac2 {
public void micro_ComputeFac(micro_MyInt2 micro_num, micro_MyInt2 micro_accumulator, extra_micro_MyInt2 return_value) {
int micro_num_aux;
boolean micro_b;
micro_MyInt2 variable13;
extra_boolean variable14;
boolean variable15;
micro_MyInt2 variable16;
extra_int variable17;
int variable18;
micro_MyInt2 variable19;
micro_MyInt2 variable20;
extra_int variable21;
int variable22;
extra_boolean variable23;
boolean variable24;
variable13 = micro_accumulator;
variable14 = new extra_boolean();
variable13.micro_assign_int(1, variable14);
variable15 = variable14.first;
micro_b = variable15;
micro_num_aux = 1;
variable16 = micro_num;
variable17 = new extra_int();
variable16.micro_my_first(variable17);
variable18 = variable17.first;
while(micro_num_aux<((variable18)+1)){
{
variable19 = micro_accumulator;
variable20 = micro_accumulator;
variable21 = new extra_int();
variable20.micro_my_first(variable21);
variable22 = variable21.first;
variable23 = new extra_boolean();
variable19.micro_assign_int((variable22)*(micro_num_aux), variable23);
variable24 = variable23.first;
micro_b = variable24;
micro_num_aux = micro_num_aux+1;
}
variable16 = micro_num;
variable17 = new extra_int();
variable16.micro_my_first(variable17);
variable18 = variable17.first;
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

