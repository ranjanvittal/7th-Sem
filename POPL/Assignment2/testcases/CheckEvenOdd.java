class CheckEvenOdd {

	public static void main( String[] CheckEvenOdd) {
				new CheckEvenOddPrinter().__main(0);
	}
}

class CheckEvenOddPrinter {

	public void __main( int __argLen) {
				int __printVal;
				int __EOTmp;
			EO __EOObject;
			__EOObject = new EO();
			__EOObject.start();
			__printVal = __EOObject.__EO__startRetVal;

				System.out.println(__printVal);
	}
}

class EO {
	int  __EO__startRetVal;
	boolean  __EO__checkRetVal;
	boolean  __EO__compareRetVal;

	public void start() {
		EO __temp0;
		boolean __temp1;
		boolean __temp2;
		EO __temp3;
		boolean __temp4;
		boolean __temp5;
		EO __temp6;
		boolean __temp7;
		boolean __temp8;
		EO __temp9;
		boolean __temp10;
		boolean __temp11;
		EO __temp12;
		boolean __temp13;
		boolean __temp14;
		EO __temp15;
		boolean __temp16;
		boolean __temp17;
		EO __temp18;
		boolean __temp19;
		boolean __temp20;
		EO __temp21;
		boolean __temp22;
		boolean __temp23;
		__temp0 = this;
		__temp0.check(8);
		__temp1 = __temp0.__EO__checkRetVal;
		__temp2 = __temp1;
			if(__temp2) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp3 = this;
		__temp3.check(19);
		__temp4 = __temp3.__EO__checkRetVal;
		__temp5 = __temp4;
			if(__temp5) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp6 = this;
		__temp6.check(20);
		__temp7 = __temp6.__EO__checkRetVal;
		__temp8 = __temp7;
			if(__temp8) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp9 = this;
		__temp9.check(21);
		__temp10 = __temp9.__EO__checkRetVal;
		__temp11 = __temp10;
			if(__temp11) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp12 = this;
		__temp12.check(37);
		__temp13 = __temp12.__EO__checkRetVal;
		__temp14 = __temp13;
			if(__temp14) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp15 = this;
		__temp15.check(38);
		__temp16 = __temp15.__EO__checkRetVal;
		__temp17 = __temp16;
			if(__temp17) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp18 = this;
		__temp18.check(39);
		__temp19 = __temp18.__EO__checkRetVal;
		__temp20 = __temp19;
			if(__temp20) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__temp21 = this;
		__temp21.check(50);
		__temp22 = __temp21.__EO__checkRetVal;
		__temp23 = __temp22;
			if(__temp23) {
			System.out.println(1);
			}
			else {
			System.out.println(0);
			}
		__EO__startRetVal = 0;
	}
	public void check( int num) {
		int __formalnum;
		boolean bs01;
		int count01;
		int count02;
		int aux01;
		int aux02;
		boolean __temp24;
		EO __temp25;
		boolean __temp26;
		boolean __temp27;
		__formalnum = num;
		count01 = 0;
		count02 = 0;
		aux01 = __formalnum - 1;
		__temp24 = count02 < aux01;
			while(__temp24) {
		{
		count01 = count01 + 1;
		count02 = count02 + 2;
		}
		__temp24 = count02 < aux01;
			}
		aux02 = count01 * 2;
		__temp25 = this;
		__temp25.compare(aux02,__formalnum);
		__temp26 = __temp25.__EO__compareRetVal;
		__temp27 = __temp26;
			if(__temp27) {
		bs01 = true;
			}
			else {
		bs01 = false;
			}
		__EO__checkRetVal = bs01;
	}
	public void compare( int num1, int num2) {
		int __formalnum1;
		int __formalnum2;
		boolean retval;
		int aux03;
		boolean __temp28;
		boolean __temp29;
		__formalnum1 = num1;
		__formalnum2 = num2;
		retval = false;
		aux03 = __formalnum2 + 1;
		__temp28 = __formalnum1 < __formalnum2;
			if(__temp28) {
		retval = false;
			}
			else {
		__temp29 = ! (__formalnum1 < aux03);
			if(__temp29) {
		retval = false;
			}
			else {
		retval = true;
			}
			}
		__EO__compareRetVal = retval;
	}
}

