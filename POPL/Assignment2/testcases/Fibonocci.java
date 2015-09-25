class Fibonocci {

	public static void main( String[] Fibonacci) {
				new FibonacciPrinter().__main(0);
	}
}

class FibonacciPrinter {

	public void __main( int __argLen) {
				int __printVal;
				int __FibTmp;
			Fib __FibObject;
			__FibObject = new Fib();
			__FibObject.computeFib(10);
			__printVal = __FibObject.__Fib__computeFibRetVal;

				System.out.println(__printVal);
	}
}

class Fib {
	int  __Fib__computeFibRetVal;
	boolean  __Fib__compareRetVal;

	public void computeFib( int num) {
		int __formalnum;
		int num_aux;
		int aux01;
		int aux02;
		Fib __temp0;
		boolean __temp1;
		boolean __temp2;
		Fib __temp3;
		boolean __temp4;
		boolean __temp5;
		Fib __temp6;
		int __temp7;
		Fib __temp8;
		int __temp9;
		__formalnum = num;
		aux01 = 0;
		aux02 = 1;
		__temp0 = this;
		__temp0.compare(aux01,__formalnum);
		__temp1 = __temp0.__Fib__compareRetVal;
		__temp2 = __temp1;
			if(__temp2) {
		num_aux = 0;
			}
			else {
		__temp3 = this;
		__temp3.compare(aux02,__formalnum);
		__temp4 = __temp3.__Fib__compareRetVal;
		__temp5 = __temp4;
			if(__temp5) {
		num_aux = 1;
			}
			else {
		__temp6 = this;
		__temp6.computeFib(__formalnum - 1);
		__temp7 = __temp6.__Fib__computeFibRetVal;
		__temp8 = this;
		__temp8.computeFib(__formalnum - 2);
		__temp9 = __temp8.__Fib__computeFibRetVal;
		num_aux = (__temp7) + (__temp9);
			}
			}
		__Fib__computeFibRetVal = num_aux;
	}
	public void compare( int num1, int num2) {
		int __formalnum1;
		int __formalnum2;
		boolean retval;
		int aux03;
		boolean __temp10;
		boolean __temp11;
		__formalnum1 = num1;
		__formalnum2 = num2;
		retval = false;
		aux03 = __formalnum2 + 1;
		__temp10 = __formalnum1 < __formalnum2;
			if(__temp10) {
		retval = false;
			}
			else {
		__temp11 = ! (__formalnum1 < aux03);
			if(__temp11) {
		retval = false;
			}
			else {
		retval = true;
			}
			}
		__Fib__compareRetVal = retval;
	}
}

