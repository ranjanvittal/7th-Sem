class t5 {

    public static void main(String[] a) {
        new MyDummyClass().MyDummyMethod();
    }
}

class MyDummyClass {

    public void MyDummyMethod() {
        int print;
        Fac tmp0;
        tmp0 = new Fac();
        tmp0.init();
        tmp0.init2(tmp0);
        tmp0.ComputeFac(10);
        print = tmp0.a;
        System.out.println(print);
    }
}

class Fac {
	
    int a;

    public void init() {
        a=0;
    }

    public void init2(Fac a) {
        Fac b;
        b=a;
        b=new Fac();
    }

    public void ComputeFac(int a) {
        Fac tmp1;
        tmp1 = this;
        tmp1.a = a+1;
    }
}

