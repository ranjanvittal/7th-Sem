class cs12b016_test_3 {
  public static void main(String[] a) {
    new print().print();
  }
}

class print {
  public void print() {
    Random rand;
    result_int res;
    res = new result_int();
    rand = new Random();
    rand.Get(10, res);
    System.out.println(res.res);
  }
}

class result_int {
  int res;
}

class result_int_arr {
  int [] arr;
}

class Random {
  int result_int;
  public void Get(int n, result_int res) {
    result_int_arr fa;
    Random th;
    int [] arr;
    th = this;
    fa = new result_int_arr();
    th.Put((n * n), fa);
    arr = fa.arr;
    res.res = (arr.length);
  }
  public void Put(int n, result_int_arr a) {
    int i;
    int [] arr;
    result_int fres;
    result_int_arr fa;
    MoreRandom rand;
    arr = new int[n];
    fres = new result_int();
    fa = new result_int_arr();
    rand = new MoreRandom();
    rand.Put(n, fa);
    arr = fa.arr;
    i = arr.length;
    i = 0;
    while (i < n) {
      System.out.println(i);
      if (0 < i) arr[i] = (arr[(i - 1)]) + (i * i);
      else {}
      i = i + 1;
    }
    a.arr = arr;
  }
}

class MoreRandom extends R {
  int u;
  public void Put(int n, result_int_arr a) {
    a.arr = (new int[n]);
  }
}

class R {
  int v;
  public void Get(int n, result_int res) {
    res.res = (n + 1);
  }
}
