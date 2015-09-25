class Test4 {
   public static void main(String [] a){
      new Foo().foo();
   }
}

class Foo{
   public void foo(){
		A a1;
		A a2;
		A a3;
		B b1;
		B b2;
		C c;

		a1 = new A();
		a2 = new B();
		a3 = new C();

		a1.one(1,2);
		a2.one(1,2);
		a3.one(1,2);
		System.out.println(a1.x);
		System.out.println(a2.x);
		System.out.println(a3.x);

		b1 = new B();

		b1.two(1,(1+1));

		System.out.println(b1.x);

		c = new C();

		c.two(1,2);

		System.out.println(c.y);

   }

}

class A{
	int x;
	int y;

	public void one(int x, int y){
			A a;
			a = this;
			a.x = x;
			a.y = y;
	}
}

class B extends A{
	int z;
	
	public void two(int x, int y){
		B b;
		b = this;
		b.x = x + 1;
		b.y = y + 1;
	}
	

}

class C extends B{
	boolean x;



}
