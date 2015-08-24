//check if a number is prime or not
class IsPrime{
    public static void main(String[] a){
	System.out.println(new IP().Start(50));
    }
}
class IP{
	//divides num with div and returns true if div exactly divides num
	public boolean div(int num, int div)
	{
		int count01 ;
		int count02 ;
		int aux03 ;
		boolean f;

		count01 = 0 ;
		count02 = 0 ;
		aux03 = num - 1 ;
		while (count02 < aux03) {
			count01 = count01 + 1 ;
			count02 = count02 + div ;
		}
		
		if(num<count01)
			f = false;
		else
			f = true;
		return f;
		
	}
    
    public boolean Start(int num){
		int count;
		boolean flag;
		boolean ret;
		int i;
		count = 0;
		flag = true;
		i=2;
		
	while( i < num)
	{
			ret = this.div(num,i);
			if(!ret)
				flag=false;
			else
				count =1;
			i=i+1;
	}
	return flag;
	}
}
