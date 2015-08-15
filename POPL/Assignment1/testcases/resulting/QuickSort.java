class QuickSort { public static void main ( String[] micro_a) {
new new_QuickSort().print();
}
}
class new_QuickSort {
public void print() {
micro_QS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_QS();
variable2 = new extra_int();
variable1.micro_Start(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_QS {
int[] micro_number;
int micro_size;
public void micro_Start(int variable4, extra_int return_value) {
int micro_sz;
int micro_aux01;
micro_QS variable5;
extra_int variable6;
int variable7;
micro_QS variable8;
extra_int variable9;
int variable10;
micro_QS variable11;
extra_int variable12;
int variable13;
micro_QS variable14;
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
System.out.println(9999);
micro_aux01 = micro_size-1;
variable11 = this;
variable12 = new extra_int();
variable11.micro_Sort(0,  micro_aux01, variable12);
variable13 = variable12.first;
micro_aux01 = variable13;
variable14 = this;
variable15 = new extra_int();
variable14.micro_Print(variable15);
variable16 = variable15.first;
micro_aux01 = variable16;
return_value.first = 0;
}
public void micro_Sort(int variable17, int variable18, extra_int return_value) {
int micro_left;
int micro_right;
int micro_v;
int micro_i;
int micro_j;
int micro_nt;
int micro_t;
boolean micro_cont01;
boolean micro_cont02;
int micro_aux03;
micro_QS variable19;
extra_int variable20;
int variable21;
micro_QS variable22;
extra_int variable23;
int variable24;
micro_left = variable17;
micro_right = variable18;
micro_t = 0;
if(micro_left<micro_right){
{
micro_v = micro_number[micro_right];
micro_i = micro_left-1;
micro_j = micro_right;
micro_cont01 = true;
while(micro_cont01){
{
micro_cont02 = true;
while(micro_cont02){
{
micro_i = micro_i+1;
micro_aux03 = micro_number[micro_i];
if(!(micro_aux03<micro_v)){
micro_cont02 = false;
}
else {
micro_cont02 = true;
}
}
}
micro_cont02 = true;
while(micro_cont02){
{
micro_j = micro_j-1;
micro_aux03 = micro_number[micro_j];
if(!(micro_v<micro_aux03)){
micro_cont02 = false;
}
else {
micro_cont02 = true;
}
}
}
micro_t = micro_number[micro_i];
micro_number[micro_i] = micro_number[micro_j];
micro_number[micro_j] = micro_t;
if(micro_j<(micro_i+1)){
micro_cont01 = false;
}
else {
micro_cont01 = true;
}
}
}
micro_number[micro_j] = micro_number[micro_i];
micro_number[micro_i] = micro_number[micro_right];
micro_number[micro_right] = micro_t;
variable19 = this;
variable20 = new extra_int();
variable19.micro_Sort(micro_left,  micro_i-1, variable20);
variable21 = variable20.first;
micro_nt = variable21;
variable22 = this;
variable23 = new extra_int();
variable22.micro_Sort(micro_i+1,  micro_right, variable23);
variable24 = variable23.first;
micro_nt = variable24;
}
}
else {
micro_nt = 0;
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
public void micro_Init(int variable25, extra_int return_value) {
int micro_sz;
micro_sz = variable25;
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
class extra_micro_QS { micro_QS first;}

