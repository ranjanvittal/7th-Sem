class IsPrime { public static void main ( String[] micro_a) {
new new_IsPrime().print();
}
}
class new_IsPrime {
public void print() {
micro_IP variable1;
extra_boolean variable2;
boolean variable3;
variable1 = new micro_IP();
variable2 = new extra_boolean();
variable1.micro_Start(50, variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_IP {
public void micro_div(int variable4, int variable5, extra_boolean return_value) {
int micro_num;
int micro_div;
int micro_count01;
int micro_count02;
int micro_aux03;
boolean micro_f;
micro_num = variable4;
micro_div = variable5;
micro_count01 = 0;
micro_count02 = 0;
micro_aux03 = micro_num-1;
while(micro_count02<micro_aux03){
{
micro_count01 = micro_count01+1;
micro_count02 = micro_count02+micro_div;
}
}
if(micro_num<micro_count01){
micro_f = false;
}
else {
micro_f = true;
}
return_value.first = micro_f;
}
public void micro_Start(int variable6, extra_boolean return_value) {
int micro_num;
int micro_count;
boolean micro_flag;
boolean micro_ret;
int micro_i;
micro_IP variable7;
extra_boolean variable8;
boolean variable9;
micro_num = variable6;
micro_count = 0;
micro_flag = true;
micro_i = 2;
while(micro_i<micro_num){
{
variable7 = this;
variable8 = new extra_boolean();
variable7.micro_div(micro_num,  micro_i, variable8);
variable9 = variable8.first;
micro_ret = variable9;
if(!micro_ret){
micro_flag = false;
}
else {
micro_count = 1;
}
micro_i = micro_i+1;
}
}
return_value.first = micro_flag;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_IP { micro_IP first;}

