class mytest5 { public static void main ( String[] micro_a) {
new new_mytest5().print();
}
}

class new_mytest5 {
    public void print() {
        BooleanXor a;
        extra_int result;
        a = new BooleanXor();
        result = new extra_int();
        a.xor(2097, 1827, result);
        System.out.println(result.first);
    }
}

class BooleanXor {
    public void xor(int a, int b, extra_int result) {
        int a1;
        int two_pow;
        int i;
        Division d;
        int j;
        int q1;
        int q2;
        int val;
        int[] a2;
        extra_int result1;

        a2 = new int[32];
        d = new Division();
        result1 = new extra_int();
        i = 0;
        while((0 < a) & (0 < b)) {
            d.mod(a, 2, result1);
            System.out.println(a);
            a2[i] = result1.first;
            System.out.println(a2[i]);

            d.mod(b, 2, result1);
            System.out.println(result1.first);
            q1 = a2[i];
            q2 = result1.first;
            a2[i] = q1 + q2;
            System.out.println(a2[i]);
            q1 = a2[i];
            if(1 < q1) {
                a2[i] = 0;
            }
            else {}
            d.divide(a, 2, result1);
            a = result1.first;
            d.divide(b, 2, result1);
            b = result1.first;
            i = i+1;
        }

        while(0 < a) {
            d.mod(a, 2, result1);
            a2[i] = result1.first;
            d.divide(a, 2, result1);
            a = result1.first;
            i = i+1;
        }
        while(0 < b) {
            d.mod(b, 2, result1);
            a2[i] = result1.first;
            d.divide(b, 2, result1);
            b = result1.first;
            i = i+1;
        }
        val = 0;
        while(0 < i) {
            j = i-1;
            q1 = a2[j];
            val = (2*val) + q1;
            i = i-1;
        }
        result.first = val;
    }
}

class Division {
    public void divide(int a, int b, extra_int result) {
        int val;
        int i;
        i = 0;
        val = b*i;
        while(val < a) {
            i = i+1;
            val = b*i;
        }

        if(a < val)
            i = i-1;
        else {}

        result.first = i;
    }

    public void mod(int a, int b, extra_int result) {
        Division d;
        d = this;
        d.divide(a, b, result);
        result.first = a - (result.first*b);
    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


