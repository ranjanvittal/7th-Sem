class t4{
    public static void main(String[] a) {
        System.out.println(new myClass2().f1());
    }
}

class myClass2 {
    public int f1() {
    	int x;
        if (true)
        	x = this.f2();
        else
        	x=0;
        return x;
    }

    public int f2() {
    	return 1;
    }
}
