class Recursion {
	public static void main(String[] args){
		new Fibonacci().print(33);
	}
}

class Fibonacci {
	int f;
	public void fib(int n){
		int returnVal;
		int temp1;
		int temp2;
		Fibonacci fib;
		fib = this;
		if(n<3){ 
			returnVal = 1;
		}else {
			fib.fib(n-1);
			temp1 = fib.f;
			fib.fib(n-2);
			temp2 = fib.f;
			returnVal = (temp1) + (temp2);
		}
	 fib.f = returnVal;
	}
	
	public void print(int n){
		Fibonacci fib;
		fib = this;
		fib.fib(n);
		System.out.println(fib.f);
	}

}
