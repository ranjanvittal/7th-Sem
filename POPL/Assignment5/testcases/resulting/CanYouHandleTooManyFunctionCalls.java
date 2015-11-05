class CanYouHandleTooManyFunctionCalls {
public static void main(String[] original_a) {
new original_realMain().original_mainFunction(new Runner());
}
}
class original_c1 {
int original_a;
boolean original_real;
public void original_callFunction(original_c3 original_object, Runner var_1) {
int original_aux;
int original_one;
original_c3 original_c3Object1;
Class1 var_2;
original_aux = 0;
original_one = 0;
original_c3Object1 = new original_c3();
original_a = original_object.original_a;
original_one = 0;
original_c3Object1 = original_object;
original_aux = original_object.original_a;
original_object.original_a = original_aux - 1;
original_a = original_a - 1;
var_2 = new Class1();
var_2.var_1 = var_1;
var_2.original_c3Object1 = original_c3Object1;
var_2.original_aux = original_aux;
var_2.original_object = original_object;
var_2.original_one = original_one;
var_2.latest_class_3 = this;
var_2.run();
}
}
class original_c2 {
int original_a;
}
class original_c3 extends original_c2{
public void original_callFunction(original_c1 original_object, Runner var_8) {
int original_aux;
int original_one;
original_c1 original_c3Object1;
Class6 var_9;
original_aux = 0;
original_one = 0;
original_c3Object1 = new original_c1();
original_one = 0;
original_a = original_object.original_a;
original_c3Object1 = original_object;
original_aux = original_object.original_a;
original_object.original_a = original_aux - 1;
original_a = original_a - 1;
var_9 = new Class6();
var_9.original_c3Object1 = original_c3Object1;
var_9.original_aux = original_aux;
var_9.original_object = original_object;
var_9.var_8 = var_8;
var_9.original_one = original_one;
var_9.latest_class_10 = this;
var_9.run();
}
}
class original_realMain {
public void original_mainFunction(Runner var_15) {
boolean original_b1;
original_c1 original_c1Object1;
original_c3 original_c3Object1;
Class11 var_16;
original_b1 = false;
original_c1Object1 = new original_c1();
original_c3Object1 = new original_c3();
original_c1Object1 = new original_c1();
original_c3Object1 = new original_c3();
original_c3Object1.original_a = 0;
original_c1Object1.original_real = false;
var_16 = new Class11();
var_16.original_c3Object1 = original_c3Object1;
var_16.original_b1 = original_b1;
var_16.original_c1Object1 = original_c1Object1;
var_16.var_15 = var_15;
var_16.latest_class_17 = this;
original_c1Object1.original_callFunction(original_c3Object1, var_16);
}
}
class Runner {
public void run() {
}
}
class Class1 extends Runner {
Runner var_1;
original_c3 original_c3Object1;
int original_aux;
original_c3 original_object;
int original_one;
original_c1 latest_class_3;
Class2 var_4;
Class3 var_5;
Class4 var_6;
Class5 var_7;
public void run() {
if(original_one < original_aux)
{
var_4 = new Class2();
var_6 = new Class4();
var_4.var_1 = var_1;
var_4.original_c3Object1 = original_c3Object1;
var_4.original_aux = original_aux;
var_4.original_object = original_object;
var_4.original_one = original_one;
var_4.latest_class_3 = latest_class_3;
var_4.var_4 = var_4;
var_4.var_5 = var_5;
var_4.var_6 = var_6;
var_4.run();
}
else
{
var_5 = new Class3();
var_6 = new Class4();
var_5.var_1 = var_1;
var_5.original_c3Object1 = original_c3Object1;
var_5.original_aux = original_aux;
var_5.original_object = original_object;
var_5.original_one = original_one;
var_5.latest_class_3 = latest_class_3;
var_5.var_4 = var_4;
var_5.var_5 = var_5;
var_5.var_6 = var_6;
var_5.run();
}
}
}
class Class2 extends Runner {
Runner var_1;
original_c3 original_c3Object1;
int original_aux;
original_c3 original_object;
int original_one;
original_c1 latest_class_3;
Class2 var_4;
Class3 var_5;
Class4 var_6;
Class5 var_7;
public void run() {
latest_class_3.original_real = false;
var_7 = new Class5();
var_7.var_1 = var_1;
var_7.original_aux = original_aux;
var_7.original_object = original_object;
var_7.latest_class_3 = latest_class_3;
var_7.var_6 = var_6;
var_7.var_5 = var_5;
var_7.original_one = original_one;
var_7.original_c3Object1 = original_c3Object1;
var_7.var_4 = var_4;
original_object.original_callFunction(latest_class_3, var_7);
}
}
class Class5 extends Runner {
Runner var_1;
int original_aux;
original_c3 original_object;
original_c1 latest_class_3;
Class4 var_6;
Class3 var_5;
int original_one;
original_c3 original_c3Object1;
Class2 var_4;
public void run() {
int final_1;
final_1 = latest_class_3.original_a;
original_aux = final_1;
var_6.var_1 = var_1;
var_6.original_c3Object1 = original_c3Object1;
var_6.original_aux = original_aux;
var_6.original_object = original_object;
var_6.original_one = original_one;
var_6.latest_class_3 = latest_class_3;
var_6.var_4 = var_4;
var_6.var_5 = var_5;
var_6.var_6 = var_6;
var_6.var_1 = var_1;
var_6.original_aux = original_aux;
var_6.original_object = original_object;
var_6.latest_class_3 = latest_class_3;
var_6.var_6 = var_6;
var_6.var_5 = var_5;
var_6.original_one = original_one;
var_6.original_c3Object1 = original_c3Object1;
var_6.var_4 = var_4;
var_6.run();
}
}
class Class3 extends Runner {
Runner var_1;
original_c3 original_c3Object1;
int original_aux;
original_c3 original_object;
int original_one;
original_c1 latest_class_3;
Class2 var_4;
Class3 var_5;
Class4 var_6;
Class5 var_7;
public void run() {
var_6.var_1 = var_1;
var_6.original_c3Object1 = original_c3Object1;
var_6.original_aux = original_aux;
var_6.original_object = original_object;
var_6.original_one = original_one;
var_6.latest_class_3 = latest_class_3;
var_6.var_4 = var_4;
var_6.var_5 = var_5;
var_6.var_6 = var_6;
var_6.var_1 = var_1;
var_6.original_c3Object1 = original_c3Object1;
var_6.original_aux = original_aux;
var_6.original_object = original_object;
var_6.original_one = original_one;
var_6.latest_class_3 = latest_class_3;
var_6.var_4 = var_4;
var_6.var_5 = var_5;
var_6.var_6 = var_6;
var_6.var_7 = var_7;
var_6.run();
}
}
class Class4 extends Runner {
Runner var_1;
original_c3 original_c3Object1;
int original_aux;
original_c3 original_object;
int original_one;
original_c1 latest_class_3;
Class2 var_4;
Class3 var_5;
Class4 var_6;
Class5 var_7;
public void run() {
latest_class_3.original_real = true;
var_1.run();
}
}
class Class6 extends Runner {
original_c1 original_c3Object1;
int original_aux;
original_c1 original_object;
Runner var_8;
int original_one;
original_c3 latest_class_10;
Class7 var_11;
Class8 var_12;
Class9 var_13;
Class10 var_14;
public void run() {
if(original_one < original_aux)
{
var_11 = new Class7();
var_13 = new Class9();
var_11.original_c3Object1 = original_c3Object1;
var_11.original_aux = original_aux;
var_11.original_object = original_object;
var_11.var_8 = var_8;
var_11.original_one = original_one;
var_11.latest_class_10 = latest_class_10;
var_11.var_11 = var_11;
var_11.var_12 = var_12;
var_11.var_13 = var_13;
var_11.run();
}
else
{
var_12 = new Class8();
var_13 = new Class9();
var_12.original_c3Object1 = original_c3Object1;
var_12.original_aux = original_aux;
var_12.original_object = original_object;
var_12.var_8 = var_8;
var_12.original_one = original_one;
var_12.latest_class_10 = latest_class_10;
var_12.var_11 = var_11;
var_12.var_12 = var_12;
var_12.var_13 = var_13;
var_12.run();
}
}
}
class Class7 extends Runner {
original_c1 original_c3Object1;
int original_aux;
original_c1 original_object;
Runner var_8;
int original_one;
original_c3 latest_class_10;
Class7 var_11;
Class8 var_12;
Class9 var_13;
Class10 var_14;
public void run() {
var_14 = new Class10();
var_14.var_13 = var_13;
var_14.var_12 = var_12;
var_14.var_11 = var_11;
var_14.original_aux = original_aux;
var_14.original_object = original_object;
var_14.var_8 = var_8;
var_14.original_one = original_one;
var_14.original_c3Object1 = original_c3Object1;
var_14.latest_class_10 = latest_class_10;
original_c3Object1.original_callFunction(latest_class_10, var_14);
}
}
class Class10 extends Runner {
Class9 var_13;
Class8 var_12;
Class7 var_11;
int original_aux;
original_c1 original_object;
Runner var_8;
int original_one;
original_c1 original_c3Object1;
original_c3 latest_class_10;
public void run() {
int final_2;
final_2 = latest_class_10.original_a;
original_aux = final_2;
var_13.original_c3Object1 = original_c3Object1;
var_13.original_aux = original_aux;
var_13.original_object = original_object;
var_13.var_8 = var_8;
var_13.original_one = original_one;
var_13.latest_class_10 = latest_class_10;
var_13.var_11 = var_11;
var_13.var_12 = var_12;
var_13.var_13 = var_13;
var_13.var_13 = var_13;
var_13.var_12 = var_12;
var_13.var_11 = var_11;
var_13.original_aux = original_aux;
var_13.original_object = original_object;
var_13.var_8 = var_8;
var_13.original_one = original_one;
var_13.original_c3Object1 = original_c3Object1;
var_13.latest_class_10 = latest_class_10;
var_13.run();
}
}
class Class8 extends Runner {
original_c1 original_c3Object1;
int original_aux;
original_c1 original_object;
Runner var_8;
int original_one;
original_c3 latest_class_10;
Class7 var_11;
Class8 var_12;
Class9 var_13;
Class10 var_14;
public void run() {
var_13.original_c3Object1 = original_c3Object1;
var_13.original_aux = original_aux;
var_13.original_object = original_object;
var_13.var_8 = var_8;
var_13.original_one = original_one;
var_13.latest_class_10 = latest_class_10;
var_13.var_11 = var_11;
var_13.var_12 = var_12;
var_13.var_13 = var_13;
var_13.original_c3Object1 = original_c3Object1;
var_13.original_aux = original_aux;
var_13.original_object = original_object;
var_13.var_8 = var_8;
var_13.original_one = original_one;
var_13.latest_class_10 = latest_class_10;
var_13.var_11 = var_11;
var_13.var_12 = var_12;
var_13.var_13 = var_13;
var_13.var_14 = var_14;
var_13.run();
}
}
class Class9 extends Runner {
original_c1 original_c3Object1;
int original_aux;
original_c1 original_object;
Runner var_8;
int original_one;
original_c3 latest_class_10;
Class7 var_11;
Class8 var_12;
Class9 var_13;
Class10 var_14;
public void run() {
original_object.original_real = false;
var_8.run();
}
}
class Class12 extends Runner {
original_realMain latest_class_17;
boolean original_b1;
original_c3 original_c3Object1;
original_c1 original_c1Object1;
Runner var_15;
Class13 var_19;
Class14 var_20;
Class15 var_21;
public void run() {
if(original_b1)
{
var_19 = new Class13();
var_21 = new Class15();
var_19.latest_class_17 = latest_class_17;
var_19.original_b1 = original_b1;
var_19.original_c3Object1 = original_c3Object1;
var_19.original_c1Object1 = original_c1Object1;
var_19.var_15 = var_15;
var_19.var_19 = var_19;
var_19.var_20 = var_20;
var_19.var_21 = var_21;
var_19.run();
}
else
{
var_20 = new Class14();
var_21 = new Class15();
var_20.latest_class_17 = latest_class_17;
var_20.original_b1 = original_b1;
var_20.original_c3Object1 = original_c3Object1;
var_20.original_c1Object1 = original_c1Object1;
var_20.var_15 = var_15;
var_20.var_19 = var_19;
var_20.var_20 = var_20;
var_20.var_21 = var_21;
var_20.run();
}
}
}
class Class13 extends Runner {
original_realMain latest_class_17;
boolean original_b1;
original_c3 original_c3Object1;
original_c1 original_c1Object1;
Runner var_15;
Class13 var_19;
Class14 var_20;
Class15 var_21;
public void run() {
System.out.println(1);
var_21.latest_class_17 = latest_class_17;
var_21.original_b1 = original_b1;
var_21.original_c3Object1 = original_c3Object1;
var_21.original_c1Object1 = original_c1Object1;
var_21.var_15 = var_15;
var_21.var_19 = var_19;
var_21.var_20 = var_20;
var_21.var_21 = var_21;
var_21.latest_class_17 = latest_class_17;
var_21.original_b1 = original_b1;
var_21.original_c3Object1 = original_c3Object1;
var_21.original_c1Object1 = original_c1Object1;
var_21.var_15 = var_15;
var_21.var_19 = var_19;
var_21.var_20 = var_20;
var_21.var_21 = var_21;
var_21.run();
}
}
class Class14 extends Runner {
original_realMain latest_class_17;
boolean original_b1;
original_c3 original_c3Object1;
original_c1 original_c1Object1;
Runner var_15;
Class13 var_19;
Class14 var_20;
Class15 var_21;
public void run() {
System.out.println(0);
var_21.latest_class_17 = latest_class_17;
var_21.original_b1 = original_b1;
var_21.original_c3Object1 = original_c3Object1;
var_21.original_c1Object1 = original_c1Object1;
var_21.var_15 = var_15;
var_21.var_19 = var_19;
var_21.var_20 = var_20;
var_21.var_21 = var_21;
var_21.latest_class_17 = latest_class_17;
var_21.original_b1 = original_b1;
var_21.original_c3Object1 = original_c3Object1;
var_21.original_c1Object1 = original_c1Object1;
var_21.var_15 = var_15;
var_21.var_19 = var_19;
var_21.var_20 = var_20;
var_21.var_21 = var_21;
var_21.run();
}
}
class Class15 extends Runner {
original_realMain latest_class_17;
boolean original_b1;
original_c3 original_c3Object1;
original_c1 original_c1Object1;
Runner var_15;
Class13 var_19;
Class14 var_20;
Class15 var_21;
public void run() {
var_15.run();
}
}
class Class11 extends Runner {
original_c3 original_c3Object1;
boolean original_b1;
original_c1 original_c1Object1;
Runner var_15;
original_realMain latest_class_17;
Class12 var_18;
public void run() {
original_b1 = original_c1Object1.original_real;
var_18 = new Class12();
var_18.latest_class_17 = latest_class_17;
var_18.original_b1 = original_b1;
var_18.original_c3Object1 = original_c3Object1;
var_18.original_c1Object1 = original_c1Object1;
var_18.var_15 = var_15;
var_18.run();
}
}
