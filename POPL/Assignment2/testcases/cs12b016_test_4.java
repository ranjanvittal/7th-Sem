class cs12b016_test_4 {
  public static void main(String[] a) {
    new random().Print(10);
  }
}

class random {
  public void Print(int val) {
    int i;
    NumFunc succ;
    NumFunc pred;
    succ = new Successor();
    pred = new Predecessor();
    i = 0;
    while (i < val) {
      succ.Get((i + 1));
      System.out.println(succ.ans);
      System.out.println((i + 1));
      pred.Get((i + 1));
      System.out.println(pred.ans);
      i = i + 1;
    }
  }
}

class NumFunc {
  int ans;
  public void Get(int n) {
    ans = n;
  }
}

class Successor extends NumFunc {
  public void Get(int n) {
    ans = (n + 1);
  }
}

class Predecessor extends NumFunc {
  public void Get(int n) {
    ans = (n - 1);
  }
}
