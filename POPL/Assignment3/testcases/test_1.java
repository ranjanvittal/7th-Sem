A <= B ? // Yes
B <= A ? // Yes
B <= C ? // No
C <= B ? // Yes
C <= A ? // Yes

interface A {
  int a(int b);
}

interface B {
  int a(int c);
}

interface C {
  int a(int b);
  int f(boolean b);
}
