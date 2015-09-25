class t1 {

    public static void main(String[] a) {
        new MyDummyClass().MyDummyMethod();
    }
}

class MyDummyClass {

    public void MyDummyMethod() {
        int print;
        Fac tmp0;
        tmp0 = new Fac();
        tmp0.ComputeFac(10);
        print = tmp0.ComputeFac_return;
        System.out.println(print);
    }
}

class Fac {

    int ComputeFac_return;

    public void ComputeFac(int num) {
        int tmp2;
        int num_aux;
        int tmp4;
        Fac tmp3;
        tmp2 = num;
        tmp3 = this;
        if(tmp2 < 1)
            num_aux = 1;
        else
        {
            tmp3.ComputeFac(tmp2 - 1);
            tmp4 = tmp3.ComputeFac_return;
            num_aux = tmp2 * tmp4;
        }
        ComputeFac_return = num_aux;
    }
}

