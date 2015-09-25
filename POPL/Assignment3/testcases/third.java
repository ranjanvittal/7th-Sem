A <= C ?  // Yes
B <= A ?  // Yes
C <= A ?  // Yes
D <= A ?  // Yes

interface A {
  C m(A a);
}

interface B {
  B m(C a);
  int w(C a);
}

interface C {
  A m(C a);
}

interface D {
  B m(A a);
}
