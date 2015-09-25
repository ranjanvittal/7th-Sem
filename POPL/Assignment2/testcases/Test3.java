class Test3 {
   public static void main(String [] a){
      new Foo().foo();
   }
}

class Foo{
		int x;
   public void foo(){
		   A a1;
		   int x;
		   Foo f;

		   a1 = new A();
		   a1.f1 = 10;
		   f = this;
		   if((a1.f1 + 10) < 30){
				a1.f2 = 5;
		   }else{
				a1.f2 = 6;
		   }
		   System.out.println(a1.f2);
		   x = 10;
		   f.x = 0;

		   while(f.x < x){
				f.x = f.x + 1;
		   }

		   System.out.println(x);
		   System.out.println(f.x);
			
		   f.bar();

   }

   public void bar(){
		int[] array;
		int i;
		array = new int[x * 2];
		i = 0;
		while(i < (x * 2)){
				array[i] = i;
				i = i + 1;
		}
		System.out.println(x);
		System.out.println(array[0]);
		System.out.println(array[((x*2) - 1)]);

   }

}

class A{
	int f1;
	int f2;
}
