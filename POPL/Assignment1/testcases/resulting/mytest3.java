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
public void micro_assign_int(int variable4, extra_boolean return_value) {
int micro_val;
micro_val = variable4;
micro_first = micro_val;
return_value.first = true;
}
}
class micro_MyStarter3 {
public void micro_start(extra_int return_value) {
micro_MyInt3 micro_num;
micro_MyInt3 micro_accumulator;
boolean micro_b;
micro_MyInt3 variable5;
extra_boolean variable6;
boolean variable7;
micro_MyInt3 variable8;
extra_boolean variable9;
boolean variable10;
micro_MyFac3 variable11;
extra_boolean variable12;
boolean variable13;
micro_MyInt3 variable14;
extra_int variable15;
int variable16;
micro_num = new micro_MyInt3();
micro_accumulator = new micro_MyInt3();
variable5 = micro_accumulator;
variable6 = new extra_boolean();
variable5.micro_assign_int(1, variable6);
variable7 = variable6.first;
micro_b = variable7;
variable8 = micro_num;
variable9 = new extra_boolean();
variable8.micro_assign_int(10, variable9);
variable10 = variable9.first;
micro_b = variable10;
variable11 = new micro_MyFac3();
variable12 = new extra_boolean();
variable11.micro_ComputeFac(micro_num,  micro_accumulator, variable12);
variable13 = variable12.first;
micro_b = variable13;
variable14 = micro_accumulator;
variable15 = new extra_int();
variable14.micro_my_first(variable15);
variable16 = variable15.first;
return_value.first = variable16;
}
}
class micro_MyFac3 {
public void micro_ComputeFac(micro_MyInt3 variable17, micro_MyInt3 variable18, extra_boolean return_value) {
micro_MyInt3 micro_num;
micro_MyInt3 micro_accumulator;
int micro_num_aux;
boolean micro_b;
micro_MyInt3 variable19;
micro_MyInt3 variable20;
extra_int variable21;
int variable22;
micro_MyInt3 variable23;
extra_int variable24;
int variable25;
extra_boolean variable26;
boolean variable27;
micro_MyInt3 variable28;
micro_MyInt3 variable29;
extra_int variable30;
int variable31;
extra_boolean variable32;
boolean variable33;
micro_MyInt3 variable34;
extra_int variable35;
int variable36;
micro_MyFac3 variable37;
extra_boolean variable38;
boolean variable39;
micro_num = variable17;
micro_accumulator = variable18;
variable19 = micro_accumulator;
variable20 = micro_accumulator;
variable21 = new extra_int();
variable20.micro_my_first(variable21);
variable22 = variable21.first;
variable23 = micro_num;
variable24 = new extra_int();
variable23.micro_my_first(variable24);
variable25 = variable24.first;
variable26 = new extra_boolean();
variable19.micro_assign_int((variable22)*(variable25), variable26);
variable27 = variable26.first;
micro_b = variable27;
variable28 = micro_num;
variable29 = micro_num;
variable30 = new extra_int();
variable29.micro_my_first(variable30);
variable31 = variable30.first;
variable32 = new extra_boolean();
variable28.micro_assign_int((variable31)-1, variable32);
variable33 = variable32.first;
micro_b = variable33;
variable34 = micro_num;
variable35 = new extra_int();
variable34.micro_my_first(variable35);
variable36 = variable35.first;
if((variable36)<1){
micro_b = true;
}
else {
variable37 = this;
variable38 = new extra_boolean();
variable37.micro_ComputeFac(micro_num,  micro_accumulator, variable38);
variable39 = variable38.first;
micro_b = (variable39);
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

