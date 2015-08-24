class t5{
    public static void main(String[] a) {
        System.out.println(new myClass2().f1());
    }
}

class myClass2 {
    int counter;
    public int f1() {
    	int x;

        counter = 0;
        x = 0;
        while (this.f2())
        	x = 1;

        return x;
    }

    public boolean f2() {
        counter = counter + 1;
    	return counter < 3;
    }
}
