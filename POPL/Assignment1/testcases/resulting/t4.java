class t4 { public static void main ( String[] micro_a) {
new new_t4().print();
}
}
class new_t4 {
public void print() {
micro_myClass2 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_myClass2();
variable2 = new extra_int();
variable1.micro_f1(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_myClass2 {
public void micro_f1(extra_int return_value) {
int micro_x;
micro_myClass2 variable4;
extra_int variable5;
int variable6;
if(true){
variable4 = this;
variable5 = new extra_int();
variable4.micro_f2(variable5);
variable6 = variable5.first;
micro_x = variable6;
}
else {
micro_x = 0;
}
return_value.first = micro_x;
}
public void micro_f2(extra_int return_value) {
return_value.first = 1;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_myClass2 { micro_myClass2 first;}

