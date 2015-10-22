class mytest12 { public static void main ( String[] micro_a) {
new new_mytest12().print();
}
}

class new_mytest12 {

    public void print() {
        extra_int a1;
        int a2;
        RecursionChecker a3;
        a3 = new RecursionChecker();
        a1 = new extra_int();
        a3.power_two_power(2, 4, a1);
        a2 = a1.first;
        System.out.println(a2);
    }
}
class RecursionChecker {
    public void power_two_power(int a, int b, extra_int result) {
        int a1;
        RecursionChecker c;
        result.first = a;
        if(0 < b) {
            b = b - 1;
            c = this;
            c.power_two_power_aux(a, b, result);
            a1 = 0+2;
            System.out.println(a1);
        }
        else {}
    }
    public void power_two_power_aux(int a, int b, extra_int result) {
        RecursionChecker c;
        c = this;
        if( 0 < b) {
            result.first = result.first*result.first;
            b = b - 1;
            c.power_two_power_aux(a, b, result);
        }
        else {}
    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


