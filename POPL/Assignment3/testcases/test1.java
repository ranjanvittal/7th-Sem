A<=B?
B<=C?
A<=C?
B<=A?
C<=B?
C<=A?
interface A{
    B calculator(int a);
    C calculator1(int a);
}
interface B{
    A calculator(int a);
    C calculator1(int a);
}
interface C{
    A calculator(int a);
    B calculator1(int a);
}