A <= B ?
B <= C ?
C <= D ?
D <= A ?
A <= C ?
B <= D ?

interface A {
  int fooA(int a);
}

interface B {
  int fooB(boolean b);
}

interface C {
  boolean fooC(int c);
}

interface D {
  boolean  fooD(boolean d);
}

