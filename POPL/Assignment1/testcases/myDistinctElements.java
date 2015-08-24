class myDistinctElements {
    public static void main(String[] a){
	System.out.println(new DE().Start(10));
    }
}
class DE{
    
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
	number[2] = 12 ;
	number[3] = 18 ;
	number[4] = 2  ; 
	number[5] = 11 ;
	number[6] = 6  ; 
	number[7] = 9  ; 
	number[8] = 19 ; 
	number[9] = 5  ;
	
	return 0 ;	
    }
 
    public int D (){
         int i;
	int temp1;
	int temp2;
	boolean isDistinct;
	int j;
i = 0;
	while  (i < size){
		isDistinct = false;
		j=0;
		while (j< i){
			temp1 = number[j];
			temp2 = number[i];
			if (temp2 < temp1){
			}
			else if (temp1 < temp2){
			}
			else {
				isDistinct = true;
                  }

           		if(!isDistinct){
                  		System.out.println(number[i]);
			}
			else{
			}			
			j = j+1;
		}
		i = i +1;
	}
  
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
