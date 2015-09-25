class SmallestElement {

	public static void main( String[] SmallestElement) {
				new SmallestElementPrinter().__main(0);
	}
}

class SmallestElementPrinter {

	public void __main( int __argLen) {
				int __printVal;
				int __SETmp;
			SE __SEObject;
			__SEObject = new SE();
			__SEObject.Start();
			__printVal = __SEObject.__SE__StartRetVal;

				System.out.println(__printVal);
	}
}

class SE {
	int  __SE__StartRetVal;

	public void Start() {
		int [] aux0;
		int smallest;
		int aux1;
		int aux2;
		int aux3;
		boolean __temp0;
		boolean __temp1;
		aux0 = new int[5];
		aux0[0] = 20;
		aux0[1] = 11;
		aux0[2] = 12;
		aux0[3] = 9;
		aux0[4] = 2;
		smallest = aux0[0];
		aux1 = 1;
		aux2 = aux0.length;
		__temp0 = aux1 < aux2;
			while(__temp0) {
		{
		aux3 = aux0[aux1];
		__temp1 = aux3 < smallest;
			if(__temp1) {
		smallest = aux0[aux1];
			}
			else {
		smallest = smallest;
			}
		aux1 = aux1 + 1;
		}
		__temp0 = aux1 < aux2;
			}
		__SE__StartRetVal = smallest;
	}
}

