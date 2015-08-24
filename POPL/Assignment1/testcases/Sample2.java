class Sample2{
    public static void main(String[] a){
	System.out.println(new Test().test(42,21));
    }
}

class Test{

    public int test(int a, int b){
		while(b < a){
			a = a - 1;
		}
		return a;
    }


}
