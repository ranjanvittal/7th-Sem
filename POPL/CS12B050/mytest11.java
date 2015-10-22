class mytest11 { public static void main ( String[] micro_a) {
new new_mytest11().print();
}
}

class new_mytest11 {
    int first;
    public void print() {
        new_mytest11 a;
        a = this;
        first = 0;
        a.start();
        a.end();
    }
    public void start() {
        new_mytest11 a;
        if(first < 100) {
            a = this;
            a.end();
            first = first + 1;
            System.out.println(first);
        }
        else {}

    }

    public void end() {
        new_mytest11 a;
        first = first+1;
        a = this;
        a.start();
        System.out.println(first);
    }
}
