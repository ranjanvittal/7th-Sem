class Inheritence1{
    public static void main(String[] a){
    	new PrintHelper().print();
    }
}

class Parent1 {
	int f1;
	
    public void getSomeInt(){
    	f1 = 28;
    }
}

class Child1 extends Parent1{
    
}

class PrintHelper{
	public void print(){
		Child1 ch;
		ch =  new Child1();
		ch.getSomeInt();
		System.out.println(ch.f1);
	}
}