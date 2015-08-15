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
public void micro_Start(int variable4, extra_int return_value) {
int micro_sz;
int micro_aux01;
micro_BBS variable5;
extra_int variable6;
int variable7;
micro_BBS variable8;
extra_int variable9;
int variable10;
micro_BBS variable11;
extra_int variable12;
int variable13;
micro_BBS variable14;
extra_int variable15;
int variable16;
micro_sz = variable4;
variable5 = this;
variable6 = new extra_int();
variable5.micro_Init(micro_sz, variable6);
variable7 = variable6.first;
micro_aux01 = variable7;
variable8 = this;
variable9 = new extra_int();
variable8.micro_Print(variable9);
variable10 = variable9.first;
micro_aux01 = variable10;
System.out.println(99999);
variable11 = this;
variable12 = new extra_int();
variable11.micro_Sort(variable12);
variable13 = variable12.first;
micro_aux01 = variable13;
variable14 = this;
variable15 = new extra_int();
variable14.micro_Print(variable15);
variable16 = variable15.first;
micro_aux01 = variable16;
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
public void micro_Init(int variable17, extra_int return_value) {
int micro_sz;
micro_sz = variable17;
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

