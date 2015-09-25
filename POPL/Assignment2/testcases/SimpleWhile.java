class SimpleWhile {
	public static void main(String[] a){
		new SimpleWhileTest().start(60);
	}
}

class SimpleWhileTest {
	int f1;
	public void start(int x){
		SimpleWhileTest swt;
		int returnVal;
		int y;
		int temp;
		swt = this;
		y = 100;
		returnVal = 0;
		temp = x;
		while(!(temp < 1)){
			swt.getInt();
			returnVal = returnVal+((f1));
			if((temp < 15) & (y < 101)){
				temp = 5;
				y = 200;
			}else{
				
			}
			temp = temp - 1;
			System.out.println(temp);
		}
		System.out.println(returnVal);
	}
	
	public void getInt(){
		f1 = 20;
	}
}
