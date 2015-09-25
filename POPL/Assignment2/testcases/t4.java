class t4 {

    public static void main(String[] a) {
        new MyDummyClass().MyDummyMethod();
    }
}

class MyDummyClass {

    public void MyDummyMethod() {
        int print;
        Parent tmp0;
        tmp0 = new Base();
        tmp0.init();
        tmp0.inc();
        print = tmp0.a;
        System.out.println(print);
    }
}

class Parent {
	
    int a;

    public void init() {
        a = 0;
    }

    public void inc() {
        a = a+1;
    }
}

class Base extends Parent{

    public void init() {
        a = 1000;
    }

    public void dec() {
        a = a-1;
    }
}

