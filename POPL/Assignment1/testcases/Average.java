//finds the average of 100 numbers stored in a[100]
class Average{
    public static void main(String[] a){
	System.out.println(new Ave().Start());
    }
}
class Ave{

	int[] a;

	public int init()
	{
		int i;
		a = new int[100];
		i = 0;
		while(i<100)
		{
			a[i] = i;
			i=i+1;
		}
		return 0;
	}
	//divides by 100
	public int div(int sum)
	{
		int count01 ;
		int count02 ;
		int aux03 ;

		count01 = 0 ;
		count02 = 0 ;
		aux03 = sum - 1 ;
		while (count02 < aux03) {
			count01 = count01 + 1 ;
			count02 = count02 + 100 ;
		}
		return count01 ;
	}

    public int Start(){
	int i;
	int sum ;
	int temp;
	int ave;
	int min;
	temp = this.init();
	i = 0;
	min = a[i];
	sum = 0;
	while( i < 100)
	{
		temp = a[i];
		sum=sum + temp;
		i = i+1;
	}
	ave = this.div( sum ) ;
	return ave;
	}
}
