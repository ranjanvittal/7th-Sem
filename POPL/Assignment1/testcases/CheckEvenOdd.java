class CheckEvenOdd{
    public static void main(String[] a){
	System.out.println(new EO().start());
    }
}

class EO{

    public int start(){
		if (this.check(8)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
		
		if (this.check(19)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
	
		if (this.check(20)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
		
		if (this.check(21)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
		
		if (this.check(37)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
		
		if (this.check(38)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
		
		if (this.check(39)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
		
		if (this.check(50)) 
			System.out.println(1) ;
		else 
			System.out.println(0) ;
	
		return 0 ;
    }

    // This method checks whether an integer is even or odd and
    // returns true if even and false
    // otherwise
    public boolean check(int num){
		boolean bs01 ;
		int count01 ;
		int count02 ;
		int aux01 ;
		int aux02 ;
	
		count01 = 0 ;
		count02 = 0 ;
		aux01 = num - 1 ;
		while (count02 < aux01) {
		    count01 = count01 + 1 ;
		    count02 = count02 + 2 ;
		}
		aux02 = count01 * 2;
		
		if(this.compare(aux02,num))
			bs01=true;
		else
			bs01=false;
		
		return bs01 ;
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
