F <= E ? // Yes
G <= E ? // Yes
A <= B ? // No
B <= A ? // Yes

interface E {
}

interface F {
  int a(int b);
}

interface G {
  int x(int m);
}

interface A {
  E a(G a);
}

interface B {
  F a(E b);
}
