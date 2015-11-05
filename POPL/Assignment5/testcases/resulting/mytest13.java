class mytest13 {
public static void main(String[] original_micro_a) {
new original_new_mytest13().original_print(new Runner());
}
}
class original_new_mytest13 {
int original_first;
public void original_print(Runner var_1) {
original_new_mytest13 original_a;
Class1 var_2;
original_a = new original_new_mytest13();
original_a = this;
original_first = 0;
var_2 = new Class1();
var_2.var_1 = var_1;
var_2.original_a = original_a;
var_2.latest_class_3 = this;
original_a.original_start(var_2);
}
public void original_start(Runner var_5) {
original_new_mytest13 original_a;
Class3 var_6;
original_a = new original_new_mytest13();
original_a = this;
var_6 = new Class3();
var_6.original_a = original_a;
var_6.var_5 = var_5;
var_6.latest_class_7 = this;
var_6.run();
}
public void original_end(Runner var_14) {
original_new_mytest13 original_a;
Class9 var_15;
original_a = new original_new_mytest13();
original_first = original_first + 1;
original_a = this;
var_15 = new Class9();
var_15.original_a = original_a;
var_15.var_14 = var_14;
var_15.latest_class_16 = this;
var_15.run();
}
}
class Runner {
public void run() {
}
}
class Class2 extends Runner {
Runner var_1;
original_new_mytest13 original_a;
original_new_mytest13 latest_class_3;
public void run() {
var_1.run();
}
}
class Class1 extends Runner {
Runner var_1;
original_new_mytest13 original_a;
original_new_mytest13 latest_class_3;
Class2 var_4;
public void run() {
var_4 = new Class2();
var_4.var_1 = var_1;
var_4.original_a = original_a;
var_4.latest_class_3 = latest_class_3;
original_a.original_end(var_4);
}
}
class Class4 extends Runner {
original_new_mytest13 original_a;
Class3 var_8;
original_new_mytest13 latest_class_7;
Runner var_5;
Class5 var_10;
Class6 var_11;
Class8 var_13;
public void run() {
int final_1;
final_1 = latest_class_7.original_first;
if(final_1 < 200)
{
var_10 = new Class5();
var_10.original_a = original_a;
var_10.var_8 = var_8;
var_10.latest_class_7 = latest_class_7;
var_10.var_5 = var_5;
var_10.var_10 = var_10;
var_10.var_11 = var_11;
var_10.run();
}
else
{
var_11 = new Class6();
var_11.original_a = original_a;
var_11.var_8 = var_8;
var_11.latest_class_7 = latest_class_7;
var_11.var_5 = var_5;
var_11.var_10 = var_10;
var_11.var_11 = var_11;
var_11.run();
}
}
}
class Class5 extends Runner {
original_new_mytest13 original_a;
Class3 var_8;
original_new_mytest13 latest_class_7;
Runner var_5;
Class5 var_10;
Class6 var_11;
Class8 var_13;
public void run() {
var_13 = new Class8();
var_13.var_11 = var_11;
var_13.var_10 = var_10;
var_13.original_a = original_a;
var_13.latest_class_7 = latest_class_7;
var_13.var_8 = var_8;
var_13.var_5 = var_5;
original_a.original_end(var_13);
}
}
class Class8 extends Runner {
Class6 var_11;
Class5 var_10;
original_new_mytest13 original_a;
original_new_mytest13 latest_class_7;
Class3 var_8;
Runner var_5;
public void run() {
int final_2;
final_2 = latest_class_7.original_first;
System.out.println(final_2);
var_8.original_a = original_a;
var_8.latest_class_7 = latest_class_7;
var_8.var_8 = var_8;
var_8.var_5 = var_5;
var_8.run();
}
}
class Class6 extends Runner {
original_new_mytest13 original_a;
Class3 var_8;
original_new_mytest13 latest_class_7;
Runner var_5;
Class5 var_10;
Class6 var_11;
Class8 var_13;
public void run() {
var_5.run();
}
}
class Class3 extends Runner {
original_new_mytest13 original_a;
Runner var_5;
original_new_mytest13 latest_class_7;
Class3 var_8;
Class4 var_9;
public void run() {
var_8 = new Class3();
var_9 = new Class4();
var_9.original_a = original_a;
var_9.var_8 = var_8;
var_9.latest_class_7 = latest_class_7;
var_9.var_5 = var_5;
var_9.run();
}
}
class Class10 extends Runner {
original_new_mytest13 latest_class_16;
original_new_mytest13 original_a;
Class9 var_17;
Runner var_14;
Class11 var_19;
Class12 var_20;
Class14 var_22;
public void run() {
int final_3;
final_3 = latest_class_16.original_first;
if(final_3 < 200)
{
var_19 = new Class11();
var_19.latest_class_16 = latest_class_16;
var_19.original_a = original_a;
var_19.var_17 = var_17;
var_19.var_14 = var_14;
var_19.var_19 = var_19;
var_19.var_20 = var_20;
var_19.run();
}
else
{
var_20 = new Class12();
var_20.latest_class_16 = latest_class_16;
var_20.original_a = original_a;
var_20.var_17 = var_17;
var_20.var_14 = var_14;
var_20.var_19 = var_19;
var_20.var_20 = var_20;
var_20.run();
}
}
}
class Class11 extends Runner {
original_new_mytest13 latest_class_16;
original_new_mytest13 original_a;
Class9 var_17;
Runner var_14;
Class11 var_19;
Class12 var_20;
Class14 var_22;
public void run() {
var_22 = new Class14();
var_22.latest_class_16 = latest_class_16;
var_22.var_20 = var_20;
var_22.var_19 = var_19;
var_22.original_a = original_a;
var_22.var_17 = var_17;
var_22.var_14 = var_14;
original_a.original_start(var_22);
}
}
class Class14 extends Runner {
original_new_mytest13 latest_class_16;
Class12 var_20;
Class11 var_19;
original_new_mytest13 original_a;
Class9 var_17;
Runner var_14;
public void run() {
int final_4;
final_4 = latest_class_16.original_first;
System.out.println(final_4);
var_17.latest_class_16 = latest_class_16;
var_17.original_a = original_a;
var_17.var_17 = var_17;
var_17.var_14 = var_14;
var_17.run();
}
}
class Class12 extends Runner {
original_new_mytest13 latest_class_16;
original_new_mytest13 original_a;
Class9 var_17;
Runner var_14;
Class11 var_19;
Class12 var_20;
Class14 var_22;
public void run() {
var_14.run();
}
}
class Class9 extends Runner {
original_new_mytest13 original_a;
Runner var_14;
original_new_mytest13 latest_class_16;
Class9 var_17;
Class10 var_18;
public void run() {
var_17 = new Class9();
var_18 = new Class10();
var_18.latest_class_16 = latest_class_16;
var_18.original_a = original_a;
var_18.var_17 = var_17;
var_18.var_14 = var_14;
var_18.run();
}
}
