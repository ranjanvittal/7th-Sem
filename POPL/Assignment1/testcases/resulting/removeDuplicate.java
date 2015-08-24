class removeDuplicate { public static void main ( String[] micro_a) {
new new_removeDuplicate().print();
}
}
class new_removeDuplicate {
public void print() {
micro_RD variable1;
extra_int variable2;
int variable3;
variable1 = new micro_RD();
variable2 = new extra_int();
variable1.micro_Start(10, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_RD {
int[] micro_number;
int micro_size;
public void micro_Start(int variable4, extra_int return_value) {
int micro_sz;
int micro_aux01;
micro_RD variable5;
extra_int variable6;
int variable7;
micro_RD variable8;
extra_int variable9;
int variable10;
micro_RD variable11;
extra_int variable12;
int variable13;
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
variable11.micro_D(variable12);
variable13 = variable12.first;
micro_aux01 = variable13;
return_value.first = 0;
}
public void micro_Init(int variable14, extra_int return_value) {
int micro_sz;
micro_sz = variable14;
micro_size = micro_sz;
micro_number = new int[micro_sz];
micro_number[0] = 20;
micro_number[1] = 7;
micro_number[2] = 2;
micro_number[3] = 18;
micro_number[4] = 2;
micro_number[5] = 7;
micro_number[6] = 6;
micro_number[7] = 9;
micro_number[8] = 19;
micro_number[9] = 5;
return_value.first = 0;
}
public void micro_D(extra_int return_value) {
int micro_j;
int micro_i;
int micro_temp1;
int micro_temp2;
micro_j = 0;
micro_i = 1;
while(micro_i<micro_size){
{
micro_temp1 = micro_number[micro_i];
micro_temp2 = micro_number[micro_j];
if(micro_temp1<micro_temp2){
{
micro_j = micro_j+1;
micro_number[micro_j] = micro_number[micro_i];
micro_i = micro_i+1;
}
}
else {
if(micro_temp2<micro_temp1){
{
micro_j = micro_j+1;
micro_number[micro_j] = micro_number[micro_i];
micro_i = micro_i+1;
}
}
else {
{
micro_i = micro_i+1;
}
}
}
}
}
micro_size = micro_j+1;
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
class extra_micro_RD { micro_RD first;}

