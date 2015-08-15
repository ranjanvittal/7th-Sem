class mytest1{
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
class MyFac {
    public int ComputeFac(MyInt num){
        int num_aux ;
        int accumulator;
        accumulator = 1;
        num_aux = 1;
        while(num_aux < ((num.my_first()) + 1)) {
            accumulator = (accumulator*num_aux);
            num_aux = num_aux + 1;
        }
        return accumulator ;
    }
}
