// Implements push and pop starting from a[1]
class Stack{
    public static void main(String[] a){
	System.out.println(new S().Start());
    }
}
class S{

	int[] a;
	int top;

	public int init()
	{
		a= new int[10];
		top = 0;
		return 0;
	}

	public int push(int val)
	{
		top= top+1;
		a[top]=val;
		return 0;
	}
	public int pop()
	{
		int temp;
		temp =a[top];
		top=top-1;
		return temp;
	}

    public int Start(){
	int ret;
	ret = this.init();
	ret = this.push(10);
	ret = this.push(1);
	ret = this.push(20);
	ret = this.pop();
	return ret;
	}



}
