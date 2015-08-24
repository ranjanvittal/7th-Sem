class InsertionSort { public static void main ( String[] micro_a) {
new new_InsertionSort().print();
}
}
class new_InsertionSort {
public void print() {
micro_IS variable1;
extra_int variable2;
int variable3;
variable1 = new micro_IS();
variable2 = new extra_int();
variable1.micro_start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_IS {
int[] micro_numbers;
public void micro_start(extra_int return_value) {
int micro_aux0;
micro_IS variable4;
extra_int variable5;
int variable6;
micro_numbers = new int[11];
micro_numbers[1] = 80;
micro_numbers[2] = 90;
micro_numbers[3] = 60;
micro_numbers[4] = 70;
micro_numbers[5] = 10;
micro_numbers[6] = 30;
micro_numbers[7] = 20;
micro_numbers[8] = 50;
micro_numbers[9] = 40;
micro_numbers[10] = 100;
variable4 = this;
variable5 = new extra_int();
variable4.micro_sort(variable5);
variable6 = variable5.first;
micro_aux0 = variable6;
return_value.first = 9999;
}
public void micro_sort(extra_int return_value) {
int micro_j;
int micro_key;
int micro_i;
int micro_len;
int micro_aux10;
int micro_temp;
boolean micro_exp;
boolean micro_left;
boolean micro_right;
int micro_numbI;
int micro_p;
int[] variable7;
micro_aux10 = 0;
micro_j = 1;
variable7 = micro_numbers;
micro_len = variable7.length;
while(micro_j<micro_len){
{
micro_key = micro_numbers[micro_j];
micro_i = micro_j-1;
micro_left = micro_aux10<micro_i;
micro_numbI = micro_numbers[micro_i];
micro_right = micro_key<micro_numbI;
micro_exp = micro_left&micro_right;
while(micro_exp){
{
micro_temp = micro_i+1;
micro_numbers[micro_temp] = micro_numbers[micro_i];
micro_i = micro_i-1;
micro_left = micro_aux10<micro_i;
micro_numbI = micro_numbers[micro_i];
micro_right = micro_key<micro_numbI;
micro_exp = micro_left&micro_right;
}
}
micro_temp = micro_i+1;
micro_numbers[micro_temp] = micro_key;
micro_j = micro_j+1;
}
}
micro_p = 1;
while(micro_p<micro_len){
{
System.out.println(micro_numbers[micro_p]);
micro_p = micro_p+1;
}
}
return_value.first = 0;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_IS { micro_IS first;}

