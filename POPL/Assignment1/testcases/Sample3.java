class Sample3{
    public static void main(String[] a){
	System.out.println(new Test().test(42,21));
    }
}

class Test{
	
    public int test(int a, int b){
    	boolean test;
		Test1 test1;
		int ret;
		boolean foo;
		test = false;
		test1 = new Test1();
		foo = test1.init();
		test = test1.isInC(a);
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
		c[3] = 4;
		c[4] = 5;
		return true;
	}

	public boolean isInC(int d){
		int i;
		boolean found;
		int j;
		j = c.length;
		i = 0;
		found = false;
		while(i < (j)){
				if(!found){
						if(d < (c[i])) found = false;
						else if((c[i]) < d) found = false;
						else found = true;
				}else
						found = true;
				i = i + 1;
		}
		return found;
	}
}
