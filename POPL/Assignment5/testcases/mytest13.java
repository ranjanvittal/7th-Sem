class mytest13 { public static void main ( String[] micro_a) {
new new_mytest13().print();
}
}

class new_mytest13 {
    int first;
    public void print() {
        new_mytest13 a;
        a = this;
        first = 0;
        a.start();
        a.end();
    }
    public void start() {
        new_mytest13 a;
        a = this;
        while( first < 200) {
            a.end();
            System.out.println(first);
        }

    }

    public void end() {
        new_mytest13 a;
        first = first+1;
        a = this;
        while(first < 200) {
            a.start();
            System.out.println(first);
        }
    }
}
