class mytest4{
    public static void main(String[] a){
        System.out.println(new MyStarter4().start());
    }
}

class Random {
    public int[] return_itself(int[] a){
        return a;
    }
}

class MyStarter4 {
    public int start() {

        int[] a;
        boolean b;
        int i;
        a = new int[10];
        i = 0;
        while(i < 10) {
            a[i] = i;
            i = i+1;
        }
        return new SumOfArray().ComputeSum(a);
    }
}
class SumOfArray {
    public int ComputeSum(int[] a){
        int num_aux;
        int length1;
        int sum;
        int i;
        boolean b;
        sum = 0;
        i = 0;
        length1 = (new Random().return_itself(a)).length;
        while(i < length1) {
            sum = sum + (a[i]);
            i = i+1;
        }
        return sum;
    }
}
