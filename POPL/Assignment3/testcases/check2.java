B <= C ?  // Yes
C <= B ?  // No
B <= C ?  // Yes
D <= A ?  // Yes

interface A {
  C m(A a);
}

interface B {
  B m(C a);
  int w(C a);
  int s(A a);
}

interface C {
  C m(C a);
  int w(C a);
  int s(D a);
}

interface D {
  B m(A a);
  int s(C a);
}
