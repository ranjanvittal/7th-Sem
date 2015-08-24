class InsertionSort1{
    public static void main(String[] a){
	System.out.println(new IS().Start(12));
    }
}

class IS{

    int[] number ;
    int size ;

    public int Start(int sz){
	int aux01 ;
	aux01 = this.Init(sz);
	aux01 = this.Print();
	System.out.println(99999);
	aux01 = this.sort();
	aux01 = this.Print();
	return 0 ;
    }

    public int Init(int sz){
	size = sz ;
	number = new int[sz] ;
	number[1] = 20 ;
	number[2] = 7  ;
	number[3] = 12 ;
	number[10] = 18 ;
	number[4] = 2  ;
	number[5] = 11 ;
	number[6] = 6  ;
	number[7] = 9  ;
	number[8] = 19 ;
	number[9] = 5  ;

	return 0 ;
    }


  public int sort (){
      int j;
int key;
int i;
int temp;
j = 1;
while (j < size){
	key = number[j];
	i = j-1;
	while (0 < i){
		temp = number[i];
		if(key < temp){
			number[i+1] = number[i];
		}
		else{
		}
		i = i-1;
	}
	j = j+1;
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
