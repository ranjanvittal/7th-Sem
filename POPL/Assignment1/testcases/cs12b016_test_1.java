class cs12b016_test_1 {
  public static void main(String[] a) {
    System.out.println(new Fibonacci().Get(10));
  }
}

class Fibonacci {
  public int Get(int n) {
    int a;
    int b;
    int ans;
    int tmp;
    a = 1;
    b = 1;
    if (n < 3) ans = 1;
    else {}
    while (2 < n) {
      tmp = b;
      b = a + b;
      a = tmp;
      n = n - 1;
    }
    ans = b;
    return ans;
  }
}
