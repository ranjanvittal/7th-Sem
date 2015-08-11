class BubbleSort { public static void main ( String[] micro_a) {
new new_BubbleSort().print();
}
}
class new_BubbleSort {
public void print() {
micro_BBS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_BBS();
variable2 = new extra_int();
variable1.micro_Start(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_BBS {
int[] micro_number;
int micro_size;
public void micro_Start(int micro_sz, extra_int return_value) {
int micro_aux01;
micro_BBS variable4;
extra_int variable5;
int variable6;
micro_BBS variable7;
extra_int variable8;
int variable9;
micro_BBS variable10;
extra_int variable11;
int variable12;
micro_BBS variable13;
extra_int variable14;
int variable15;
variable4 = this;
variable5 = new extra_int();
variable4.micro_Init(micro_sz, variable5);
variable6 = variable5.first;
micro_aux01 = variable6;
variable7 = this;
variable8 = new extra_int();
variable7.micro_Print(variable8);
variable9 = variable8.first;
micro_aux01 = variable9;
System.out.println(99999);
variable10 = this;
variable11 = new extra_int();
variable10.micro_Sort(variable11);
variable12 = variable11.first;
micro_aux01 = variable12;
variable13 = this;
variable14 = new extra_int();
variable13.micro_Print(variable14);
variable15 = variable14.first;
micro_aux01 = variable15;
return_value.first = 0;
}
public void micro_Sort(extra_int return_value) {
int micro_nt;
int micro_i;
int micro_aux02;
int micro_aux04;
int micro_aux05;
int micro_aux06;
int micro_aux07;
int micro_j;
int micro_t;
micro_i = micro_size-1;
micro_aux02 = 0-1;
while(micro_aux02<micro_i){
{
micro_j = 1;
while(micro_j<(micro_i+1)){
{
micro_aux07 = micro_j-1;
micro_aux04 = micro_number[micro_aux07];
micro_aux05 = micro_number[micro_j];
if(micro_aux05<micro_aux04){
{
micro_aux06 = micro_j-1;
micro_t = micro_number[micro_aux06];
micro_number[micro_aux06] = micro_number[micro_j];
micro_number[micro_j] = micro_t;
}
}
else {
micro_nt = 0;
}
micro_j = micro_j+1;
}
}
micro_i = micro_i-1;
}
}
return_value.first = 0;
}
public void micro_Print(extra_int return_value) {
int micro_j;
micro_j = 0;
while(micro_j<(micro_size)){
{
System.out.println(micro_number[micro_j]);
micro_j = micro_j+1;
}
}
return_value.first = 0;
}
public void micro_Init(int micro_sz, extra_int return_value) {
micro_size = micro_sz;
micro_number = new int[micro_sz];
micro_number[0] = 20;
micro_number[1] = 7;
micro_number[2] = 12;
micro_number[3] = 18;
micro_number[4] = 2;
micro_number[5] = 11;
micro_number[6] = 6;
micro_number[7] = 9;
micro_number[8] = 19;
micro_number[9] = 5;
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_BBS { micro_BBS first;}

