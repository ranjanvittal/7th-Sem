class Test5
{
  public static void main (String[]a)
  {
    new ____NewMainClass____ ().____Main____ (0);
}} class ____NewMainClass____
{
  public void ____Main____ (int ____arg_length____)
  {
    int ____printMe____;
    int ___tmp5;
    Test ___tmp4;
      ___tmp4 = new Test ();
      ___tmp4.test (7);
      ___tmp5 = ___tmp4.____1234test4321____;
      ____printMe____ = ___tmp5;
      System.out.println (____printMe____);
}} class Test
{
  int ____1234test4321____;
  int ____1234div4321____;
  public void test (int a)
  {
    boolean test;
    int ret;
    int temp;
    int divRes;
    boolean foo;
    int i;
    int ____writeable____a;
    int ___tmp3;
    Test ___tmp2;
      ____writeable____a = a;
      test = true;
      i = 2;
    while (i < ____writeable____a)
      {
	{
	  ___tmp2 = this;
	  ___tmp2.div (____writeable____a, i);
	  ___tmp3 = ___tmp2.____1234div4321____;
	  divRes = ___tmp3;
	  temp = divRes * i;
	  if (____writeable____a < temp)
	    {
	      test = test & true;
	    }
	  else if (temp < ____writeable____a)
	    {
	      test = test & true;
	    }
	  else
	    {
	      test = test & false;
	    }
	  i = i + 1;
	}
      }
    if (test)
      {
	ret = 1;
      }
    else
      {
	ret = 0;
      }
    ____1234test4321____ = ret;
  }
  public void div (int a, int b)
  {
    int i;
    int ret;
    int test;
    boolean tmp;
    int ____writeable____a;
    int ____writeable____b;
    ____writeable____b = b;
    ____writeable____a = a;
    i = 1;
    ret = 1;
    if (____writeable____a < ____writeable____b)
      {
	ret = 0;
      }
    else
      {
	tmp = false;
	while (!tmp)
	  {
	    {
	      test = ____writeable____b * i;
	      if (test < ____writeable____a)
		{
		  tmp = false;
		}
	      else if (____writeable____a < test)
		{
		  tmp = true;
		  ret = i - 1;
		}
	      else
		{
		  tmp = true;
		  ret = i;
		}
	      i = i + 1;
	    }
	  }
      }
    ____1234div4321____ = ret;
  }
}
