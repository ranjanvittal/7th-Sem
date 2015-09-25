class Expressions {
	public static void main(String[] a){
		new ExpressionsTest().Start();
	}
}

class ExpressionsTest{
	int[] arr;
	int f;
	public void Start(){
		ExpressionsTest e;
		ExpressionsTest e1;
		ExpressionsTest e2;
		int temp;
		e = this;
		e1 = new ExpressionsTest();
		e2 = new ExpressionsTest();
		e.getInt(2);
		e1.getInt(2);
		e2.getArrayEntry(0);
		temp = ((e.f) + (e1.f));
		System.out.println(temp);
		e.getInt(2);
		temp = e.f;
		e.getInt(temp);
		temp = e.f;
		System.out.println(temp);
		temp = temp - (temp);
		System.out.println(temp);
		temp = ((temp) * (e2.f)); 
		System.out.println(temp);
		if((temp < e.f) & (temp < e2.f))
			System.out.println(e.f);
		else
			System.out.println(e2.f);
	}
	
	public void getInt(int x){
		f = (f+x)+30;
	}
	
	public void getArrayEntry(int x){
		arr = new int[50];
		f = arr[(((x+(x*2))+2)-2)];
	}
}
