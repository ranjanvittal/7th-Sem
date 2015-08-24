class FunctionRecursion { public static void main ( String[] micro_a) {
new new_FunctionRecursion().print();
}
}
class new_FunctionRecursion {
public void print() {
micro_RecursiveFactorial variable1;
extra_int variable2;
int variable3;
variable1 = new micro_RecursiveFactorial();
variable2 = new extra_int();
variable1.micro_getFactorial(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_RecursiveFactorial {
public void micro_getFactorial(int variable4, extra_int return_value) {
int micro_num;
int micro_num_aux;
micro_FastRecursiveFactorial variable5;
extra_int variable6;
int variable7;
micro_num = variable4;
if(micro_num<1){
micro_num_aux = 1;
}
else {
variable5 = new micro_FastRecursiveFactorial();
variable6 = new extra_int();
variable5.micro_getFactorial(micro_num,  1, variable6);
variable7 = variable6.first;
micro_num_aux = variable7;
}
return_value.first = micro_num_aux;
}
}
class micro_FastRecursiveFactorial {
public void micro_getFactorial(int variable8, int variable9, extra_int return_value) {
int micro_num;
int micro_factorial;
int micro_num_aux;
micro_FastRecursiveFactorial variable10;
extra_int variable11;
int variable12;
micro_num = variable8;
micro_factorial = variable9;
if(micro_num<2){
micro_num_aux = micro_factorial;
}
else {
variable10 = new micro_FastRecursiveFactorial();
variable11 = new extra_int();
variable10.micro_getFactorial(micro_num-1,  micro_factorial*micro_num, variable11);
variable12 = variable11.first;
micro_num_aux = variable12;
}
return_value.first = micro_num_aux;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_RecursiveFactorial { micro_RecursiveFactorial first;}
class extra_micro_FastRecursiveFactorial { micro_FastRecursiveFactorial first;}

