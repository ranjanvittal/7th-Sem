class NestedIf {
	public static void main(String[] a){
		new NestedIfTest().Start(true);
	}
}

class NestedIfTest {
	int f;
	public void Start(boolean in){
		NestedIfTest nit;
		int returnVal;
		boolean b;
		boolean x;
		TempClass tempClass;
		nit = this;
		tempClass = new TempClass();
		returnVal = 23;
		x = in;
		tempClass.getBool(x);
		b = tempClass.f1;
		tempClass.getSomeOtherBool();

		if(b){
			{ 
				{
					x = !x;
					{ 
						{
							x = x;
							{
								if(x){
									x = false;
								}else{
									nit.getSomeOtherInt();
									System.out.println(returnVal);
								}
							}
						}
					}
				}
			}
		}else if(tempClass.f1){
			returnVal = 40 * 60;
		}else {
			returnVal = 50;
		}

		System.out.println(returnVal);
		System.out.println(f);
		f = returnVal;
	}

	public void getSomeOtherInt(){
		f = 30;
	}
}

class TempClass {
	boolean f1;
	public void getBool(boolean bool){
		f1 =  !(!bool);
	}
	public void getSomeOtherBool(){
		boolean b;
		b = true & false;
		f1 = b;
	}
}
