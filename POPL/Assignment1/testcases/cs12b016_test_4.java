class cs12b016_test_4 {
  public static void main(String[] a) {
    System.out.println(new Successor().Get(new Predecessor().Get(new Successor().Get(10))));
  }
}

class Successor {
  public int Get(int n) {
    return (n + 1);
  }
}

class Predecessor {
  public int Get(int n) {
    return (n - 1);
  }
}
