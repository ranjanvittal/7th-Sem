class Min { public static void main ( String[] micro_a) {
new new_Min().print();
}
}
class new_Min {
public void print() {
micro_AM variable1;
extra_int variable2;
int variable3;
variable1 = new micro_AM();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_AM {
int[] micro_a;
public void micro_init(extra_int return_value) {
int micro_i;
micro_a = new int[100];
micro_i = 0;
while(micro_i<100){
{
micro_a[micro_i] = micro_i;
micro_i = micro_i+1;
}
}
return_value.first = 0;
}
public void micro_Start(extra_int return_value) {
int micro_i;
int micro_min;
int micro_temp;
micro_AM variable4;
extra_int variable5;
int variable6;
variable4 = this;
variable5 = new extra_int();
variable4.micro_init(variable5);
variable6 = variable5.first;
micro_temp = variable6;
micro_i = 0;
micro_min = micro_a[micro_i];
while(micro_i<100){
{
micro_temp = micro_a[micro_i];
if(micro_temp<micro_min){
micro_min = micro_a[micro_i];
}
else {
micro_min = micro_min;
}
micro_i = micro_i+1;
}
}
return_value.first = micro_min;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_AM { micro_AM first;}

