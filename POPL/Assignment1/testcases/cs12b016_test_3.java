class cs12b016_test_3 {
  public static void main(String[] a) {
    System.out.println(new Fibonacci().Get(new Fibonacci().SmallestLargerFiboPosition(10)));
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
  public int SmallestLargerFiboPosition(int n) {
    int a;
    int b;
    int ans;
    int i;
    int tmp;
    a = 1;
    b = 1;
    if (n < 1) ans = 1;
    else {
      i = 2;
      while (!(n < b)) {
        tmp = b;
        b = a + b;
        a = tmp;
        i = i + 1;
      }
      ans = i;
    }
    return ans;
  }
}
