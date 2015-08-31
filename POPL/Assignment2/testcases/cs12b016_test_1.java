class cs12b016_test_1 {
  public static void main(String[] a) {
    new printing_class().Print(10);
  }
}

class printing_class {
  public void Print(int val) {
    Fibonacci fibo;
    fibo = new Fibonacci();
    fibo.Get(val);
    System.out.println(fibo.ans);
    fibo.Get((val + 10));
    System.out.println(fibo.ans);
  }
}

class Fibonacci {
  int ans;
  public void Get(int n) {
    Fibonacci f1;
    Fibonacci f2;
    if (n < 3) {
      ans = 1;
    } else {
      f1 = new Fibonacci();
      f1.Get((n - 1));
      f2 = new Fibonacci();
      f2.Get((n - 2));
      ans = (f1.ans + f2.ans);
    }
  }
}
