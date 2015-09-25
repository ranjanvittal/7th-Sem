A <= B ?
B <= A ?
A <= C ?
C <= A ?
B <= D ?
D <= B ?
C <= D ?
D <= C ?
C <= B ?
B <= C ?
D <= A ?
A <= D ?

interface A {
  B m(A x);
}

interface B {
  int m(D x);
  A n(B x);
}

interface C {
  C m(A x);
  C n(A x);
  C o(A x);
}

interface D {
  int m(D x);
  C n(A x);
}
