class mytest12 {
public static void main(String[] original_micro_a) {
new original_new_mytest12().original_print(new Runner());
}
}
class original_new_mytest12 {
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
original_a3.original_power_two_power(2, 4, original_a1, var_2);
}
}
class original_RecursionChecker {
public void original_power_two_power(int original_a, int original_b, original_extra_int original_result, Runner var_4) {
int original_a1;
original_RecursionChecker original_c;
Class2 var_5;
original_a1 = 0;
original_c = new original_RecursionChecker();
original_result.original_first = original_a;
var_5 = new Class2();
var_5.original_a1 = original_a1;
var_5.original_c = original_c;
var_5.original_result = original_result;
var_5.original_b = original_b;
var_5.original_a = original_a;
var_5.var_4 = var_4;
var_5.latest_class_6 = this;
var_5.run();
}
public void original_power_two_power_aux(int original_a, int original_b, original_extra_int original_result, Runner var_11) {
original_RecursionChecker original_c;
Class7 var_12;
original_c = new original_RecursionChecker();
original_c = this;
var_12 = new Class7();
var_12.var_11 = var_11;
var_12.original_c = original_c;
var_12.original_result = original_result;
var_12.original_b = original_b;
var_12.original_a = original_a;
var_12.latest_class_13 = this;
var_12.run();
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
original_new_mytest12 latest_class_3;
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
Class3 var_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
public void run() {
if(0 < original_b)
{
var_7 = new Class3();
var_9 = new Class5();
var_7.original_a1 = original_a1;
var_7.original_c = original_c;
var_7.original_result = original_result;
var_7.original_b = original_b;
var_7.original_a = original_a;
var_7.var_4 = var_4;
var_7.latest_class_6 = latest_class_6;
var_7.var_7 = var_7;
var_7.var_8 = var_8;
var_7.var_9 = var_9;
var_7.run();
}
else
{
var_8 = new Class4();
var_9 = new Class5();
var_8.original_a1 = original_a1;
var_8.original_c = original_c;
var_8.original_result = original_result;
var_8.original_b = original_b;
var_8.original_a = original_a;
var_8.var_4 = var_4;
var_8.latest_class_6 = latest_class_6;
var_8.var_7 = var_7;
var_8.var_8 = var_8;
var_8.var_9 = var_9;
var_8.run();
}
}
}
class Class3 extends Runner {
int original_a1;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_4;
original_RecursionChecker latest_class_6;
Class3 var_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
public void run() {
original_b = original_b - 1;
original_c = latest_class_6;
var_10 = new Class6();
var_10.original_result = original_result;
var_10.original_c = original_c;
var_10.original_a1 = original_a1;
var_10.latest_class_6 = latest_class_6;
var_10.original_b = original_b;
var_10.original_a = original_a;
var_10.var_9 = var_9;
var_10.var_8 = var_8;
var_10.var_7 = var_7;
var_10.var_4 = var_4;
original_c.original_power_two_power_aux(original_a, original_b, original_result, var_10);
}
}
class Class6 extends Runner {
original_extra_int original_result;
original_RecursionChecker original_c;
int original_a1;
original_RecursionChecker latest_class_6;
int original_b;
int original_a;
Class5 var_9;
Class4 var_8;
Class3 var_7;
Runner var_4;
public void run() {
original_a1 = 0 + 2;
System.out.println(original_a1);
var_9.original_a1 = original_a1;
var_9.original_c = original_c;
var_9.original_result = original_result;
var_9.original_b = original_b;
var_9.original_a = original_a;
var_9.var_4 = var_4;
var_9.latest_class_6 = latest_class_6;
var_9.var_7 = var_7;
var_9.var_8 = var_8;
var_9.var_9 = var_9;
var_9.original_result = original_result;
var_9.original_c = original_c;
var_9.original_a1 = original_a1;
var_9.latest_class_6 = latest_class_6;
var_9.original_b = original_b;
var_9.original_a = original_a;
var_9.var_9 = var_9;
var_9.var_8 = var_8;
var_9.var_7 = var_7;
var_9.var_4 = var_4;
var_9.run();
}
}
class Class4 extends Runner {
int original_a1;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_4;
original_RecursionChecker latest_class_6;
Class3 var_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
public void run() {
var_9.original_a1 = original_a1;
var_9.original_c = original_c;
var_9.original_result = original_result;
var_9.original_b = original_b;
var_9.original_a = original_a;
var_9.var_4 = var_4;
var_9.latest_class_6 = latest_class_6;
var_9.var_7 = var_7;
var_9.var_8 = var_8;
var_9.var_9 = var_9;
var_9.original_a1 = original_a1;
var_9.original_c = original_c;
var_9.original_result = original_result;
var_9.original_b = original_b;
var_9.original_a = original_a;
var_9.var_4 = var_4;
var_9.latest_class_6 = latest_class_6;
var_9.var_7 = var_7;
var_9.var_8 = var_8;
var_9.var_9 = var_9;
var_9.var_10 = var_10;
var_9.run();
}
}
class Class5 extends Runner {
int original_a1;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
Runner var_4;
original_RecursionChecker latest_class_6;
Class3 var_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
public void run() {
var_4.run();
}
}
class Class7 extends Runner {
Runner var_11;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
original_RecursionChecker latest_class_13;
Class8 var_14;
Class9 var_15;
Class10 var_16;
Class11 var_17;
public void run() {
if(0 < original_b)
{
var_14 = new Class8();
var_16 = new Class10();
var_14.var_11 = var_11;
var_14.original_c = original_c;
var_14.original_result = original_result;
var_14.original_b = original_b;
var_14.original_a = original_a;
var_14.latest_class_13 = latest_class_13;
var_14.var_14 = var_14;
var_14.var_15 = var_15;
var_14.var_16 = var_16;
var_14.run();
}
else
{
var_15 = new Class9();
var_16 = new Class10();
var_15.var_11 = var_11;
var_15.original_c = original_c;
var_15.original_result = original_result;
var_15.original_b = original_b;
var_15.original_a = original_a;
var_15.latest_class_13 = latest_class_13;
var_15.var_14 = var_14;
var_15.var_15 = var_15;
var_15.var_16 = var_16;
var_15.run();
}
}
}
class Class8 extends Runner {
Runner var_11;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
original_RecursionChecker latest_class_13;
Class8 var_14;
Class9 var_15;
Class10 var_16;
Class11 var_17;
public void run() {
original_result.original_first = original_result.original_first * original_result.original_first;
original_b = original_b - 1;
var_17 = new Class11();
var_17.var_16 = var_16;
var_17.original_result = original_result;
var_17.var_15 = var_15;
var_17.var_14 = var_14;
var_17.var_11 = var_11;
var_17.original_c = original_c;
var_17.original_b = original_b;
var_17.original_a = original_a;
var_17.latest_class_13 = latest_class_13;
original_c.original_power_two_power_aux(original_a, original_b, original_result, var_17);
}
}
class Class11 extends Runner {
Class10 var_16;
original_extra_int original_result;
Class9 var_15;
Class8 var_14;
Runner var_11;
original_RecursionChecker original_c;
int original_b;
int original_a;
original_RecursionChecker latest_class_13;
public void run() {
var_16.var_11 = var_11;
var_16.original_c = original_c;
var_16.original_result = original_result;
var_16.original_b = original_b;
var_16.original_a = original_a;
var_16.latest_class_13 = latest_class_13;
var_16.var_14 = var_14;
var_16.var_15 = var_15;
var_16.var_16 = var_16;
var_16.var_16 = var_16;
var_16.original_result = original_result;
var_16.var_15 = var_15;
var_16.var_14 = var_14;
var_16.var_11 = var_11;
var_16.original_c = original_c;
var_16.original_b = original_b;
var_16.original_a = original_a;
var_16.latest_class_13 = latest_class_13;
var_16.run();
}
}
class Class9 extends Runner {
Runner var_11;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
original_RecursionChecker latest_class_13;
Class8 var_14;
Class9 var_15;
Class10 var_16;
Class11 var_17;
public void run() {
var_16.var_11 = var_11;
var_16.original_c = original_c;
var_16.original_result = original_result;
var_16.original_b = original_b;
var_16.original_a = original_a;
var_16.latest_class_13 = latest_class_13;
var_16.var_14 = var_14;
var_16.var_15 = var_15;
var_16.var_16 = var_16;
var_16.var_11 = var_11;
var_16.original_c = original_c;
var_16.original_result = original_result;
var_16.original_b = original_b;
var_16.original_a = original_a;
var_16.latest_class_13 = latest_class_13;
var_16.var_14 = var_14;
var_16.var_15 = var_15;
var_16.var_16 = var_16;
var_16.var_17 = var_17;
var_16.run();
}
}
class Class10 extends Runner {
Runner var_11;
original_RecursionChecker original_c;
original_extra_int original_result;
int original_b;
int original_a;
original_RecursionChecker latest_class_13;
Class8 var_14;
Class9 var_15;
Class10 var_16;
Class11 var_17;
public void run() {
var_11.run();
}
}
