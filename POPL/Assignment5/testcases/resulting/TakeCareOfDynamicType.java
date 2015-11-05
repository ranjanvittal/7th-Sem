class TakeCareOfDynamicType {
public static void main(String[] original_a) {
new original_realMain().original_mainFunction(new Runner());
}
}
class original_c1 {
int original_real;
public void original_dynamism(int original_a, Runner var_1) {
int original_a_aux;
original_a_aux = 0;
original_a_aux = original_a;
original_real = 0;
System.out.println(original_a_aux);
var_1.run();
}
}
class original_c2 extends original_c1{
public void original_dynamism(int original_a, Runner var_2) {
int original_a_aux;
original_a_aux = 0;
original_a_aux = original_a;
original_real = 5;
System.out.println(original_a_aux);
var_2.run();
}
}
class original_c3 extends original_c1{
public void original_dynamism(int original_a, Runner var_3) {
int original_a_aux;
original_a_aux = 0;
original_a_aux = original_a;
original_real = 10;
System.out.println(original_a_aux);
var_3.run();
}
}
class original_realMain {
public void original_mainFunction(Runner var_4) {
original_c2 original_c1Object1;
original_c3 original_c1Object2;
original_c1 original_c1Object3;
original_c1 original_c1Object4;
Class1 var_5;
original_c1Object1 = new original_c2();
original_c1Object2 = new original_c3();
original_c1Object3 = new original_c1();
original_c1Object4 = new original_c1();
original_c1Object1 = new original_c2();
original_c1Object2 = new original_c3();
var_5 = new Class1();
var_5.original_c1Object4 = original_c1Object4;
var_5.original_c1Object3 = original_c1Object3;
var_5.original_c1Object2 = original_c1Object2;
var_5.original_c1Object1 = original_c1Object1;
var_5.var_4 = var_4;
var_5.latest_class_6 = this;
original_c1Object1.original_dynamism(1, var_5);
}
}
class Runner {
public void run() {
}
}
class Class4 extends Runner {
original_c1 original_c1Object4;
original_c1 original_c1Object3;
original_c3 original_c1Object2;
original_c2 original_c1Object1;
original_realMain latest_class_6;
Runner var_4;
public void run() {
System.out.println(original_c1Object1.original_real);
System.out.println(original_c1Object2.original_real);
System.out.println(original_c1Object3.original_real);
System.out.println(original_c1Object4.original_real);
var_4.run();
}
}
class Class3 extends Runner {
original_c1 original_c1Object4;
original_c1 original_c1Object3;
original_c3 original_c1Object2;
original_c2 original_c1Object1;
original_realMain latest_class_6;
Runner var_4;
Class4 var_9;
public void run() {
original_c1Object4 = new original_c2();
var_9 = new Class4();
var_9.original_c1Object4 = original_c1Object4;
var_9.original_c1Object3 = original_c1Object3;
var_9.original_c1Object2 = original_c1Object2;
var_9.original_c1Object1 = original_c1Object1;
var_9.latest_class_6 = latest_class_6;
var_9.var_4 = var_4;
original_c1Object4.original_dynamism(4, var_9);
}
}
class Class2 extends Runner {
original_c1 original_c1Object4;
original_c1 original_c1Object3;
original_c3 original_c1Object2;
original_c2 original_c1Object1;
original_realMain latest_class_6;
Runner var_4;
Class3 var_8;
public void run() {
original_c1Object3 = new original_c3();
var_8 = new Class3();
var_8.original_c1Object4 = original_c1Object4;
var_8.original_c1Object3 = original_c1Object3;
var_8.original_c1Object2 = original_c1Object2;
var_8.original_c1Object1 = original_c1Object1;
var_8.latest_class_6 = latest_class_6;
var_8.var_4 = var_4;
original_c1Object3.original_dynamism(3, var_8);
}
}
class Class1 extends Runner {
original_c1 original_c1Object4;
original_c1 original_c1Object3;
original_c3 original_c1Object2;
original_c2 original_c1Object1;
Runner var_4;
original_realMain latest_class_6;
Class2 var_7;
public void run() {
var_7 = new Class2();
var_7.original_c1Object4 = original_c1Object4;
var_7.original_c1Object3 = original_c1Object3;
var_7.original_c1Object2 = original_c1Object2;
var_7.original_c1Object1 = original_c1Object1;
var_7.latest_class_6 = latest_class_6;
var_7.var_4 = var_4;
original_c1Object2.original_dynamism(2, var_7);
}
}
