A <= B ?
B <= A ?

interface A {
  void m(A x);
}

interface B {
  int m(B x);
  int n(B x);
}
