class mytest3{
    public static void main(String[] a){
        System.out.println(new MyStarter3().start());
    }
}

class MyInt3 {
    int first;
    public int my_first() {
        return first;
    }
    public boolean assign_int(int val) {
        first = val;
        return true;
    }
}

class MyStarter3 {
    public int start() {
        MyInt3 num;
        MyInt3 accumulator;
        boolean b;
        num = new MyInt3();
        accumulator = new MyInt3();
        b = accumulator.assign_int(1);
        b = num.assign_int(10);
        b = new MyFac3().ComputeFac(num, accumulator);
        return accumulator.my_first();
    }
}
class MyFac3 {
    public boolean ComputeFac(MyInt3 num, MyInt3 accumulator){
        int num_aux ;
        boolean b;
        b = accumulator.assign_int(
            (accumulator.my_first())*
            (num.my_first())
        );
        b = num.assign_int(
            (num.my_first())-1
        );
        if((num.my_first()) < 1)
            b = true;
        else
            b = (this.ComputeFac(num, accumulator));
        return b;
    }
}
