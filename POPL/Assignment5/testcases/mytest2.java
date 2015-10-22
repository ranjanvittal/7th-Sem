class mytest2 { public static void main ( String[] micro_a) {
new new_mytest2().print();
}
}

class new_mytest2 {
    public void print() {
        extra_int a1;
        int a2;
        RecursionChecker a3;
        a3 = new RecursionChecker();
        a1 = new extra_int();
        a3.power(2, 20, a1);
        a2 = a1.first;
        System.out.println(a2);
    }
}
class RecursionChecker {
    public void power(int a, int b, extra_int result) {
        int a1;
        RecursionChecker c;
        result.first = 1;
        c = this;
        c.power_aux(a, b, result);

    }
    public void power_aux(int a, int b, extra_int result) {
        RecursionChecker c;
        c = this;
        if( 0 < b) {
            result.first = result.first*a;
            b = b-1;
            c.power_aux(a, b, result);
        }
        else {}
    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


