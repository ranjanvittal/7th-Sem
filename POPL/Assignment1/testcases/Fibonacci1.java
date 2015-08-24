class Fibonacci1 {
    public static void main(String[] a){  
	
        System.out.println (new Fib().ComputeFib(10));
    }
}

class Fib {
    public int ComputeFib(int fibCount){
		int i;
		int first;
		int second;
		int temp;
		i = 2;
		first = 1;
		second = 2;
		if (fibCount<2){
 			System.out.println (fibCount);
		}
		else if (fibCount<3){
			System.out.println (first);
			System.out.println (second);
		}
		else{
			System.out.println (first);
			System.out.println (second);
			while(i<fibCount){
				temp = first + second;
				first = second;
				second = temp;
				System.out.println (second);
				i = i+1;
			}
		}
		return 0;
	}
}
