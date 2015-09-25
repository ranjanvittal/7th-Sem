class DifferentPrints {
	public static void main(String[] a){
		new DiffPrintsTest().Start(40);
	}
}

class DiffPrintsTest{
	int f1;
	public void Start(int x){
		DiffPrintsTest d1;
		int[] arr;
		d1 = new DiffPrintsTest();
		arr = new int[5];
		System.out.println((arr[0])*(arr[1]));
		System.out.println((x*4)-x);
		d1.getInt(x+2);
		System.out.println((f1*3));
		System.out.println(10);
		System.out.println((10*20)-3);
		System.out.println(((new int[4])[3])+2);
		System.out.println((0)-(4+3));
	}
	
	public void getInt(int x){
		f1 =  x+30;
	}
}
