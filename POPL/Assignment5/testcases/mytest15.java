class mytest15 { public static void main ( String[] micro_a) {
new new_mytest15().print();
}
}

class new_mytest15 {
    int first1;
    int first2;
    public void print() {
        new_mytest15 looks;
        new_mytest15 looks2;
        int[] b;
        int i;
        first1 = 0;
        first2 = 0;
        looks = this;
        looks2 = new new_mytest15();
        looks2.first2 = 0;
        looks2.first1 = 0;
        looks.initiate(looks2);
        System.out.println(first1);
        System.out.println(first2);
        first1 = looks2.first1;
        first2 = looks2.first2;
        System.out.println(first1);
        System.out.println(first2);
    }

    public void initiate(new_mytest15 looks) {
        new_mytest15 c;
        c = this;
        while( first1 < 100 ) {
            while ( first2 < 100) {
                looks.first1 = first1 + 1;
                looks.first2 = first2 + 1;
                System.out.println(first1);
                System.out.println(first2);
                System.out.println(looks.first1);
                System.out.println(looks.first2);
                looks.initiate(c);
            }
        }
        looks.first1 = first2 + 1;
        looks.first2 = first1 + 1;
    }

}



