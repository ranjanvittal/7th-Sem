A <= B ?
B <= A ? 
C <= D ?
D <= C ? 

interface A {
  int m(B x);
}

interface B {
  void  m(A x);
}
interface C {
  int n(D x);
}

interface D {
  void  n(C x);
}
