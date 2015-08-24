class cs12b016_test_5 {
  public static void main(String[] a) {
    System.out.println(new Random().Get(10));
  }
}

class Random {
  public int Get(int n) {
    return ((this.Put((n * n))).length);
  }
  public int[] Put(int n) {
    int i;
    int [] arr;
    arr = new int[n];
    i = 0;
    while (i < n) {
      System.out.println(i);
      if (0 < i) arr[i] = (arr[(i - 1)]) + (i * i);
      else {}
      i = i + 1;
    }
    return arr;
  }
}
