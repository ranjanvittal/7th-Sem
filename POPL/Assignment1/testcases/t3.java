class t3{
    public static void main(String[] a) {
        System.out.println(new myClass2().f1());
    }
}

class myClass2 {
    public int f1() {
        return this.f2(this.f2(1));
    }

    public int f2(int i) {
        return i + 1;
    }
}
