class cs12b016_test_2 { public static void main ( String[] micro_a) {
new new_cs12b016_test_2().print();
}
}
class new_cs12b016_test_2 {
public void print() {
micro_SumTillNNumbers variable1;
extra_int variable2;
int variable3;
variable1 = new micro_SumTillNNumbers();
variable2 = new extra_int();
variable1.micro_Print(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_SumTillNNumbers {
public void micro_Print(int variable4, extra_int return_value) {
int micro_n;
int[] micro_sum;
int micro_a;
int micro_b;
int micro_i;
int micro_ans;
micro_n = variable4;
micro_sum = new int[(micro_n+1)];
micro_i = 1;
micro_sum[0] = 0;
micro_ans = 0;
while(micro_i<(micro_n+1)){
{
micro_sum[micro_i] = micro_i+(micro_sum[(micro_i-1)]);
System.out.println(micro_sum[micro_i]);
micro_i = micro_i+1;
}
}
return_value.first = micro_ans;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_SumTillNNumbers { micro_SumTillNNumbers first;}

