A <= B ?
B <= C ?
A <= C ?
C <= A ?
C <= B ?

interface A {
	A foo(int a);
}

interface B {
	B foo(int a);
	boolean fun(int i);
}

interface C {
	C foo(int a);
	boolean fun(int i);
}
