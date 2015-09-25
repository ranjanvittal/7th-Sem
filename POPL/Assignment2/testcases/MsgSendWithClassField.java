class MsgSendWithClassField {
	public static void main(String[] a){
		new MessageSend().start(40);
	}
}

class MessageSend{
	TempClass4 tempClass4;
	
	public void start(int x){
		int temp;
		TempClass6 tempClass6;
		TempClass5 tempClass5;
		tempClass4 = new TempClass4();
		tempClass4.tempClass5 = new TempClass5();
		tempClass5 = tempClass4.tempClass5;
		tempClass5.tempClass6 = new TempClass6();
		tempClass4.getInt(x);
		temp = tempClass4.f;
		System.out.println(temp);
		tempClass5.getInt(temp);
		temp = tempClass5.f;
		System.out.println(temp);
		tempClass6 = tempClass5.tempClass6;
		tempClass6.getInt(temp);
		temp = tempClass6.f;
		System.out.println(temp);
	}
}

class TempClass4{
	TempClass5 tempClass5;
	int f;
	public void getInt(int x){
		f = x+10;
	}
}

class TempClass5{
	TempClass6 tempClass6;
	int f;
	public void getInt(int x){
		f = x+20;
	}
}

class TempClass6{
	int f;
	public void getInt(int x){
		f = x+30;
	}
}