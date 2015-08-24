//sorts 100 elements
class BubbleSort{
    public static void main(String[] a){
	System.out.println(new BS().Start());
    }
}
class BS{

	int[] a;

	public int init()
	{
		int i;
		i=100;
		a = new int[102];
		while(0<i)
		{
			a[i] = i;
			i=i-1;
		}
		return 0;
	}

    public int Start(){
	int i;
	int j;
	int temp;
	int a1;
	int a2;
	temp = this.init();
	i=0;
	while( i < 100)
	{
		j=i;
		while( j < 100)
		{
			a1= a[j];
			temp=j+1;
			a2=a[temp];
			if(a2 < a1)
			{
				a[j]=a2;
				a[temp]=a1;
			}
			else
				a[j]=a1;
			j=j+1;
		}
		i=i+1;
	}
	return 0;
	}
}
