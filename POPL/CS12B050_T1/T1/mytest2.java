class mytest2{
    public static void main(String[] a){
        System.out.println(new MyStarter2().start());
    }
}

class MyInt2 {
    int first;
    public int my_first() {
        return first;
    }
    public boolean assign_int(int val) {
        first = val;
        return true;
    }
}

class MyStarter2 {
    public int start() {
        MyInt2 num;
        MyInt2 accumulator;
        boolean b;
        num = new MyInt2();
        accumulator = new MyInt2();
        b = num.assign_int(10);
        return (new MyFac2().ComputeFac(num, accumulator)).my_first();
    }
}
class MyFac2 {
    public MyInt2 ComputeFac(MyInt2 num, MyInt2 accumulator){
        int num_aux ;
        boolean b;
        b = accumulator.assign_int(1);
        num_aux = 1;
        while(num_aux < ((num.my_first()) + 1)) {
            b = accumulator.assign_int(
                (accumulator.my_first())*
                (num_aux)
            );
            num_aux = num_aux + 1;
        }
        return accumulator ;
    }
}
