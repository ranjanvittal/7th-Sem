class Fibonacci{
    public static void main(String[] a){
        System.out.println(new Fib().computeFib(10));
    }
}

class Fib {
    public int computeFib(int num){
        int num_aux ;
		int aux01 ;
		int aux02 ;
	
		aux01 = 0 ;
		aux02 = 1 ;
	
        if (this.compare(aux01,num))
            num_aux = 0 ;
        else if (this.compare(aux02,num))
            num_aux = 1 ;
		else
	            num_aux = (this.computeFib(num-1)) + (this.computeFib(num-2)) ;
	        return num_aux ;
    }

    // This method compares two integers and
    // returns true if they are equal and false
    // otherwise
    public boolean compare(int num1 , int num2){
		boolean retval ;
		int aux03 ;
	
		retval = false ;
		aux03 = num2 + 1 ;
		if (num1 < num2) retval = false ;
		else if (!(num1 < aux03)) retval = false ;
		else retval = true ;
		return retval ;
    }
}
