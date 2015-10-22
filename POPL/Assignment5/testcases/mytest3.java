class mytest3 { public static void main ( String[] micro_a) {
new new_mytest3().print();
}
}

class new_mytest3 {
    public void print() {
        ExtendsChecker2 a;
        a = new ExtendsChecker2();
        a.overall_checker();
    }
}
class ExtendsChecker {
    int f1;

    public void just(int a) {
        ExtendsChecker a1;
        a1 = this;
        f1 = a;
        System.out.println(f1);
        a1.show_f1();
    }

    public void set_f1(int a) {
        f1 = a;
    }

    public void show_f1() {
        System.out.println(f1);
    }

    public void get_f1(extra_int result) {
        result.first = f1;
    }

    public void get_sum(extra_int result) {
        int a;
        ExtendsChecker a1;
        a1 = this;
        a1.get_f1(result);
        result.first = result.first + f1;
    }
}


class ExtendsChecker2 extends ExtendsChecker {
    int f1;

    public void set_f1(int a) {
        f1 = a;
    }

    public void get_f1(extra_int result) {
        result.first = f1;
    }

    public void show_f1() {
        System.out.println(f1);
    }

    public void overall_checker() {
        ExtendsChecker a;
        ExtendsChecker2 a1;
        extra_int result;
        int val1;
        result = new extra_int();
        a1 = this;
        a1.set_f1(5);

        a = this;
        a.just(4);
        a.set_f1(6);
        a.get_sum(result);
        val1 = result.first;
        System.out.println(val1);

        a = new ExtendsChecker();
        a.just(4);
        a.set_f1(6);
        a.get_sum(result);
        val1 = result.first;
        System.out.println(val1);
    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


