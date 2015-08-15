class mytest5{
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
        Operation a1;
        Operation a2;
        Operation a3;
        Operation a4;
        Operation a5;
        a1 = new Operation();
        a2 = new Length();
        a3 = new Sum();
        a4 = new Product();
        a5 = new Print();

        a = new int[10];
        i = 0;
        while(i < 10) {
            a[i] = i;
            i = i+1;
        }

        System.out.println(a1.Operation(a));
        System.out.println(a2.Operation(a));
        System.out.println(a3.Operation(a));
        System.out.println(a4.Operation(a));
        System.out.println(a5.Operation(a));

        return 1;
    }
}
class Operation {
    public int Operation(int[] a){
        return 1;
    }
}

class Length extends Operation {
    public int Operation(int[] a){
        return a.length;
    }
}

class Sum extends Operation{
    public int Operation(int[] a){
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

class Product extends Operation{
    public int Operation(int[] a){
        int num_aux;
        int length1;
        int product;
        int i;
        boolean b;
        product = 1;
        i = 1;
        length1 = (new Random().return_itself(a)).length;
        while(i < length1) {
            product = product * (a[i]);
            i = i+1;
        }
        return product;
    }
}

class Print extends Operation{
    public int Operation(int[] a){
        int num_aux;
        int length1;
        int sum;
        int i;
        boolean b;
        sum = 0;
        i = 0;
        length1 = (new Random().return_itself(a)).length;
        while(i < length1) {
            System.out.println(a[i]);
            i = i+1;
        }
        return 1;
    }
}
