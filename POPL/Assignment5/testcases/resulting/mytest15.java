class mytest15 {
public static void main(String[] original_micro_a) {
new original_new_mytest15().original_print(new Runner());
}
}
class original_new_mytest15 {
int original_first1;
int original_first2;
public void original_print(Runner var_1) {
original_new_mytest15 original_looks;
original_new_mytest15 original_looks2;
int[] original_b;
int original_i;
Class1 var_2;
original_looks = new original_new_mytest15();
original_looks2 = new original_new_mytest15();
original_b = new int [1];
original_i = 0;
original_first1 = 0;
original_first2 = 0;
original_looks = this;
original_looks2 = new original_new_mytest15();
original_looks2.original_first2 = 0;
original_looks2.original_first1 = 0;
var_2 = new Class1();
var_2.original_looks2 = original_looks2;
var_2.var_1 = var_1;
var_2.original_b = original_b;
var_2.original_looks = original_looks;
var_2.original_i = original_i;
var_2.latest_class_3 = this;
original_looks.original_initiate(original_looks2, var_2);
}
public void original_initiate(original_new_mytest15 original_looks, Runner var_4) {
original_new_mytest15 original_c;
Class2 var_5;
original_c = new original_new_mytest15();
original_c = this;
var_5 = new Class2();
var_5.original_c = original_c;
var_5.original_looks = original_looks;
var_5.var_4 = var_4;
var_5.latest_class_6 = this;
var_5.run();
}
}
class Runner {
public void run() {
}
}
class Class1 extends Runner {
original_new_mytest15 original_looks2;
Runner var_1;
int[] original_b;
original_new_mytest15 original_looks;
int original_i;
original_new_mytest15 latest_class_3;
public void run() {
int final_1;
int final_2;
int final_3;
int final_4;
final_1 = latest_class_3.original_first1;
System.out.println(final_1);
final_2 = latest_class_3.original_first2;
System.out.println(final_2);
latest_class_3.original_first1 = original_looks2.original_first1;
latest_class_3.original_first2 = original_looks2.original_first2;
final_3 = latest_class_3.original_first1;
System.out.println(final_3);
final_4 = latest_class_3.original_first2;
System.out.println(final_4);
var_1.run();
}
}
class Class3 extends Runner {
original_new_mytest15 original_c;
original_new_mytest15 original_looks;
Class2 var_7;
original_new_mytest15 latest_class_6;
Runner var_4;
Class4 var_9;
Class5 var_10;
Class7 var_12;
public void run() {
int final_5;
final_5 = latest_class_6.original_first1;
if(final_5 < 100)
{
var_9 = new Class4();
var_9.original_c = original_c;
var_9.original_looks = original_looks;
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
var_10.original_c = original_c;
var_10.original_looks = original_looks;
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
original_new_mytest15 original_c;
original_new_mytest15 original_looks;
Class2 var_7;
original_new_mytest15 latest_class_6;
Runner var_4;
Class4 var_9;
Class5 var_10;
Class7 var_12;
public void run() {
var_12 = new Class7();
var_12.var_10 = var_10;
var_12.original_c = original_c;
var_12.var_9 = var_9;
var_12.original_looks = original_looks;
var_12.latest_class_6 = latest_class_6;
var_12.var_7 = var_7;
var_12.var_4 = var_4;
var_12.run();
}
}
class Class8 extends Runner {
original_new_mytest15 original_c;
Class5 var_10;
original_new_mytest15 original_looks;
Class4 var_9;
Class2 var_7;
original_new_mytest15 latest_class_6;
Class7 var_13;
Runner var_4;
Class9 var_15;
Class10 var_16;
Class12 var_18;
public void run() {
int final_6;
final_6 = latest_class_6.original_first2;
if(final_6 < 100)
{
var_15 = new Class9();
var_15.original_c = original_c;
var_15.var_10 = var_10;
var_15.original_looks = original_looks;
var_15.var_9 = var_9;
var_15.var_7 = var_7;
var_15.latest_class_6 = latest_class_6;
var_15.var_13 = var_13;
var_15.var_4 = var_4;
var_15.var_15 = var_15;
var_15.var_16 = var_16;
var_15.run();
}
else
{
var_16 = new Class10();
var_16.original_c = original_c;
var_16.var_10 = var_10;
var_16.original_looks = original_looks;
var_16.var_9 = var_9;
var_16.var_7 = var_7;
var_16.latest_class_6 = latest_class_6;
var_16.var_13 = var_13;
var_16.var_4 = var_4;
var_16.var_15 = var_15;
var_16.var_16 = var_16;
var_16.run();
}
}
}
class Class9 extends Runner {
original_new_mytest15 original_c;
Class5 var_10;
original_new_mytest15 original_looks;
Class4 var_9;
Class2 var_7;
original_new_mytest15 latest_class_6;
Class7 var_13;
Runner var_4;
Class9 var_15;
Class10 var_16;
Class12 var_18;
public void run() {
int final_7;
int final_8;
int final_9;
int final_10;
final_7 = latest_class_6.original_first1;
original_looks.original_first1 = final_7 + 1;
final_8 = latest_class_6.original_first2;
original_looks.original_first2 = final_8 + 1;
final_9 = latest_class_6.original_first1;
System.out.println(final_9);
final_10 = latest_class_6.original_first2;
System.out.println(final_10);
System.out.println(original_looks.original_first1);
System.out.println(original_looks.original_first2);
var_18 = new Class12();
var_18.var_16 = var_16;
var_18.var_15 = var_15;
var_18.var_13 = var_13;
var_18.original_c = original_c;
var_18.var_10 = var_10;
var_18.latest_class_6 = latest_class_6;
var_18.var_9 = var_9;
var_18.var_7 = var_7;
var_18.var_4 = var_4;
var_18.original_looks = original_looks;
original_looks.original_initiate(original_c, var_18);
}
}
class Class12 extends Runner {
Class10 var_16;
Class9 var_15;
Class7 var_13;
original_new_mytest15 original_c;
Class5 var_10;
original_new_mytest15 latest_class_6;
Class4 var_9;
Class2 var_7;
Runner var_4;
original_new_mytest15 original_looks;
public void run() {
var_13.var_13 = var_13;
var_13.original_c = original_c;
var_13.var_10 = var_10;
var_13.latest_class_6 = latest_class_6;
var_13.var_9 = var_9;
var_13.var_7 = var_7;
var_13.var_4 = var_4;
var_13.original_looks = original_looks;
var_13.run();
}
}
class Class10 extends Runner {
original_new_mytest15 original_c;
Class5 var_10;
original_new_mytest15 original_looks;
Class4 var_9;
Class2 var_7;
original_new_mytest15 latest_class_6;
Class7 var_13;
Runner var_4;
Class9 var_15;
Class10 var_16;
Class12 var_18;
public void run() {
var_7.original_c = original_c;
var_7.original_looks = original_looks;
var_7.var_7 = var_7;
var_7.latest_class_6 = latest_class_6;
var_7.var_4 = var_4;
var_7.run();
}
}
class Class7 extends Runner {
Class5 var_10;
original_new_mytest15 original_c;
Class4 var_9;
original_new_mytest15 original_looks;
original_new_mytest15 latest_class_6;
Class2 var_7;
Runner var_4;
Class7 var_13;
Class8 var_14;
public void run() {
var_13 = new Class7();
var_14 = new Class8();
var_14.original_c = original_c;
var_14.var_10 = var_10;
var_14.original_looks = original_looks;
var_14.var_9 = var_9;
var_14.var_7 = var_7;
var_14.latest_class_6 = latest_class_6;
var_14.var_13 = var_13;
var_14.var_4 = var_4;
var_14.run();
}
}
class Class5 extends Runner {
original_new_mytest15 original_c;
original_new_mytest15 original_looks;
Class2 var_7;
original_new_mytest15 latest_class_6;
Runner var_4;
Class4 var_9;
Class5 var_10;
Class7 var_12;
public void run() {
int final_11;
int final_12;
final_11 = latest_class_6.original_first2;
original_looks.original_first1 = final_11 + 1;
final_12 = latest_class_6.original_first1;
original_looks.original_first2 = final_12 + 1;
var_4.run();
}
}
class Class2 extends Runner {
original_new_mytest15 original_c;
original_new_mytest15 original_looks;
Runner var_4;
original_new_mytest15 latest_class_6;
Class2 var_7;
Class3 var_8;
public void run() {
var_7 = new Class2();
var_8 = new Class3();
var_8.original_c = original_c;
var_8.original_looks = original_looks;
var_8.var_7 = var_7;
var_8.latest_class_6 = latest_class_6;
var_8.var_4 = var_4;
var_8.run();
}
}
