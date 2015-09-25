A <= B ?
B <= A ?
A <= D ?
D <= A ?

interface A {
  int m(A x);
}

interface B {
  int m(B x);
  int n(B x);
}

interface C {
  int m(C x);
  int n(C x);
  int o(C x);
}

interface D {
  int m(D x);
  int n(D x);
  int o(D x);
  int p(D y);
}
