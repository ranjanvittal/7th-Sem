table <= furniture ?
chair <= furniture ?

interface furniture{
	boolean wooden(boolean quality);
	int classroom(boolean yes);
	int office(boolean yes);
}

interface chair{
	int office(boolean yes);
	boolean classroom(boolean yes);
}

interface table{
	int office(int g);
	int classroom(boolean no);
}

