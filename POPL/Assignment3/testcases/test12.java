I5 <= I6 ? //Yes
I6 <= I5 ? //No
I7 <= I5 ? //No
I5 <= I7 ? //Yes
I8 <= I5 ? //No
I5 <= I8 ? //Yes
I6 <= I7 ? //No
I7 <= I6 ? //No

interface I1{
        void a(boolean b);
}

interface I2{
        boolean a(boolean b);
}

interface I3{
        int a(boolean b);
}

interface I4{
        I1 a(boolean b);
}

interface I5{
        void a(I1 b);
}

interface I6{
        void a(I2 b);
}

interface I7{
        void a(I3 b);
}

interface I8{
        void a(I4 b);
}

