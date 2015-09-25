ifc1 <= ifc2 ?
ifc3 <= ifc2 ?
ifc2 <= ifc1 ?
ifc2 <= ifc3 ?

interface ifc1{
	boolean calc(int a);
	int fact(boolean b);
	void kinetic(int c);
}

interface ifc2{
	int fact(boolean b);
	boolean x(boolean y);
	boolean calc(int a);
	void kinetic(int z);
}

interface ifc3{
	int fact(int xa);
}