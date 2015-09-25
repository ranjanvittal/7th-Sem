I1 <= I2 ?
I2 <= I1 ?
I3 <= I1 ?

interface I1{
        boolean a(boolean b);
	int b(boolean a);
}

interface I2{
        boolean a(boolean v);
}

interface I3{
        int a(boolean b);
}

