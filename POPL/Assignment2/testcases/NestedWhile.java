class NestedWhile {
	public static void main(String[] a){
		new NestedWhileTest().Start(100);
	}
}

class NestedWhileTest {
	public void Start(int x){
		TempClass1 tempClass1;
		boolean b;
		tempClass1 = new TempClass1(); 
		tempClass1.getBool(true);
		while(!tempClass1.f1){
			tempClass1.f2 = x;
			b = !(tempClass1.f2 < 1);  
			while(b){
				tempClass1.reduceByOne();
				b = !(tempClass1.f2 < 1);
				System.out.println(tempClass1.f2);
				while(tempClass1.f1)
					tempClass1.f1 = false;
			}
			tempClass1.f1 = true;
		}
	}
}

class TempClass1 {
	boolean f1;
	int f2;
	public void getBool(boolean bool){
		f1 =  !bool;
	}
	
	public void reduceByOne(){
		f2 = f2-1;
	}
}
