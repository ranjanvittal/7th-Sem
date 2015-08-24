class printArray {
    public static void main(String[] a){
	System.out.println(new RD().Start(10));
    }
}
class RD{
    
    int[] number ;
    int size ;

    public int Start(int sz){
	int aux01 ;
	aux01 = this.Init(sz);
	aux01 = this.Print();
	return 0 ;
    }

    public int Init(int sz){
	size = sz ;
	number = new int[sz] ;
	number[0] = 20 ;
	number[1] = 7  ; 
	number[2] = 2 ;
	number[3] = 18 ;
	number[4] = 2  ; 
	number[5] = 7 ;
	number[6] = 6  ; 
	number[7] = 9  ; 
	number[8] = 19 ; 
	number[9] = 5  ;
	
	return 0 ;	
    }
 
    	public int Print(){
		int j ;
		j = 0 ;
		while (j < (size)) {
	    		System.out.println(number[j]);
	    		j = j + 1 ;
		}
		return 0 ;
    	}
    
}

