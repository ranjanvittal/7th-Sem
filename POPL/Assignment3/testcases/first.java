A <= B ?  // No
B <= C ?  // Yes
C <= C ?  // Yes
D <= C ?  // No

interface A {
  B m(D a);
  int s(B a);
}

interface B {
  C m(C a);
  int s(A a);
}

interface C {
  C m(C a);
}

interface D {
  A m(A a);
}
