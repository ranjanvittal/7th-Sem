class InsertionSort{
	public static void main(String[] a){
		System.out.println(new IS().start());
	}
}


// This class contains the array of integers and
// methods to initialize, print and sort the array
// using Mergesort
class IS{
	int[] numbers;
	
	public int start() {
		int aux0;
		numbers = new int[11];
		numbers[1] = 80;
		numbers[2] = 90;
		numbers[3] = 60;
		numbers[4] = 70;
		numbers[5] = 10;
		numbers[6] = 30;
		numbers[7] = 20;
		numbers[8] = 50;
		numbers[9] = 40;
		numbers[10] = 100;
		aux0 = this.sort();			
		return 9999;
	}
	
	public int sort() {
		int j;
		int key;
		int i;
		int len;
		int aux10;
		int temp;
		boolean exp;
		boolean left;
		boolean right;
		int numbI;
		int p;
		aux10 = 0;
		
		j = 1;
		len = numbers.length;
		
		while(j < len) {
			
			key = numbers[j];
			i = j-1;
			
			left = aux10 < i;
			numbI = numbers[i];
			right = key < numbI;
			
			exp = left & right;
			
			while(exp){
				temp = i + 1;
				numbers[temp] = numbers[i];
				i = i - 1;
				
				left = aux10 < i;
				numbI = numbers[i];
				right = key < numbI;
				
				exp = left & right;
			}
			
			temp = i + 1;
			numbers[temp] = key;
			
			j = j + 1;
		}
		
		p = 1;
		while(p<len){
			System.out.println(numbers[p]);
			p = p + 1;
		}
		return 0;
	}
}
