class Test2 {
   public static void main(String [] a){
      new Foo().foo();
   }
}

class Foo{
   public void foo(){
		   A a1;
		   A a2;
		   System.out.println(1);
		   a1 = new A();
		   a1.setf1(10);
		   a2 = new B();
		   a2.setf1(20);
		   System.out.println(a1.f1);
		   System.out.println(a2.f1);
		   a2.foo();
		   a1.foo();
		   System.out.println(a1.f1);
		   System.out.println(a2.f1);
   }

}

class A{

		int f1;
		int f2;
		int z;

		public void setf1(int x){
			int y;
			y = x + 1;
			f1 = y;
		}

		public void foo(){
			A a;
			z = 5;
			a = this;
			a.setf1(30);
		}
}

class B extends A{
	int f3;
		public void setf1(int x){
			A t1;
			f1 = x +2;
			t1 = this;
			t1.f1 = x + 1;
		}
}
