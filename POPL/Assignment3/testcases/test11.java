I1 <= I2 ? //No
I2 <= I1 ? //Yes
I3 <= I1 ? //Yes
I1 <= I3 ? //No
I4 <= I1 ? //Yes
I1 <= I4 ? //No
I2 <= I3 ? //No
I3 <= I2 ? //No

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

