class cs12b016_test_2 {
  public static void main(String[] a) {
    System.out.println(new SumTillNNumbers().Print(10));
  }
}

class SumTillNNumbers {
  public int Print(int n) {
    int [] sum;
    int a;
    int b;
    int i;
    int ans;
    sum = new int [(n + 1)];
    i = 1;
    sum[0] = 0;
    ans = 0;
    while (i < (n + 1)) {
      sum[i] = i + (sum[(i - 1)]);
      System.out.println(sum[i]);
      i = i + 1;
    }
    return ans;
  }
}
