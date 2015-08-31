class mytest1 { public static void main ( String[] micro_a) {
new new_mytest1().print();
}
}

class new_mytest1 {
    public void print() {
        extra_int a1;
        int a2;
        Power a3;
        a3 = new Power();
        a1 = new extra_int();
        a3.power(2, 20, a1);
        a2 = a1.first;
        System.out.println(a2);
    }
}
class Power {
    public void power(int a, int b, extra_int result) {
        int a1;
        result.first = 1;
        while(0 < b) {
            a1 = result.first;
            a1 = a1*a;
            result.first = a1;
            b = b-1;
        }

    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


