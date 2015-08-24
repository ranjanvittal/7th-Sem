class removeDuplicate {
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
	System.out.println(99999);
	aux01 = this.D();
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
 
    public int D (){
	int j;
        int i;
	int temp1;
	int temp2;
	j = 0;
	i = 1;
        while(i < size){
		temp1 = number[i];
		temp2 = number[j];
            if(temp1 < temp2){
			j = j+1;
			number[j] = number[i];
			i = i+1;
		}
		else if (temp2 < temp1){
			j = j+1;
			number[j] = number[i];
			i = i+1;

		}
		else{
                	i = i+1;
		}
            
        }
	size = j+1;
                
        return 0;
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

