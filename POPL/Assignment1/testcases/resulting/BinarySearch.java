class BinarySearch { public static void main ( String[] micro_a) {
new new_BinarySearch().print();
}
}
class new_BinarySearch {
public void print() {
micro_BS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_BS();
variable2 = new extra_int();
variable1.micro_Start(20, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_BS {
int[] micro_number;
int micro_size;
public void micro_Start(int variable4, extra_int return_value) {
int micro_sz;
int micro_aux01;
int micro_aux02;
micro_BS variable5;
extra_int variable6;
int variable7;
micro_BS variable8;
extra_int variable9;
int variable10;
micro_BS variable11;
extra_boolean variable12;
boolean variable13;
micro_BS variable14;
extra_boolean variable15;
boolean variable16;
micro_BS variable17;
extra_boolean variable18;
boolean variable19;
micro_BS variable20;
extra_boolean variable21;
boolean variable22;
micro_BS variable23;
extra_boolean variable24;
boolean variable25;
micro_BS variable26;
extra_boolean variable27;
boolean variable28;
micro_BS variable29;
extra_boolean variable30;
boolean variable31;
micro_BS variable32;
extra_boolean variable33;
boolean variable34;
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
variable11 = this;
variable12 = new extra_boolean();
variable11.micro_Search(8, variable12);
variable13 = variable12.first;
if(variable13){
System.out.println(1);
}
else {
System.out.println(0);
}
variable14 = this;
variable15 = new extra_boolean();
variable14.micro_Search(19, variable15);
variable16 = variable15.first;
if(variable16){
System.out.println(1);
}
else {
System.out.println(0);
}
variable17 = this;
variable18 = new extra_boolean();
variable17.micro_Search(20, variable18);
variable19 = variable18.first;
if(variable19){
System.out.println(1);
}
else {
System.out.println(0);
}
variable20 = this;
variable21 = new extra_boolean();
variable20.micro_Search(21, variable21);
variable22 = variable21.first;
if(variable22){
System.out.println(1);
}
else {
System.out.println(0);
}
variable23 = this;
variable24 = new extra_boolean();
variable23.micro_Search(37, variable24);
variable25 = variable24.first;
if(variable25){
System.out.println(1);
}
else {
System.out.println(0);
}
variable26 = this;
variable27 = new extra_boolean();
variable26.micro_Search(38, variable27);
variable28 = variable27.first;
if(variable28){
System.out.println(1);
}
else {
System.out.println(0);
}
variable29 = this;
variable30 = new extra_boolean();
variable29.micro_Search(39, variable30);
variable31 = variable30.first;
if(variable31){
System.out.println(1);
}
else {
System.out.println(0);
}
variable32 = this;
variable33 = new extra_boolean();
variable32.micro_Search(50, variable33);
variable34 = variable33.first;
if(variable34){
System.out.println(1);
}
else {
System.out.println(0);
}
return_value.first = 999;
}
public void micro_Search(int variable35, extra_boolean return_value) {
int micro_num;
boolean micro_bs01;
int micro_right;
int micro_left;
boolean micro_var_cont;
int micro_medium;
int micro_aux01;
int micro_nt;
int[] variable36;
micro_BS variable37;
extra_int variable38;
int variable39;
micro_BS variable40;
extra_boolean variable41;
boolean variable42;
micro_BS variable43;
extra_boolean variable44;
boolean variable45;
micro_num = variable35;
micro_aux01 = 0;
micro_bs01 = false;
variable36 = micro_number;
micro_right = variable36.length;
micro_right = micro_right-1;
micro_left = 0;
micro_var_cont = true;
while(micro_var_cont){
{
micro_medium = micro_left+micro_right;
variable37 = this;
variable38 = new extra_int();
variable37.micro_Div(micro_medium, variable38);
variable39 = variable38.first;
micro_medium = variable39;
micro_aux01 = micro_number[micro_medium];
if(micro_num<micro_aux01){
micro_right = micro_medium-1;
}
else {
micro_left = micro_medium+1;
}
variable40 = this;
variable41 = new extra_boolean();
variable40.micro_Compare(micro_aux01,  micro_num, variable41);
variable42 = variable41.first;
if(variable42){
micro_var_cont = false;
}
else {
micro_var_cont = true;
}
if(micro_right<micro_left){
micro_var_cont = false;
}
else {
micro_nt = 0;
}
}
}
variable43 = this;
variable44 = new extra_boolean();
variable43.micro_Compare(micro_aux01,  micro_num, variable44);
variable45 = variable44.first;
if(variable45){
micro_bs01 = true;
}
else {
micro_bs01 = false;
}
return_value.first = micro_bs01;
}
public void micro_Div(int variable46, extra_int return_value) {
int micro_num;
int micro_count01;
int micro_count02;
int micro_aux03;
micro_num = variable46;
micro_count01 = 0;
micro_count02 = 0;
micro_aux03 = micro_num-1;
while(micro_count02<micro_aux03){
{
micro_count01 = micro_count01+1;
micro_count02 = micro_count02+2;
}
}
return_value.first = micro_count01;
}
public void micro_Compare(int variable47, int variable48, extra_boolean return_value) {
int micro_num1;
int micro_num2;
boolean micro_retval;
int micro_aux02;
micro_num1 = variable47;
micro_num2 = variable48;
micro_retval = false;
micro_aux02 = micro_num2+1;
if(micro_num1<micro_num2){
micro_retval = false;
}
else {
if(!(micro_num1<micro_aux02)){
micro_retval = false;
}
else {
micro_retval = true;
}
}
return_value.first = micro_retval;
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
System.out.println(99999);
return_value.first = 0;
}
public void micro_Init(int variable49, extra_int return_value) {
int micro_sz;
int micro_j;
int micro_k;
int micro_aux02;
int micro_aux01;
micro_sz = variable49;
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
class extra_micro_BS { micro_BS first;}

