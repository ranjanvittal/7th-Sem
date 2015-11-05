class mytest2 {
public static void main(String[] original_micro_a) {
new original_new_mytest2().original_print(new Runner());
}
}
class original_new_mytest2 {
public void original_print(Runner var_1) {
original_extra_int original_a1;
int original_a2;
original_RecursionChecker original_a3;
Class1 var_2;
original_a1 = new original_extra_int();
original_a2 = 0;
original_a3 = new original_RecursionChecker();
original_a3 = new original_RecursionChecker();
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
class original_RecursionChecker {
public void original_power(int original_a, int original_b, original_extra_int original_result, Runner var_4) {
int original_a1;
original_RecursionChecker original_c;
Class2 var_5;
original_a1 = 0;
original_c = new original_RecursionChecker();
original_result.original_first = 1;
original_c = this;
var_5 = new Class2();
var_5.original_a1 = original_a1;
var_5.original_c = original_c;
var_5.original_result = original_result;
var_5.original_b = original_b;
var_5.original_a = original_a;
var_5.var_4 = var_4;
var_5.latest_class_6 = this;
original_c.original_power_aux(original_a, original_b, original_result, var_5);
}
public void original_power_aux(int original_a, int original_b, original_extra_int original_result, Runner var_7) {
original_RecursionChecker original_c;
Class3 var_8;
original_c = new original_RecursionChecker();
original_c = this;
var_8 = new Class3();
var_8.original_c = original_c;
var_8.original_result = original_result;
var_8.original_b = original_b;
var_8.original_a = original_a;
var_8.var_7 = var_7;
var_8.latest_class_9 = this;
var_8.run();
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
original_RecursionChecker original_a3;
original_new_mytest2 latest_class_3;
public void run() {
original_a2 = original_a1.original_first;
System.out.println(original_a2);
var_1.run();
}
}
class Class2 extends Runner {
int original_a1;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_4;
original_RecursionChecker latest_class_6;
public void run() {
var_4.run();
}
}
class Class3 extends Runner {
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_7;
original_RecursionChecker latest_class_9;
Class4 var_10;
Class5 var_11;
Class6 var_12;
Class7 var_13;
public void run() {
if(0 < original_b)
{
var_10 = new Class4();
var_12 = new Class6();
var_10.original_c = original_c;
var_10.original_result = original_result;
var_10.original_b = original_b;
var_10.original_a = original_a;
var_10.var_7 = var_7;
var_10.latest_class_9 = latest_class_9;
var_10.var_10 = var_10;
var_10.var_11 = var_11;
var_10.var_12 = var_12;
var_10.run();
}
else
{
var_11 = new Class5();
var_12 = new Class6();
var_11.original_c = original_c;
var_11.original_result = original_result;
var_11.original_b = original_b;
var_11.original_a = original_a;
var_11.var_7 = var_7;
var_11.latest_class_9 = latest_class_9;
var_11.var_10 = var_10;
var_11.var_11 = var_11;
var_11.var_12 = var_12;
var_11.run();
}
}
}
class Class4 extends Runner {
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_7;
original_RecursionChecker latest_class_9;
Class4 var_10;
Class5 var_11;
Class6 var_12;
Class7 var_13;
public void run() {
original_result.original_first = original_result.original_first * original_a;
original_b = original_b - 1;
var_13 = new Class7();
var_13.original_result = original_result;
var_13.var_12 = var_12;
var_13.latest_class_9 = latest_class_9;
var_13.var_11 = var_11;
var_13.original_c = original_c;
var_13.var_10 = var_10;
var_13.original_b = original_b;
var_13.original_a = original_a;
var_13.var_7 = var_7;
original_c.original_power_aux(original_a, original_b, original_result, var_13);
}
}
class Class7 extends Runner {
original_extra_int original_result;
Class6 var_12;
original_RecursionChecker latest_class_9;
Class5 var_11;
original_RecursionChecker original_c;
Class4 var_10;
int original_b;
int original_a;
Runner var_7;
public void run() {
var_12.original_c = original_c;
var_12.original_result = original_result;
var_12.original_b = original_b;
var_12.original_a = original_a;
var_12.var_7 = var_7;
var_12.latest_class_9 = latest_class_9;
var_12.var_10 = var_10;
var_12.var_11 = var_11;
var_12.var_12 = var_12;
var_12.original_result = original_result;
var_12.var_12 = var_12;
var_12.latest_class_9 = latest_class_9;
var_12.var_11 = var_11;
var_12.original_c = original_c;
var_12.var_10 = var_10;
var_12.original_b = original_b;
var_12.original_a = original_a;
var_12.var_7 = var_7;
var_12.run();
}
}
class Class5 extends Runner {
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_7;
original_RecursionChecker latest_class_9;
Class4 var_10;
Class5 var_11;
Class6 var_12;
Class7 var_13;
public void run() {
var_12.original_c = original_c;
var_12.original_result = original_result;
var_12.original_b = original_b;
var_12.original_a = original_a;
var_12.var_7 = var_7;
var_12.latest_class_9 = latest_class_9;
var_12.var_10 = var_10;
var_12.var_11 = var_11;
var_12.var_12 = var_12;
var_12.original_c = original_c;
var_12.original_result = original_result;
var_12.original_b = original_b;
var_12.original_a = original_a;
var_12.var_7 = var_7;
var_12.latest_class_9 = latest_class_9;
var_12.var_10 = var_10;
var_12.var_11 = var_11;
var_12.var_12 = var_12;
var_12.var_13 = var_13;
var_12.run();
}
}
class Class6 extends Runner {
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_7;
original_RecursionChecker latest_class_9;
Class4 var_10;
Class5 var_11;
Class6 var_12;
Class7 var_13;
public void run() {
var_7.run();
}
}
