class InsertionSort {

	public static void main( String[] InsertionSort) {
				new InsertionSortPrinter().__main(0);
	}
}

class InsertionSortPrinter {

	public void __main( int __argLen) {
				int __printVal;
				int __ISTmp;
			IS __ISObject;
			__ISObject = new IS();
			__ISObject.start();
			__printVal = __ISObject.__IS__startRetVal;

				System.out.println(__printVal);
	}
}

class IS {
	int [] numbers;
	int  __IS__startRetVal;
	int  __IS__sortRetVal;

	public void start() {
		int aux0;
		IS __temp0;
		int __temp1;
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
		__temp0 = this;
		__temp0.sort();
		__temp1 = __temp0.__IS__sortRetVal;
		aux0 = __temp1;
		__IS__startRetVal = 9999;
	}
	public void sort() {
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
		boolean __temp2;
		boolean __temp3;
		boolean __temp4;
		aux10 = 0;
		j = 1;
		len = numbers.length;
		__temp2 = j < len;
			while(__temp2) {
		{
		key = numbers[j];
		i = j - 1;
		left = aux10 < i;
		numbI = numbers[i];
		right = key < numbI;
		exp = left & right;
		__temp3 = exp;
			while(__temp3) {
		{
		temp = i + 1;
		numbers[temp] = numbers[i];
		i = i - 1;
		left = aux10 < i;
		numbI = numbers[i];
		right = key < numbI;
		exp = left & right;
		}
		__temp3 = exp;
			}
		temp = i + 1;
		numbers[temp] = key;
		j = j + 1;
		}
		__temp2 = j < len;
			}
		p = 1;
		__temp4 = p < len;
			while(__temp4) {
		{
			System.out.println(numbers[p]);
		p = p + 1;
		}
		__temp4 = p < len;
			}
		__IS__sortRetVal = 0;
	}
}

