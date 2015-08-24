class t1{
    public static void main(String[] a) {
        System.out.println(new myClass2().method());
    }
}

class myClass2 {
    public int method() {
        int one;
        int two;
        boolean three;

        one = 1;
        two = 2;
        three = two < one;

        return 1;
    }
}
