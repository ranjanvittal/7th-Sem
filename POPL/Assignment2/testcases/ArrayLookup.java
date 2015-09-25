class ArrayLookup {
	public static void main(String[] a){
		new ArrayLookupTest().start(2);
	}
}

class ArrayLookupTest {
	int f;
	public void start(int x){
		TempClass2 tempClass2;
		ArrayLookupTest alt;
		int[] arr;
		alt = this;
		tempClass2 = new TempClass2();
		tempClass2.getInt();
		arr = new int[tempClass2.f];
		alt.getInt();
		arr[(alt.f)] = 34;
		arr[4] = arr[(2+((arr[0])+((arr[1])*(arr[4]))))];
		System.out.println(arr[2]);
		System.out.println(arr[4]);
	}
	
	public void getInt(){
		f = 2;
	}
}

class TempClass2 {
	int f;
	public void getInt(){
		f = 5;
	}
	
}