class SmallestElement { public static void main ( String[] micro_a) {
new new_SmallestElement().print();
}
}
class new_SmallestElement {
public void print() {
micro_SE variable1;
extra_int variable2;
int variable3;
variable1 = new micro_SE();
variable2 = new extra_int();
variable1.micro_Start(variable2);
variable3 = variable2.first;
System.out.println(variable3);
}
}
class micro_SE {
public void micro_Start(extra_int return_value) {
int[] micro_aux0;
int micro_smallest;
int micro_aux1;
int micro_aux2;
int micro_aux3;
int[] variable4;
micro_aux0 = new int[5];
micro_aux0[0] = 20;
micro_aux0[1] = 11;
micro_aux0[2] = 12;
micro_aux0[3] = 9;
micro_aux0[4] = 2;
micro_smallest = micro_aux0[0];
micro_aux1 = 1;
variable4 = micro_aux0;
micro_aux2 = variable4.length;
while(micro_aux1<micro_aux2){
{
micro_aux3 = micro_aux0[micro_aux1];
if(micro_aux3<micro_smallest){
micro_smallest = micro_aux0[micro_aux1];
}
else {
micro_smallest = micro_smallest;
}
micro_aux1 = micro_aux1+1;
}
}
return_value.first = micro_smallest;
}
}
class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}
class extra_micro_SE { micro_SE first;}

