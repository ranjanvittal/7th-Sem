class mytest11 {
public static void main(String[] original_micro_a) {
new original_new_mytest11().original_print(new Runner());
}
}
class original_new_mytest11 {
int original_first;
public void original_print(Runner var_1) {
original_new_mytest11 original_a;
Class1 var_2;
original_a = new original_new_mytest11();
original_a = this;
original_first = 0;
var_2 = new Class1();
var_2.var_1 = var_1;
var_2.original_a = original_a;
var_2.latest_class_3 = this;
original_a.original_start(var_2);
}
public void original_start(Runner var_5) {
original_new_mytest11 original_a;
Class3 var_6;
original_a = new original_new_mytest11();
var_6 = new Class3();
var_6.original_a = original_a;
var_6.var_5 = var_5;
var_6.latest_class_7 = this;
var_6.run();
}
public void original_end(Runner var_12) {
original_new_mytest11 original_a;
Class8 var_13;
original_a = new original_new_mytest11();
original_first = original_first + 1;
original_a = this;
var_13 = new Class8();
var_13.var_12 = var_12;
var_13.original_a = original_a;
var_13.latest_class_14 = this;
original_a.original_start(var_13);
}
}
class Runner {
public void run() {
}
}
class Class2 extends Runner {
Runner var_1;
original_new_mytest11 original_a;
original_new_mytest11 latest_class_3;
public void run() {
var_1.run();
}
}
class Class1 extends Runner {
Runner var_1;
original_new_mytest11 original_a;
original_new_mytest11 latest_class_3;
Class2 var_4;
public void run() {
var_4 = new Class2();
var_4.var_1 = var_1;
var_4.original_a = original_a;
var_4.latest_class_3 = latest_class_3;
original_a.original_end(var_4);
}
}
class Class3 extends Runner {
original_new_mytest11 original_a;
Runner var_5;
original_new_mytest11 latest_class_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
Class7 var_11;
public void run() {
int final_1;
final_1 = latest_class_7.original_first;
if(final_1 < 100)
{
var_8 = new Class4();
var_10 = new Class6();
var_8.original_a = original_a;
var_8.var_5 = var_5;
var_8.latest_class_7 = latest_class_7;
var_8.var_8 = var_8;
var_8.var_9 = var_9;
var_8.var_10 = var_10;
var_8.run();
}
else
{
var_9 = new Class5();
var_10 = new Class6();
var_9.original_a = original_a;
var_9.var_5 = var_5;
var_9.latest_class_7 = latest_class_7;
var_9.var_8 = var_8;
var_9.var_9 = var_9;
var_9.var_10 = var_10;
var_9.run();
}
}
}
class Class4 extends Runner {
original_new_mytest11 original_a;
Runner var_5;
original_new_mytest11 latest_class_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
Class7 var_11;
public void run() {
original_a = latest_class_7;
var_11 = new Class7();
var_11.var_10 = var_10;
var_11.original_a = original_a;
var_11.var_9 = var_9;
var_11.var_8 = var_8;
var_11.latest_class_7 = latest_class_7;
var_11.var_5 = var_5;
original_a.original_end(var_11);
}
}
class Class7 extends Runner {
Class6 var_10;
original_new_mytest11 original_a;
Class5 var_9;
Class4 var_8;
original_new_mytest11 latest_class_7;
Runner var_5;
public void run() {
int final_2;
int final_3;
final_2 = latest_class_7.original_first;
latest_class_7.original_first = final_2 + 1;
final_3 = latest_class_7.original_first;
System.out.println(final_3);
var_10.original_a = original_a;
var_10.var_5 = var_5;
var_10.latest_class_7 = latest_class_7;
var_10.var_8 = var_8;
var_10.var_9 = var_9;
var_10.var_10 = var_10;
var_10.var_10 = var_10;
var_10.original_a = original_a;
var_10.var_9 = var_9;
var_10.var_8 = var_8;
var_10.latest_class_7 = latest_class_7;
var_10.var_5 = var_5;
var_10.run();
}
}
class Class5 extends Runner {
original_new_mytest11 original_a;
Runner var_5;
original_new_mytest11 latest_class_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
Class7 var_11;
public void run() {
var_10.original_a = original_a;
var_10.var_5 = var_5;
var_10.latest_class_7 = latest_class_7;
var_10.var_8 = var_8;
var_10.var_9 = var_9;
var_10.var_10 = var_10;
var_10.original_a = original_a;
var_10.var_5 = var_5;
var_10.latest_class_7 = latest_class_7;
var_10.var_8 = var_8;
var_10.var_9 = var_9;
var_10.var_10 = var_10;
var_10.var_11 = var_11;
var_10.run();
}
}
class Class6 extends Runner {
original_new_mytest11 original_a;
Runner var_5;
original_new_mytest11 latest_class_7;
Class4 var_8;
Class5 var_9;
Class6 var_10;
Class7 var_11;
public void run() {
var_5.run();
}
}
class Class8 extends Runner {
Runner var_12;
original_new_mytest11 original_a;
original_new_mytest11 latest_class_14;
public void run() {
int final_4;
final_4 = latest_class_14.original_first;
System.out.println(final_4);
var_12.run();
}
}
