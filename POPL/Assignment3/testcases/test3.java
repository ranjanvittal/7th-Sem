A<=C?
B<=D?
interface A{
    B calculator(int a);
    C calculator1(int a);
}
interface B{
    A calculator(int a);
    C calculator1(int a);
    void integer(int a);
}
interface C{
    A calculator(int a);
    B calculator1(int a);
}
interface D{
    int calculator(int a);
    int calculator1(int a);
    void integer(int b);
}