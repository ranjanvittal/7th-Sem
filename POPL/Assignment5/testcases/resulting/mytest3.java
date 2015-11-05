class mytest3 {
public static void main(String[] original_micro_a) {
new original_new_mytest3().original_print(new Runner());
}
}
class original_new_mytest3 {
public void original_print(Runner var_1) {
original_ExtendsChecker2 original_a;
Class1 var_2;
original_a = new original_ExtendsChecker2();
original_a = new original_ExtendsChecker2();
var_2 = new Class1();
var_2.var_1 = var_1;
var_2.original_a = original_a;
var_2.latest_class_3 = this;
original_a.original_overall_checker(var_2);
}
}
class original_ExtendsChecker {
int original_f1;
public void original_just(int original_a, Runner var_4) {
original_ExtendsChecker original_a1;
Class2 var_5;
original_a1 = new original_ExtendsChecker();
original_a1 = this;
original_f1 = original_a;
System.out.println(original_f1);
var_5 = new Class2();
var_5.original_a1 = original_a1;
var_5.original_a = original_a;
var_5.var_4 = var_4;
var_5.latest_class_6 = this;
original_a1.original_show_f1(var_5);
}
public void original_set_f1(int original_a, Runner var_7) {
original_f1 = original_a;
var_7.run();
}
public void original_show_f1(Runner var_8) {
System.out.println(original_f1);
var_8.run();
}
public void original_get_f1(original_extra_int original_result, Runner var_9) {
original_result.original_first = original_f1;
var_9.run();
}
public void original_get_sum(original_extra_int original_result, Runner var_10) {
int original_a;
original_ExtendsChecker original_a1;
Class3 var_11;
original_a = 0;
original_a1 = new original_ExtendsChecker();
original_a1 = this;
var_11 = new Class3();
var_11.original_a1 = original_a1;
var_11.var_10 = var_10;
var_11.original_result = original_result;
var_11.original_a = original_a;
var_11.latest_class_12 = this;
original_a1.original_get_f1(original_result, var_11);
}
}
class original_ExtendsChecker2 extends original_ExtendsChecker{
int original_f1;
public void original_set_f1(int original_a, Runner var_13) {
original_f1 = original_a;
var_13.run();
}
public void original_get_f1(original_extra_int original_result, Runner var_14) {
original_result.original_first = original_f1;
var_14.run();
}
public void original_show_f1(Runner var_15) {
System.out.println(original_f1);
var_15.run();
}
public void original_overall_checker(Runner var_16) {
original_ExtendsChecker original_a;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
int original_val1;
Class4 var_17;
original_a = new original_ExtendsChecker();
original_a1 = new original_ExtendsChecker2();
original_result = new original_extra_int();
original_val1 = 0;
original_result = new original_extra_int();
original_a1 = this;
var_17 = new Class4();
var_17.original_a1 = original_a1;
var_17.original_result = original_result;
var_17.original_val1 = original_val1;
var_17.original_a = original_a;
var_17.var_16 = var_16;
var_17.latest_class_18 = this;
original_a1.original_set_f1(5, var_17);
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
Runner var_1;
original_ExtendsChecker2 original_a;
original_new_mytest3 latest_class_3;
public void run() {
var_1.run();
}
}
class Class2 extends Runner {
original_ExtendsChecker original_a1;
int original_a;
Runner var_4;
original_ExtendsChecker latest_class_6;
public void run() {
var_4.run();
}
}
class Class3 extends Runner {
original_ExtendsChecker original_a1;
Runner var_10;
original_extra_int original_result;
int original_a;
original_ExtendsChecker latest_class_12;
public void run() {
int final_1;
final_1 = latest_class_12.original_f1;
original_result.original_first = original_result.original_first + final_1;
var_10.run();
}
}
class Class10 extends Runner {
original_ExtendsChecker2 latest_class_18;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
int original_val1;
original_ExtendsChecker original_a;
Runner var_16;
public void run() {
original_val1 = original_result.original_first;
System.out.println(original_val1);
var_16.run();
}
}
class Class9 extends Runner {
original_ExtendsChecker2 latest_class_18;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
original_ExtendsChecker original_a;
int original_val1;
Runner var_16;
Class10 var_24;
public void run() {
var_24 = new Class10();
var_24.latest_class_18 = latest_class_18;
var_24.original_a1 = original_a1;
var_24.original_result = original_result;
var_24.original_val1 = original_val1;
var_24.original_a = original_a;
var_24.var_16 = var_16;
original_a.original_get_sum(original_result, var_24);
}
}
class Class8 extends Runner {
original_ExtendsChecker2 latest_class_18;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
int original_val1;
original_ExtendsChecker original_a;
Runner var_16;
Class9 var_23;
public void run() {
var_23 = new Class9();
var_23.latest_class_18 = latest_class_18;
var_23.original_a1 = original_a1;
var_23.original_result = original_result;
var_23.original_a = original_a;
var_23.original_val1 = original_val1;
var_23.var_16 = var_16;
original_a.original_set_f1(6, var_23);
}
}
class Class7 extends Runner {
original_ExtendsChecker2 latest_class_18;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
original_ExtendsChecker original_a;
int original_val1;
Runner var_16;
Class8 var_22;
public void run() {
original_val1 = original_result.original_first;
System.out.println(original_val1);
original_a = new original_ExtendsChecker();
var_22 = new Class8();
var_22.latest_class_18 = latest_class_18;
var_22.original_a1 = original_a1;
var_22.original_result = original_result;
var_22.original_val1 = original_val1;
var_22.original_a = original_a;
var_22.var_16 = var_16;
original_a.original_just(4, var_22);
}
}
class Class6 extends Runner {
original_ExtendsChecker2 latest_class_18;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
int original_val1;
original_ExtendsChecker original_a;
Runner var_16;
Class7 var_21;
public void run() {
var_21 = new Class7();
var_21.latest_class_18 = latest_class_18;
var_21.original_a1 = original_a1;
var_21.original_result = original_result;
var_21.original_a = original_a;
var_21.original_val1 = original_val1;
var_21.var_16 = var_16;
original_a.original_get_sum(original_result, var_21);
}
}
class Class5 extends Runner {
original_ExtendsChecker2 latest_class_18;
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
original_ExtendsChecker original_a;
int original_val1;
Runner var_16;
Class6 var_20;
public void run() {
var_20 = new Class6();
var_20.latest_class_18 = latest_class_18;
var_20.original_a1 = original_a1;
var_20.original_result = original_result;
var_20.original_val1 = original_val1;
var_20.original_a = original_a;
var_20.var_16 = var_16;
original_a.original_set_f1(6, var_20);
}
}
class Class4 extends Runner {
original_ExtendsChecker2 original_a1;
original_extra_int original_result;
int original_val1;
original_ExtendsChecker original_a;
Runner var_16;
original_ExtendsChecker2 latest_class_18;
Class5 var_19;
public void run() {
original_a = latest_class_18;
var_19 = new Class5();
var_19.latest_class_18 = latest_class_18;
var_19.original_a1 = original_a1;
var_19.original_result = original_result;
var_19.original_a = original_a;
var_19.original_val1 = original_val1;
var_19.var_16 = var_16;
original_a.original_just(4, var_19);
}
}
