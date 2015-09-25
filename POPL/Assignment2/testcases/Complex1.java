class Complex1 {
	public static void main(String[] args){
		new Complex1Test().start();
	}
}

class Complex1Test{
	int b;
	int[] arr;
	public void start(){
		int a;
		int x;
		a = 10;
		b = 20;
		arr = new int[((a * b) + (b - (b+a)))];
		System.out.println(arr.length);
		x = (arr.length - (arr.length - (1*2)));
		System.out.println(arr[x]);

		arr[2] = (((a + b) * (b)));
		arr[0] = ((arr[2]) + ((arr[2]) + (a * b)));
		if(((arr[0]) < (arr[2])) & (!(a<b)))
			arr[3] = ((arr[0]) - 3);
		else
			arr[3] = 5;
		System.out.println(arr[3]);
	}
}