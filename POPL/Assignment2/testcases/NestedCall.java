class NestedCall {
	public static void main(String[] a){
		new NestedCallTest().start(10);
	}
}

class NestedCallTest {
	public void start(int x){
		int temp;
		Nested1 nested1;
		nested1 = new Nested1();
		nested1.f = x;
		nested1.makeCall();
		temp = nested1.f ;
		System.out.println(temp);
	}
}

class Nested1{
	int f;
	public void makeCall(){
		Nested2 nested2;
		nested2 =  new Nested2();
		nested2.makeCall();
		f = f + (nested2.f - 10);
		System.out.println(f);
	}
}

class Nested2{
	int f;
	public void makeCall(){
		Nested3 nested3;
		nested3 =  new Nested3();
		nested3.makeCall();
		f = nested3.f - 20;
		System.out.println(f);
	}
}

class Nested3{
	int f;
	public void makeCall(){
		Nested4 nested4;
		nested4 =  new Nested4();
		nested4.makeCall();
		f = nested4.f - 30;
		System.out.println(f);
	}
}

class Nested4{
	int f;
	public void makeCall(){
		f = f - 40;
		System.out.println(f);
	}
}