class cs12b016_test_2 {
  public static void main(String[] a) {
    new printing_class().Print(10);
  }
}

class printing_class {
  public void Print(int val) {
    SumTillNNumbers s;
    result_int res;
    res = new result_int();
    s = new SumTillNNumbers();
    res.result = 0;
    s.Print(val, res);
    System.out.println(res.result);
  }
}

class result_int {
  int result;
}

class SumTillNNumbers {
  public void Print(int n, result_int res) {
    int [] sum;
    SumTillNNumbers th;
    int i;
    th = this;
    if ((!(0 < n)) & (!(n < 0))) {
    } else {
      th.Print((n - 1), res);
    }
    System.out.println(n);
    res.result = (res.result) + n;
  }
}
