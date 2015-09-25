cow <= animals ?
cat <= birds ?
sparrow <= animals ?
falcon <= birds ?

interface animals{
	int legs(int x);
	boolean walk(boolean yes);
	boolean havetail(int c);
}

interface birds{
	int legs(int p);
	boolean fly(boolean yes);
	boolean havewings(boolean b);
}

interface cow{
	int legs(int four);
	boolean walk(boolean y);
	int color(int white);
	boolean havetail(int x);
}

interface sparrow{
	int legs(int b);
	boolean havewings(boolean n);
	int lives(int sky);
	boolean fly(boolean y);
}

interface cat{
	int legs(int p);
	boolean walk(boolean yes);
	int color(int black);
	boolean havetail(boolean yes);
}

interface falcon{
	int legs(int two);
	int fly(boolean yes);
}