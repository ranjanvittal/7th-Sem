class MultUsingRec {

	public static void main( String[] MultUsingRec) {
				new MultUsingRecPrinter().__main(0);
	}
}

class MultUsingRecPrinter {

	public void __main( int __argLen) {
				int __printVal;
				int __MultiplyTmp;
			Multiply __MultiplyObject;
			__MultiplyObject = new Multiply();
			__MultiplyObject.computeMul(10,20);
			__printVal = __MultiplyObject.__Multiply__computeMulRetVal;

				System.out.println(__printVal);
	}
}

class Multiply {
	int  __Multiply__computeMulRetVal;
	boolean  __Multiply__compareRetVal;

	public void computeMul( int num1, int num2) {
		int __formalnum1;
		int __formalnum2;
		int num_aux;
		int aux01;
		int aux02;
		Multiply __temp0;
		boolean __temp1;
		boolean __temp2;
		Multiply __temp3;
		boolean __temp4;
		boolean __temp5;
		Multiply __temp6;
		boolean __temp7;
		boolean __temp8;
		Multiply __temp9;
		int __temp10;
		__formalnum1 = num1;
		__formalnum2 = num2;
		aux01 = 0;
		aux02 = 1;
		__temp0 = this;
		__temp0.compare(aux01,__formalnum1);
		__temp1 = __temp0.__Multiply__compareRetVal;
		__temp2 = __temp1;
			if(__temp2) {
		num_aux = 0;
			}
			else {
		__temp3 = this;
		__temp3.compare(aux01,__formalnum2);
		__temp4 = __temp3.__Multiply__compareRetVal;
		__temp5 = __temp4;
			if(__temp5) {
		num_aux = 0;
			}
			else {
		__temp6 = this;
		__temp6.compare(aux02,__formalnum2);
		__temp7 = __temp6.__Multiply__compareRetVal;
		__temp8 = __temp7;
			if(__temp8) {
		num_aux = __formalnum1;
			}
			else {
		__temp9 = this;
		__temp9.computeMul(__formalnum1,__formalnum2 - 1);
		__temp10 = __temp9.__Multiply__computeMulRetVal;
		num_aux = (__temp10) + __formalnum1;
			}
			}
			}
		__Multiply__computeMulRetVal = num_aux;
	}
	public void compare( int num1, int num2) {
		int __formalnum1;
		int __formalnum2;
		boolean retval;
		int aux03;
		boolean __temp11;
		boolean __temp12;
		__formalnum1 = num1;
		__formalnum2 = num2;
		retval = false;
		aux03 = __formalnum2 + 1;
		__temp11 = __formalnum1 < __formalnum2;
			if(__temp11) {
		retval = false;
			}
			else {
		__temp12 = ! (__formalnum1 < aux03);
			if(__temp12) {
		retval = false;
			}
			else {
		retval = true;
			}
			}
		__Multiply__compareRetVal = retval;
	}
}

