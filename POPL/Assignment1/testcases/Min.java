//finds the min of 100 array elements
class Min{
    public static void main(String[] a){
	System.out.println(new AM().Start());
    }
}
class AM{

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

    public int Start(){
	int i;
	int min ;
	int temp;
	temp = this.init();
	i = 0;
	min = a[i];
	while( i < 100)
	{
			temp = a[i];
			if ( temp < min )	min = a[i];
			else min = min;
			i = i+1;
	}
	return min;
	}
}
