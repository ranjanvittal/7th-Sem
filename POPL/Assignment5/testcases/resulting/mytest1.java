class mytest1 {
public static void main(String[] original_micro_a) {
new original_new_mytest1().original_print(new Runner());
}
}
class original_new_mytest1 {
public void original_print(Runner var_1) {
original_extra_int original_a1;
int original_a2;
original_Power original_a3;
Class1 var_2;
original_a1 = new original_extra_int();
original_a2 = 0;
original_a3 = new original_Power();
original_a3 = new original_Power();
original_a1 = new original_extra_int();
var_2 = new Class1();
var_2.original_a2 = original_a2;
var_2.original_a1 = original_a1;
var_2.var_1 = var_1;
var_2.original_a3 = original_a3;
var_2.latest_class_3 = this;
original_a3.original_power(2, 20, original_a1, var_2);
}
}
class original_Power {
public void original_power(int original_a, int original_b, original_extra_int original_result, Runner var_4) {
int original_a1;
Class2 var_5;
original_a1 = 0;
original_result.original_first = 1;
var_5 = new Class2();
var_5.original_a1 = original_a1;
var_5.original_result = original_result;
var_5.original_b = original_b;
var_5.original_a = original_a;
var_5.var_4 = var_4;
var_5.latest_class_6 = this;
var_5.run();
}
}
class original_extra_array {
int[] original_first;
}
class original_extra_int {
int original_first;
}
class original_extra_boolean {
boolean original_first;
}
class Runner {
public void run() {
}
}
class Class1 extends Runner {
int original_a2;
original_extra_int original_a1;
Runner var_1;
original_Power original_a3;
original_new_mytest1 latest_class_3;
public void run() {
original_a2 = original_a1.original_first;
System.out.println(original_a2);
var_1.run();
}
}
class Class3 extends Runner {
int original_a1;
original_extra_int original_result;
int original_b;
int original_a;
Class2 var_7;
original_Power latest_class_6;
Runner var_4;
Class4 var_9;
Class5 var_10;
public void run() {
if(0 < original_b)
{
var_9 = new Class4();
var_9.original_a1 = original_a1;
var_9.original_result = original_result;
var_9.original_b = original_b;
var_9.original_a = original_a;
var_9.var_7 = var_7;
var_9.latest_class_6 = latest_class_6;
var_9.var_4 = var_4;
var_9.var_9 = var_9;
var_9.var_10 = var_10;
var_9.run();
}
else
{
var_10 = new Class5();
var_10.original_a1 = original_a1;
var_10.original_result = original_result;
var_10.original_b = original_b;
var_10.original_a = original_a;
var_10.var_7 = var_7;
var_10.latest_class_6 = latest_class_6;
var_10.var_4 = var_4;
var_10.var_9 = var_9;
var_10.var_10 = var_10;
var_10.run();
}
}
}
class Class4 extends Runner {
int original_a1;
original_extra_int original_result;
int original_b;
int original_a;
Class2 var_7;
original_Power latest_class_6;
Runner var_4;
Class4 var_9;
Class5 var_10;
public void run() {
original_a1 = original_result.original_first;
original_a1 = original_a1 * original_a;
original_result.original_first = original_a1;
original_b = original_b - 1;
var_7.original_a1 = original_a1;
var_7.original_result = original_result;
var_7.original_b = original_b;
var_7.original_a = original_a;
var_7.var_7 = var_7;
var_7.latest_class_6 = latest_class_6;
var_7.var_4 = var_4;
var_7.run();
}
}
class Class5 extends Runner {
int original_a1;
original_extra_int original_result;
int original_b;
int original_a;
Class2 var_7;
original_Power latest_class_6;
Runner var_4;
Class4 var_9;
Class5 var_10;
public void run() {
var_4.run();
}
}
class Class2 extends Runner {
int original_a1;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_4;
original_Power latest_class_6;
Class2 var_7;
Class3 var_8;
public void run() {
var_7 = new Class2();
var_8 = new Class3();
var_8.original_a1 = original_a1;
var_8.original_result = original_result;
var_8.original_b = original_b;
var_8.original_a = original_a;
var_8.var_7 = var_7;
var_8.latest_class_6 = latest_class_6;
var_8.var_4 = var_4;
var_8.run();
}
}
