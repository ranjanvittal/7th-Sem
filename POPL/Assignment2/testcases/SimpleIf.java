class SimpleIf {
	public static void main(String[] a){
		new SimpleIfTest().Start(true);
	}
}

class SimpleIfTest {
	int f1;
	int f2;
	public void Start(boolean x){
		SimpleIfTest sit;
		int returnVal;
		boolean b;
		int temp;
		sit = this;
		temp = 0;
		b = x;
		if(false)
			sit.getSomeOtherInt();
		else
			sit.getInt();

		b = b & !false;
		if(b)
			returnVal = f1;
		else
			returnVal = f2;
		
		if(returnVal < 100){
			temp = 10;
		}else
			temp = temp + 27 ;
		
		
		f1 = returnVal + temp;
		System.out.println(f1);
	}
	
	public void getInt(){
		f1 = 20;
	}
	
	public void getSomeOtherInt(){
		f2 =  30;
	}
}
