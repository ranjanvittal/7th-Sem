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
public void micro_Start(int variable4, extra_int return_value) {
int micro_sz;
int micro_aux01;
int micro_aux02;
micro_LS variable5;
extra_int variable6;
int variable7;
micro_LS variable8;
extra_int variable9;
int variable10;
micro_LS variable11;
extra_int variable12;
int variable13;
micro_LS variable14;
extra_int variable15;
int variable16;
micro_LS variable17;
extra_int variable18;
int variable19;
micro_LS variable20;
extra_int variable21;
int variable22;
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
micro_aux02 = variable10;
System.out.println(9999);
variable11 = this;
variable12 = new extra_int();
variable11.micro_Search(8, variable12);
variable13 = variable12.first;
System.out.println(variable13);
variable14 = this;
variable15 = new extra_int();
variable14.micro_Search(12, variable15);
variable16 = variable15.first;
System.out.println(variable16);
variable17 = this;
variable18 = new extra_int();
variable17.micro_Search(17, variable18);
variable19 = variable18.first;
System.out.println(variable19);
variable20 = this;
variable21 = new extra_int();
variable20.micro_Search(50, variable21);
variable22 = variable21.first;
System.out.println(variable22);
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
public void micro_Search(int variable23, extra_int return_value) {
int micro_num;
int micro_j;
boolean micro_ls01;
int micro_ifound;
int micro_aux01;
int micro_aux02;
int micro_nt;
micro_num = variable23;
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
public void micro_Init(int variable24, extra_int return_value) {
int micro_sz;
int micro_j;
int micro_k;
int micro_aux01;
int micro_aux02;
micro_sz = variable24;
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

