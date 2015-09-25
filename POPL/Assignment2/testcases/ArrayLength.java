class ArrayLength {
	public static void main(String[] a){
		new ArrayLengthTest().Start(2);
	}
}

class ArrayLengthTest {
	int f1;
	public void Start(int x){
		int[] arr;
		int[] arr1;
		int[] arr2;
		ArrayLengthTest alt;
		arr = new int[5];
		arr1 = new int[arr.length];
		alt = this;
		alt.getInt();
		arr1[alt.f1] = 50; 
		arr1[3] = 7;
		arr2 = new int[arr1[3]];
		alt.getInt();
		arr2[6] = 56;
		System.out.println(arr2.length);
		System.out.println(arr1[((arr2.length)-(arr.length))]);
		System.out.println(arr2[((arr1.length)+1)]);
	}

	public void getInt(){
		f1 = 2;
	}
}

