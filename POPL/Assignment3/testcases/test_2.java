A <= B ? // No
B <= A ? // Yes
A <= C ? // No
C <= A ? // Yes
C <= B ? // No
B <= C ? // No
A <= D ? // No
D <= A ? // Yes
B <= D ? // No
D <= B ? // Yes
C <= D ? // No
D <= C ? // Yes

interface A {
}

interface B {
  void a(int b);
}

interface C {
  int b(int a);
}

interface D {
  void a(int x);
  int b(int y);
}
