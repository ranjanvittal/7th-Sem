class mytest3 { public static void main ( String[] micro_a) {
new new_mytest3().print();
}
}
class new_mytest3 {
public void print() {
micro_MyStarter3 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_MyStarter3();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_MyInt3 {
int micro_first;
public void micro_my_first(extra_int return_value) {
return_value.first = micro_first;
}
public void micro_assign_int(int micro_val, extra_boolean return_value) {
micro_first = micro_val;
return_value.first = true;
}
}
class micro_MyStarter3 {
public void micro_start(extra_int return_value) {
micro_MyInt3 micro_num;
micro_MyInt3 micro_accumulator;
boolean micro_b;
micro_MyInt3 variable4;
extra_boolean variable5;
boolean variable6;
micro_MyInt3 variable7;
extra_boolean variable8;
boolean variable9;
micro_MyFac3 variable10;
extra_boolean variable11;
boolean variable12;
micro_MyInt3 variable13;
extra_int variable14;
int variable15;
micro_num = new micro_MyInt3();
micro_accumulator = new micro_MyInt3();
variable4 = micro_accumulator;
variable5 = new extra_boolean();
variable4.micro_assign_int(1, variable5);
variable6 = variable5.first;
micro_b = variable6;
variable7 = micro_num;
variable8 = new extra_boolean();
variable7.micro_assign_int(10, variable8);
variable9 = variable8.first;
micro_b = variable9;
variable10 = new micro_MyFac3();
variable11 = new extra_boolean();
variable10.micro_ComputeFac(micro_num,  micro_accumulator, variable11);
variable12 = variable11.first;
micro_b = variable12;
variable13 = micro_accumulator;
variable14 = new extra_int();
variable13.micro_my_first(variable14);
variable15 = variable14.first;
return_value.first = variable15;
}
}
class micro_MyFac3 {
public void micro_ComputeFac(micro_MyInt3 micro_num, micro_MyInt3 micro_accumulator, extra_boolean return_value) {
int micro_num_aux;
boolean micro_b;
micro_MyInt3 variable16;
micro_MyInt3 variable17;
extra_int variable18;
int variable19;
micro_MyInt3 variable20;
extra_int variable21;
int variable22;
extra_boolean variable23;
boolean variable24;
micro_MyInt3 variable25;
micro_MyInt3 variable26;
extra_int variable27;
int variable28;
extra_boolean variable29;
boolean variable30;
micro_MyInt3 variable31;
extra_int variable32;
int variable33;
micro_MyFac3 variable34;
extra_boolean variable35;
boolean variable36;
variable16 = micro_accumulator;
variable17 = micro_accumulator;
variable18 = new extra_int();
variable17.micro_my_first(variable18);
variable19 = variable18.first;
variable20 = micro_num;
variable21 = new extra_int();
variable20.micro_my_first(variable21);
variable22 = variable21.first;
variable23 = new extra_boolean();
variable16.micro_assign_int((variable19)*(variable22), variable23);
variable24 = variable23.first;
micro_b = variable24;
variable25 = micro_num;
variable26 = micro_num;
variable27 = new extra_int();
variable26.micro_my_first(variable27);
variable28 = variable27.first;
variable29 = new extra_boolean();
variable25.micro_assign_int((variable28)-1, variable29);
variable30 = variable29.first;
micro_b = variable30;
variable31 = micro_num;
variable32 = new extra_int();
variable31.micro_my_first(variable32);
variable33 = variable32.first;
if((variable33)<1){
micro_b = true;
}
else {
variable34 = this;
variable35 = new extra_boolean();
variable34.micro_ComputeFac(micro_num,  micro_accumulator, variable35);
variable36 = variable35.first;
micro_b = (variable36);
}
return_value.first = micro_b;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_MyInt3 { micro_MyInt3 first;}
class extra_micro_MyStarter3 { micro_MyStarter3 first;}
class extra_micro_MyFac3 { micro_MyFac3 first;}

