class mytest1 {
public static void main(String[] original_micro_a) {
new original_new_mytest1().original_print(new Runner());
}
}
class original_new_mytest1 {
public void original_print(Runner var_1) {
int original_b;
Class1 var_2;
original_b = 0;
original_b = 1;
var_2 = new Class1();
var_2.var_1 = var_1;
var_2.original_b = original_b;
var_2.latest_class_3 = this;
var_2.run();
}
}
class Runner {
public void run() {
}
}
class Class2 extends Runner {
Runner var_1;
int original_b;
Class1 var_4;
original_new_mytest1 latest_class_3;
Class3 var_6;
Class4 var_7;
public void run() {
if(0 < original_b)
{
var_6 = new Class3();
var_6.var_1 = var_1;
var_6.original_b = original_b;
var_6.var_4 = var_4;
var_6.latest_class_3 = latest_class_3;
var_6.var_6 = var_6;
var_6.var_7 = var_7;
var_6.run();
}
else
{
var_7 = new Class4();
var_7.var_1 = var_1;
var_7.original_b = original_b;
var_7.var_4 = var_4;
var_7.latest_class_3 = latest_class_3;
var_7.var_6 = var_6;
var_7.var_7 = var_7;
var_7.run();
}
}
}
class Class3 extends Runner {
Runner var_1;
int original_b;
Class1 var_4;
original_new_mytest1 latest_class_3;
Class3 var_6;
Class4 var_7;
public void run() {
System.out.println(0);
original_b = original_b - 1;
var_4.var_1 = var_1;
var_4.original_b = original_b;
var_4.var_4 = var_4;
var_4.latest_class_3 = latest_class_3;
var_4.run();
}
}
class Class4 extends Runner {
Runner var_1;
int original_b;
Class1 var_4;
original_new_mytest1 latest_class_3;
Class3 var_6;
Class4 var_7;
public void run() {
var_1.run();
}
}
class Class1 extends Runner {
Runner var_1;
int original_b;
original_new_mytest1 latest_class_3;
Class1 var_4;
Class2 var_5;
public void run() {
var_4 = new Class1();
var_5 = new Class2();
var_5.var_1 = var_1;
var_5.original_b = original_b;
var_5.var_4 = var_4;
var_5.latest_class_3 = latest_class_3;
var_5.run();
}
}
