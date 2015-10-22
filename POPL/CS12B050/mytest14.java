class mytest14 { public static void main ( String[] micro_a) {
new new_mytest14().print();
}
}

class new_mytest14 {

    public void print() {
        Genarray looks;
        int[] b;
        int i;
        looks = new Genarray();
        b = new int[101];
        i = 0;
        looks.set(b);
        while(i < 101) {
            i = i + 1;
            looks.print();
        }
    }
}
class Genarray {
    int size;
    int iterator;
    int[] array;
    public void set(int[] b) {
        int i;
        int j;
        array = b;
        size = b.length;
        iterator = 0;
        i = 0;
        while(i < 101) {
            j = i*i;
            array[i] = j;
            i = i +1;
        }
    }

    public void print() {
        int ar;
        ar = array[iterator];
        System.out.println(ar);
        iterator = iterator + 1;
    }
}

class extra_array { int[] first;}
class extra_int { int first;}
class extra_boolean { boolean first;}


