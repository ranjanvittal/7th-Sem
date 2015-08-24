class BubbleSort { public static void main ( String[] micro_a) {
new new_BubbleSort().print();
}
}
class new_BubbleSort {
public void print() {
micro_BS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_BS();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_BS {
int[] micro_a;
public void micro_init(extra_int return_value) {
int micro_i;
micro_i = 100;
micro_a = new int[102];
while(0<micro_i){
{
micro_a[micro_i] = micro_i;
micro_i = micro_i-1;
}
}
return_value.first = 0;
}
public void micro_Start(extra_int return_value) {
int micro_i;
int micro_j;
int micro_temp;
int micro_a1;
int micro_a2;
micro_BS variable4;
extra_int variable5;
int variable6;
variable4 = this;
variable5 = new extra_int();
variable4.micro_init(variable5);
variable6 = variable5.first;
micro_temp = variable6;
micro_i = 0;
while(micro_i<100){
{
micro_j = micro_i;
while(micro_j<100){
{
micro_a1 = micro_a[micro_j];
micro_temp = micro_j+1;
micro_a2 = micro_a[micro_temp];
if(micro_a2<micro_a1){
{
micro_a[micro_j] = micro_a2;
micro_a[micro_temp] = micro_a1;
}
}
else {
micro_a[micro_j] = micro_a1;
}
micro_j = micro_j+1;
}
}
micro_i = micro_i+1;
}
}
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_BS { micro_BS first;}

