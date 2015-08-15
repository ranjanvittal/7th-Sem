class mytest6{
    public static void main(String[] a){
        System.out.println(new MyStarter().start());
    }
}

class MyInt {
    int first;
    public int my_first() {
        return first;
    }
    public boolean assign_int(int val) {
        first = val;
        return true;
    }
}

class MyStarter {
    public int start() {
        MyInt a;
        boolean b;
        a = new MyInt();
        b = a.assign_int(10);
        return new MyFac().ComputeFac(a);
    }
}

class A {
    boolean fi;
    public boolean get_fi() {
        return fi;
    }
    public boolean set_fi(boolean a) {
        fi = a;
        return true;
    }
}

class MyFac {
    public int ComputeFac(MyInt num){
        int num_aux ;
        int accumulator;
        A a;
        boolean t;
        accumulator = 1;
        num_aux = 1;
        a = new A();
        t = a.set_fi(true);
        while(num_aux < ((num.my_first()) + 1)) {
            accumulator = (accumulator*num_aux);
            num_aux = num_aux + 1;
        }
        while( (a).get_fi() ) {
            a = new A();
            t = a.set_fi(false);
        }

        return accumulator ;
    }
}
