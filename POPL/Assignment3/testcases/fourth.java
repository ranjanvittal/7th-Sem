A <= C ?  // No
B <= A ?  // No
C <= A ?  // No
D <= A ?  // No

interface A {
  C m(A a);
  boolean w(D a);
}

interface B {
  B m(C a);
  boolean w(C a);
}

interface C {
  A m(D a);
  int w(int a);
}

interface D {
  B m(C a);
}
