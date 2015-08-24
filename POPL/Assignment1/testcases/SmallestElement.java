class SmallestElement{
    public static void main(String[] a){
    	System.out.println(new SE().Start());
    }
}
// This class contains an array of integers and
// methods to initialize, print and search the smallest element in the array

class SE{

    public int Start(){
    	int[] aux0;
    	int smallest;
    	int aux1;
    	int aux2;
    	int aux3;
    	
    	aux0 = new int[5];
		aux0[0] = 20 ;
		aux0[1] = 11  ; 
		aux0[2] = 12 ;
		aux0[3] = 9 ;
		aux0[4] = 2  ; 
			
		
		smallest = aux0[0];
		 
		aux1 = 1;
		aux2 = aux0.length;
		while(aux1 < aux2) {
			aux3 = aux0[aux1];
			if(aux3 < smallest) 
				smallest = aux0[aux1];
			else
				smallest = smallest;
			aux1 = aux1 + 1;
		 }
		return smallest;
    }

}
