class InsertionSort1 { public static void main ( String[] micro_a) {
new new_InsertionSort1().print();
}
}
class new_InsertionSort1 {
public void print() {
micro_IS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_IS();
variable2 = new extra_int();
variable1.micro_Start(12, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_IS {
int[] micro_number;
int micro_size;
public void micro_Start(int variable4, extra_int return_value) {
int micro_sz;
int micro_aux01;
micro_IS variable5;
extra_int variable6;
int variable7;
micro_IS variable8;
extra_int variable9;
int variable10;
micro_IS variable11;
extra_int variable12;
int variable13;
micro_IS variable14;
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
variable11.micro_sort(variable12);
variable13 = variable12.first;
micro_aux01 = variable13;
variable14 = this;
variable15 = new extra_int();
variable14.micro_Print(variable15);
variable16 = variable15.first;
micro_aux01 = variable16;
return_value.first = 0;
}
public void micro_Init(int variable17, extra_int return_value) {
int micro_sz;
micro_sz = variable17;
micro_size = micro_sz;
micro_number = new int[micro_sz];
micro_number[1] = 20;
micro_number[2] = 7;
micro_number[3] = 12;
micro_number[10] = 18;
micro_number[4] = 2;
micro_number[5] = 11;
micro_number[6] = 6;
micro_number[7] = 9;
micro_number[8] = 19;
micro_number[9] = 5;
return_value.first = 0;
}
public void micro_sort(extra_int return_value) {
int micro_j;
int micro_key;
int micro_i;
int micro_temp;
micro_j = 1;
while(micro_j<micro_size){
{
micro_key = micro_number[micro_j];
micro_i = micro_j-1;
while(0<micro_i){
{
micro_temp = micro_number[micro_i];
if(micro_key<micro_temp){
{
micro_number[micro_i+1] = micro_number[micro_i];
}
}
else {
{
}
}
micro_i = micro_i-1;
}
}
micro_j = micro_j+1;
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
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_IS { micro_IS first;}

