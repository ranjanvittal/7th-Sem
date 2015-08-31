class mytest4 { public static void main ( String[] micro_a) {
new new_mytest4().print();
}
}

class new_mytest4 {
    public void print() {
        Division a;
        a = new Division();
        a.divide(200, 20);
        a = new DiffDivsion();
        a.divide(1000,22);
    }
}
class Division {
    public void divide(int a, int b) {
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

        System.out.println(i);
    }
}

class DiffDivsion extends Division {
    public void divide(int a, int b) {
        int val;
        int i;
        i = 0;
        val = b*i;
        while(val < a) {
            val = val+b;
            i = i+1;
        }

        if(a < val)
            i = i-1;
        else {}

        System.out.println(i);
    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


