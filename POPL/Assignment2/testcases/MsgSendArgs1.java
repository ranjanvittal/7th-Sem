class MsgSendArgs1 {
	public static void main(String[] a){
		new ArgsTest1().Start(10);
	}
}

class ArgsTest1 {
	int f;
	public void Start(int x){
		ArgsTest1 at;
		int temp1;
		int temp2;
		int temp3;
		TempClass3 tc1;
		at = this;
		tc1 = new TempClass3();
		at.getInt(10);
		temp1 = at.f;
		at.getOtherInt(2);
		temp2 = at.f;
		at.getOtherInt(3);
		temp3 = at.f;
		System.out.println(temp1);
		System.out.println(temp2);
		System.out.println(temp3);
		tc1.getInt(temp1, temp2, temp3, (temp1 + temp2), (temp2 * temp3), (temp3 - 0), (1*(2-1)), 1, 2, 3, (at.f)); 
		System.out.println(tc1.f);
	}

	public void getInt(int x){
		f = x+20;
	}

	public void getOtherInt(int y){
		ArgsTest1 at;
		at = this;
		at.getInt(y);
		f =  f+30;
	}
}

class TempClass3{
	int f;
	public void getInt(int x, int y, int z, int a, int b, int c, int d, int e, int f, int g, int h){
		int m;
		m = (x+y)+z;
		f = m;
	}
}