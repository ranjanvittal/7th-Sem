class SubTypePoly {
	public static void main(String[] identifier){
		new PolyTest().start();
	}
}

class PolyTest {
	public void start(){
		ParentPoly pp;
		ParentPoly pp1;
		ChildPoly cp1;
		pp = new ParentPoly();
		pp1 = new ChildPoly();
		cp1 =  new ChildPoly();
		pp.foo(true);
		pp.bar();
		pp.f1 = 50;
		pp.bar();
		pp1.foo(true);
		pp1.bar();
		pp1.f1 = 60;
		pp1.bar();
		cp1.foo(true);
		cp1.f1 = 70;
		cp1.bar();
	}
}

class ParentPoly{
	int f1;
	boolean f2;
	public void foo(boolean a){
		if(a)
			f1 = 10;
		else
			f1 = 20;
		f2 = !a;
	}

	public void bar(){
		System.out.println(f1);
	}
}

class ChildPoly extends ParentPoly {
	int f1;
	boolean f2;
	public void foo(int a){
		f1 = a + f1;
	}

	public void bar(){
		System.out.println(f1);
	}
}