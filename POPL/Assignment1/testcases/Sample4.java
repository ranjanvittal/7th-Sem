class Sample4{
    public static void main(String[] a){
	System.out.println(new Test().test(42));
    }
}

class Test{

    public int test(int a){
    	boolean test;
		Test1 test1;
		int ret;
		int sum1;
		boolean foo;
		test = false;
		test1 = new Test1();
		foo = test1.init();
		sum1 = test1.sum();

		if(a < sum1)
				test = false;
		else if (sum1 < a)
				test = false;
		else	
				test = true;
		
		if(test)
				ret = 1;
		else
				ret = 0;

		return ret;
		
	}


}

class Test1{
	int[] c;

	public boolean init(){
		c = new int[5];
		c[0] = 1;
		c[1] = 2;
		c[2] = 3;
		c[3] = 2;
		c[4] = 1;
		return true;
	}

	public int sum(){
		int i;
		boolean found;
		int j;
		int sum;
		j = c.length;
		i = 0;
		sum = 0;
		found = false;
		while(i < (j)){
				sum = sum + (c[i]);
				i = i + 1;
		}

		return sum;
	}
}
