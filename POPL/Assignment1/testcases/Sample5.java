class Sample5{
    public static void main(String[] a){
	System.out.println(new Test().test(7));
    }
}

class Test{

    public int test(int a){
    	boolean test;
		int ret;
		int temp;
		int divRes;
		boolean foo;
		int i;
		test = true;
		i = 2;

		while (i < a){

				divRes = this.div(a,i);
				temp = (divRes*i);
				if(a < temp)
						test = test & true;
				else if (temp < a)
						test = test & true;
				else	
						test = test & false;
				i = i + 1;
		}

		if(test)
				ret = 1;
		else
				ret = 0;

		return ret;

	}

	public int div(int a, int b){
		int i;
		int ret;
		int test;
		boolean tmp;
		i = 1;
		ret = 1;
		if(a < b)
				ret = 0;
		else{
			tmp = false;
			while(!tmp){
					test = b * i;
					if(test < a)
							tmp = false;
					else if (a < test){
							tmp = true;
							ret = i - 1;
					}else{
							tmp = true;
									ret = i;
					}
					i = i +1;
			}



		}
		return ret;
	}


}

