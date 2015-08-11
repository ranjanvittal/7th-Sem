class LinearSearch { public static void main ( String[] micro_a) {
new new_LinearSearch().print();
}
}
class new_LinearSearch {
public void print() {
micro_LS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_LS();
variable2 = new extra_int();
variable1.micro_Start(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_LS {
int[] micro_number;
int micro_size;
public void micro_Start(int micro_sz, extra_int return_value) {
int micro_aux01;
int micro_aux02;
micro_LS variable4;
extra_int variable5;
int variable6;
micro_LS variable7;
extra_int variable8;
int variable9;
micro_LS variable10;
extra_int variable11;
int variable12;
micro_LS variable13;
extra_int variable14;
int variable15;
micro_LS variable16;
extra_int variable17;
int variable18;
micro_LS variable19;
extra_int variable20;
int variable21;
variable4 = this;
variable5 = new extra_int();
variable4.micro_Init(micro_sz, variable5);
variable6 = variable5.first;
micro_aux01 = variable6;
variable7 = this;
variable8 = new extra_int();
variable7.micro_Print(variable8);
variable9 = variable8.first;
micro_aux02 = variable9;
System.out.println(9999);
variable10 = this;
variable11 = new extra_int();
variable10.micro_Search(8, variable11);
variable12 = variable11.first;
System.out.println(variable12);
variable13 = this;
variable14 = new extra_int();
variable13.micro_Search(12, variable14);
variable15 = variable14.first;
System.out.println(variable15);
variable16 = this;
variable17 = new extra_int();
variable16.micro_Search(17, variable17);
variable18 = variable17.first;
System.out.println(variable18);
variable19 = this;
variable20 = new extra_int();
variable19.micro_Search(50, variable20);
variable21 = variable20.first;
System.out.println(variable21);
return_value.first = 55;
}
public void micro_Print(extra_int return_value) {
int micro_j;
micro_j = 1;
while(micro_j<(micro_size)){
{
System.out.println(micro_number[micro_j]);
micro_j = micro_j+1;
}
}
return_value.first = 0;
}
public void micro_Search(int micro_num, extra_int return_value) {
int micro_j;
boolean micro_ls01;
int micro_ifound;
int micro_aux01;
int micro_aux02;
int micro_nt;
micro_j = 1;
micro_ls01 = false;
micro_ifound = 0;
while(micro_j<(micro_size)){
{
micro_aux01 = micro_number[micro_j];
micro_aux02 = micro_num+1;
if(micro_aux01<micro_num){
micro_nt = 0;
}
else {
if(!(micro_aux01<micro_aux02)){
micro_nt = 0;
}
else {
{
micro_ls01 = true;
micro_ifound = 1;
micro_j = micro_size;
}
}
}
micro_j = micro_j+1;
}
}
return_value.first = micro_ifound;
}
public void micro_Init(int micro_sz, extra_int return_value) {
int micro_j;
int micro_k;
int micro_aux01;
int micro_aux02;
micro_size = micro_sz;
micro_number = new int[micro_sz];
micro_j = 1;
micro_k = micro_size+1;
while(micro_j<(micro_size)){
{
micro_aux01 = 2*micro_j;
micro_aux02 = micro_k-3;
micro_number[micro_j] = micro_aux01+micro_aux02;
micro_j = micro_j+1;
micro_k = micro_k-1;
}
}
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_LS { micro_LS first;}

