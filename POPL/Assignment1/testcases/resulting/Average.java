class Average { public static void main ( String[] micro_a) {
new new_Average().print();
}
}
class new_Average {
public void print() {
micro_Ave variable1;
extra_int variable2;
int variable3;
variable1 = new micro_Ave();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Ave {
int[] micro_a;
public void micro_init(extra_int return_value) {
int micro_i;
micro_a = new int[100];
micro_i = 0;
while(micro_i<100){
{
micro_a[micro_i] = micro_i;
micro_i = micro_i+1;
}
}
return_value.first = 0;
}
public void micro_div(int variable4, extra_int return_value) {
int micro_sum;
int micro_count01;
int micro_count02;
int micro_aux03;
micro_sum = variable4;
micro_count01 = 0;
micro_count02 = 0;
micro_aux03 = micro_sum-1;
while(micro_count02<micro_aux03){
{
micro_count01 = micro_count01+1;
micro_count02 = micro_count02+100;
}
}
return_value.first = micro_count01;
}
public void micro_Start(extra_int return_value) {
int micro_i;
int micro_sum;
int micro_temp;
int micro_ave;
int micro_min;
micro_Ave variable5;
extra_int variable6;
int variable7;
micro_Ave variable8;
extra_int variable9;
int variable10;
variable5 = this;
variable6 = new extra_int();
variable5.micro_init(variable6);
variable7 = variable6.first;
micro_temp = variable7;
micro_i = 0;
micro_min = micro_a[micro_i];
micro_sum = 0;
while(micro_i<100){
{
micro_temp = micro_a[micro_i];
micro_sum = micro_sum+micro_temp;
micro_i = micro_i+1;
}
}
variable8 = this;
variable9 = new extra_int();
variable8.micro_div(micro_sum, variable9);
variable10 = variable9.first;
micro_ave = variable10;
return_value.first = micro_ave;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Ave { micro_Ave first;}

