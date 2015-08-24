class WhileLoopFunctionCall { public static void main ( String[] micro_a) {
new new_WhileLoopFunctionCall().print();
}
}
class new_WhileLoopFunctionCall {
public void print() {
micro_AllFastRecursiveFactorial variable1;
extra_int variable2;
int variable3;
variable1 = new micro_AllFastRecursiveFactorial();
variable2 = new extra_int();
variable1.micro_getAllFactorial(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_RecursiveFactorial {
public void micro_getFactorial(int variable4, int variable5, extra_int return_value) {
int micro_num;
int micro_factorial;
micro_FastRecursiveFactorial variable6;
extra_int variable7;
int variable8;
micro_num = variable4;
micro_factorial = variable5;
if(micro_num<2){
micro_num = micro_factorial;
}
else {
variable6 = new micro_FastRecursiveFactorial();
variable7 = new extra_int();
variable6.micro_getFactorial(micro_num-1,  micro_factorial*micro_num, variable7);
variable8 = variable7.first;
micro_num = variable8;
}
return_value.first = micro_num;
}
}
class micro_FastRecursiveFactorial extends micro_RecursiveFactorial {
}
class micro_AllFastRecursiveFactorial extends micro_FastRecursiveFactorial {
public void micro_getAllFactorial(int variable9, extra_int return_value) {
int micro_num;
int micro_sum;
int micro_i;
int micro_naya;
micro_AllFastRecursiveFactorial variable10;
extra_int variable11;
int variable12;
micro_num = variable9;
micro_i = 1;
micro_sum = 0;
micro_num = micro_num+1;
while(micro_i<micro_num){
{
variable10 = this;
variable11 = new extra_int();
variable10.micro_getFactorial(micro_i,  1, variable11);
variable12 = variable11.first;
micro_naya = variable12;
micro_sum = micro_sum+micro_naya;
micro_i = micro_i+1;
}
}
return_value.first = micro_sum;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_RecursiveFactorial { micro_RecursiveFactorial first;}
class extra_micro_FastRecursiveFactorial { micro_FastRecursiveFactorial first;}
class extra_micro_AllFastRecursiveFactorial { micro_AllFastRecursiveFactorial first;}

