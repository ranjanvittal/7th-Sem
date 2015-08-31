class cs12b016_test_5 {
  public static void main(String[] a) {
    new Random().Get(10);
  }
}

class print {
  fin ans;
  public void print(int val) {
    print th;
    print3 pr3;
    fin pr3_ans;
    System.out.println(val);
    th = this;
    pr3 = new print3();
    pr3.print(val);
    ans = new fin();
    pr3_ans = pr3.ans;
    ans.val = pr3_ans.val;
  }
}

class print2 extends print {
}

class print3 extends print2 {
  fin2 ans;
  public void print(int val) {
    ans = new fin2();
    ans.val = (val + 1);
    System.out.println(ans.val);
  }
}

class fin {
  int val;
}
class fin2 extends fin {
}

class Random {
  int [] arr;
  public void Get(int n) {
    Random th;
    th = this;
    arr = new int [2 * n];
    th.Put(n * n);
    System.out.println(arr.length);
  }
  public void Put(int n) {
    int i;
    fin f;
    print an;
    arr = new int[2 * n];
    i = 0;
    while (i < n) {
      if (0 < i) arr[i] = (arr[(i - 1)]) + ((2 * i) * i);
      else arr[i] = 0;
      i = i + 1;
    }
    an = new print();
    an.print(arr[((2 * n) - 1)]);
    f = an.ans;
    System.out.println(f.val);
  }
}
