class SolveTheBracketProblem { public static void main ( String[] micro_a) {
new new_SolveTheBracketProblem().print();
}
}
class new_SolveTheBracketProblem {
public void print() {
micro_Square variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Square();
variable2 = new extra_int();
variable1.micro_getFactorial(1,  15, variable2);
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
variable6 = new micro_FastRecursiveFactorial();
variable7 = new extra_int();
variable6.micro_getFactorial(15,  micro_factorial*micro_num, variable7);
variable8 = variable7.first;
micro_num = variable8;
}
else {
micro_num = micro_factorial*micro_factorial;
}
return_value.first = micro_num;
}
}
class micro_FastRecursiveFactorial extends micro_RecursiveFactorial {
}
class micro_Square extends micro_FastRecursiveFactorial {
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_RecursiveFactorial { micro_RecursiveFactorial first;}
class extra_micro_FastRecursiveFactorial { micro_FastRecursiveFactorial first;}
class extra_micro_Square { micro_Square first;}

