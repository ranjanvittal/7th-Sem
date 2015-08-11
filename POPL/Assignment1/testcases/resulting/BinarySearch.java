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
public void micro_Start(int micro_sz, extra_int return_value) {
int micro_aux01;
int micro_aux02;
micro_BS variable4;
extra_int variable5;
int variable6;
micro_BS variable7;
extra_int variable8;
int variable9;
micro_BS variable10;
extra_boolean variable11;
boolean variable12;
micro_BS variable13;
extra_boolean variable14;
boolean variable15;
micro_BS variable16;
extra_boolean variable17;
boolean variable18;
micro_BS variable19;
extra_boolean variable20;
boolean variable21;
micro_BS variable22;
extra_boolean variable23;
boolean variable24;
micro_BS variable25;
extra_boolean variable26;
boolean variable27;
micro_BS variable28;
extra_boolean variable29;
boolean variable30;
micro_BS variable31;
extra_boolean variable32;
boolean variable33;
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
variable10 = this;
variable11 = new extra_boolean();
variable10.micro_Search(8, variable11);
variable12 = variable11.first;
if(variable12){
System.out.println(1);
}
else {
System.out.println(0);
}
variable13 = this;
variable14 = new extra_boolean();
variable13.micro_Search(19, variable14);
variable15 = variable14.first;
if(variable15){
System.out.println(1);
}
else {
System.out.println(0);
}
variable16 = this;
variable17 = new extra_boolean();
variable16.micro_Search(20, variable17);
variable18 = variable17.first;
if(variable18){
System.out.println(1);
}
else {
System.out.println(0);
}
variable19 = this;
variable20 = new extra_boolean();
variable19.micro_Search(21, variable20);
variable21 = variable20.first;
if(variable21){
System.out.println(1);
}
else {
System.out.println(0);
}
variable22 = this;
variable23 = new extra_boolean();
variable22.micro_Search(37, variable23);
variable24 = variable23.first;
if(variable24){
System.out.println(1);
}
else {
System.out.println(0);
}
variable25 = this;
variable26 = new extra_boolean();
variable25.micro_Search(38, variable26);
variable27 = variable26.first;
if(variable27){
System.out.println(1);
}
else {
System.out.println(0);
}
variable28 = this;
variable29 = new extra_boolean();
variable28.micro_Search(39, variable29);
variable30 = variable29.first;
if(variable30){
System.out.println(1);
}
else {
System.out.println(0);
}
variable31 = this;
variable32 = new extra_boolean();
variable31.micro_Search(50, variable32);
variable33 = variable32.first;
if(variable33){
System.out.println(1);
}
else {
System.out.println(0);
}
return_value.first = 999;
}
public void micro_Search(int micro_num, extra_boolean return_value) {
boolean micro_bs01;
int micro_right;
int micro_left;
boolean micro_var_cont;
int micro_medium;
int micro_aux01;
int micro_nt;
int[] variable34;
micro_BS variable35;
extra_int variable36;
int variable37;
micro_BS variable38;
extra_boolean variable39;
boolean variable40;
micro_BS variable41;
extra_boolean variable42;
boolean variable43;
micro_aux01 = 0;
micro_bs01 = false;
variable34 = micro_number;
micro_right = variable34.length;
micro_right = micro_right-1;
micro_left = 0;
micro_var_cont = true;
while(micro_var_cont){
{
micro_medium = micro_left+micro_right;
variable35 = this;
variable36 = new extra_int();
variable35.micro_Div(micro_medium, variable36);
variable37 = variable36.first;
micro_medium = variable37;
micro_aux01 = micro_number[micro_medium];
if(micro_num<micro_aux01){
micro_right = micro_medium-1;
}
else {
micro_left = micro_medium+1;
}
variable38 = this;
variable39 = new extra_boolean();
variable38.micro_Compare(micro_aux01,  micro_num, variable39);
variable40 = variable39.first;
if(variable40){
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
variable41 = this;
variable42 = new extra_boolean();
variable41.micro_Compare(micro_aux01,  micro_num, variable42);
variable43 = variable42.first;
if(variable43){
micro_bs01 = true;
}
else {
micro_bs01 = false;
}
return_value.first = micro_bs01;
}
public void micro_Div(int micro_num, extra_int return_value) {
int micro_count01;
int micro_count02;
int micro_aux03;
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
public void micro_Compare(int micro_num1, int micro_num2, extra_boolean return_value) {
boolean micro_retval;
int micro_aux02;
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
public void micro_Init(int micro_sz, extra_int return_value) {
int micro_j;
int micro_k;
int micro_aux02;
int micro_aux01;
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

