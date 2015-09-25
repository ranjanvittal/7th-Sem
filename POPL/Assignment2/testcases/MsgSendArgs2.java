class MsgSendArgs2 {
	public static void main(String[] a){
		new ArgsTest2().Start();
	}
}

class ArgsTest2 {
	int f;
	public void Start(){
		ArgsTest2 at;
		int temp;
		int[] arr;
		ArgsTest2 argsTest2;
		at = this;
		argsTest2 = new ArgsTest2();
		at.takeReference(new ArgsTest2());
		at.takeReference(argsTest2);
		System.out.println(argsTest2.f);
		temp = argsTest2.f;
		arr = new int[5];
		at.takeArray(arr);
		temp = temp + (at.f);
		System.out.println(temp);
	}
	
	public void takeInt(int x){
		f = f+x; 
	}
	
	public void takeReference(ArgsTest2 test2){
		test2.takeInt(10);
		System.out.println(test2.f);
	}
	
	public void takeArray(int[] arr){
		f = arr[2];
	}
}
