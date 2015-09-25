A <= B ? // No
B <= C ? // No
C <= D ? // No
D <= E ? // No
E <= F ? // No
D <= F ? // No
F <= B ? // Yes
E <= D ? // Yes
D <= C ? // Yes
C <= B ? // Yes
B <= A ? // Yes

interface A {
}

interface B {
  int a(int c);
}

interface C {
  int a(int x);
  int b(boolean y);
}

interface D {
  int a(int x);
  int b(boolean y);
  A c(C b);
}

interface E {
  int a(int x);
  int b(boolean y);
  B c(B b);
  boolean d(boolean e);
}

interface F {
  int a(int x);
  int b(boolean y);
  C c(A a);
  boolean d(boolean e);
  int x(int y);
}
