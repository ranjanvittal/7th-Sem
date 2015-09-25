class Complex2 {
	public static void main(String[] args){
		new Complex2Test().start();
	}
}

class Complex2Test{
	int a;
	int[] arr;
	Complex2Test ct;

	public void start(){
		int a;
		int[] arr;
		int[] tempArr;
		Complex2Test ct;
		Complex2Test ct1;
		Complex2Test temp;

		ct1 = this;
		ct = new Complex2Test();
		a = 1;
		arr = new int[6];
		ct1.arr = new int[4];
		arr[3] = 20;
		ct1.ct = ct;
		tempArr = ct1.arr;

		while((arr.length - (tempArr.length - (a*1))) < 6){
			System.out.println(ct1.a);
			a= a + 1;
		}
		a = 100;
		ct.a = 4;
		ct1.a = a;
		temp = ct1.ct;
		if((ct.a + temp.a) < (10+(arr[3])))
			System.out.println(ct1.a);
		else
			System.out.println(10);
	}
}