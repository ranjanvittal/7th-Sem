class Factorial { public static void main ( String[] micro_a) {
new new_Factorial().print();
}
}
class new_Factorial {
public void print() {
micro_Fac variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Fac();
variable2 = new extra_int();
variable1.micro_ComputeFac(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Fac {
public void micro_ComputeFac(int variable4, extra_int return_value) {
int micro_num;
int micro_num_aux;
micro_Fac variable5;
extra_int variable6;
int variable7;
micro_num = variable4;
if(micro_num<1){
micro_num_aux = 1;
}
else {
variable5 = this;
variable6 = new extra_int();
variable5.micro_ComputeFac(micro_num-1, variable6);
variable7 = variable6.first;
micro_num_aux = micro_num*(variable7);
}
return_value.first = micro_num_aux;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Fac { micro_Fac first;}

