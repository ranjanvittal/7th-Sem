class mytest5 { public static void main ( String[] micro_a) {
new new_mytest5().print();
}
}
class new_mytest5 {
public void print() {
micro_MyStarter4 variable1;
extra_int variable2;
int variable3;
variable1 = new micro_MyStarter4();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_Random {
public void micro_return_itself(int[] variable4, extra_array return_value) {
int[] micro_a;
micro_a = variable4;
return_value.first = micro_a;
}
}
class micro_MyStarter4 {
public void micro_start(extra_int return_value) {
int[] micro_a;
boolean micro_b;
int micro_i;
micro_Operation micro_a1;
micro_Operation micro_a2;
micro_Operation micro_a3;
micro_Operation micro_a4;
micro_Operation micro_a5;
micro_Operation variable5;
extra_int variable6;
int variable7;
micro_Operation variable8;
extra_int variable9;
int variable10;
micro_Operation variable11;
extra_int variable12;
int variable13;
micro_Operation variable14;
extra_int variable15;
int variable16;
micro_Operation variable17;
extra_int variable18;
int variable19;
micro_a1 = new micro_Operation();
micro_a2 = new micro_Length();
micro_a3 = new micro_Sum();
micro_a4 = new micro_Product();
micro_a5 = new micro_Print();
micro_a = new int[10];
micro_i = 0;
while(micro_i<10){
{
micro_a[micro_i] = micro_i;
micro_i = micro_i+1;
}
}
variable5 = micro_a1;
variable6 = new extra_int();
variable5.micro_Operation(micro_a, variable6);
variable7 = variable6.first;
System.out.println(variable7);
variable8 = micro_a2;
variable9 = new extra_int();
variable8.micro_Operation(micro_a, variable9);
variable10 = variable9.first;
System.out.println(variable10);
variable11 = micro_a3;
variable12 = new extra_int();
variable11.micro_Operation(micro_a, variable12);
variable13 = variable12.first;
System.out.println(variable13);
variable14 = micro_a4;
variable15 = new extra_int();
variable14.micro_Operation(micro_a, variable15);
variable16 = variable15.first;
System.out.println(variable16);
variable17 = micro_a5;
variable18 = new extra_int();
variable17.micro_Operation(micro_a, variable18);
variable19 = variable18.first;
System.out.println(variable19);
return_value.first = 1;
}
}
class micro_Operation {
public void micro_Operation(int[] variable20, extra_int return_value) {
int[] micro_a;
micro_a = variable20;
return_value.first = 1;
}
}
class micro_Length extends micro_Operation {
public void micro_Operation(int[] variable21, extra_int return_value) {
int[] micro_a;
int[] variable22;
micro_a = variable21;
variable22 = micro_a;
return_value.first = variable22.length;
}
}
class micro_Sum extends micro_Operation {
public void micro_Operation(int[] variable23, extra_int return_value) {
int[] micro_a;
int micro_num_aux;
int micro_length1;
int micro_sum;
int micro_i;
boolean micro_b;
micro_Random variable24;
extra_array variable25;
int[] variable26;
int[] variable27;
micro_a = variable23;
micro_sum = 0;
micro_i = 0;
variable24 = new micro_Random();
variable25 = new extra_array();
variable24.micro_return_itself(micro_a, variable25);
variable26 = variable25.first;
variable27 = (variable26);
micro_length1 = variable27.length;
while(micro_i<micro_length1){
{
micro_sum = micro_sum+(micro_a[micro_i]);
micro_i = micro_i+1;
}
}
return_value.first = micro_sum;
}
}
class micro_Product extends micro_Operation {
public void micro_Operation(int[] variable28, extra_int return_value) {
int[] micro_a;
int micro_num_aux;
int micro_length1;
int micro_product;
int micro_i;
boolean micro_b;
micro_Random variable29;
extra_array variable30;
int[] variable31;
int[] variable32;
micro_a = variable28;
micro_product = 1;
micro_i = 1;
variable29 = new micro_Random();
variable30 = new extra_array();
variable29.micro_return_itself(micro_a, variable30);
variable31 = variable30.first;
variable32 = (variable31);
micro_length1 = variable32.length;
while(micro_i<micro_length1){
{
micro_product = micro_product*(micro_a[micro_i]);
micro_i = micro_i+1;
}
}
return_value.first = micro_product;
}
}
class micro_Print extends micro_Operation {
public void micro_Operation(int[] variable33, extra_int return_value) {
int[] micro_a;
int micro_num_aux;
int micro_length1;
int micro_sum;
int micro_i;
boolean micro_b;
micro_Random variable34;
extra_array variable35;
int[] variable36;
int[] variable37;
micro_a = variable33;
micro_sum = 0;
micro_i = 0;
variable34 = new micro_Random();
variable35 = new extra_array();
variable34.micro_return_itself(micro_a, variable35);
variable36 = variable35.first;
variable37 = (variable36);
micro_length1 = variable37.length;
while(micro_i<micro_length1){
{
System.out.println(micro_a[micro_i]);
micro_i = micro_i+1;
}
}
return_value.first = 1;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_Random { micro_Random first;}
class extra_micro_MyStarter4 { micro_MyStarter4 first;}
class extra_micro_Operation { micro_Operation first;}
class extra_micro_Length { micro_Length first;}
class extra_micro_Sum { micro_Sum first;}
class extra_micro_Product { micro_Product first;}
class extra_micro_Print { micro_Print first;}

