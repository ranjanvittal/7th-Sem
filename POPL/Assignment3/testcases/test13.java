I1 <= I2 ? //Yes
I2 <= I1 ? //Yes
I3 <= I1 ? //Yes
I3 <= I2 ? //Yes
I2 <= I3 ? //No

interface I1{

}

interface I2{
}

interface I3{
        int a(boolean b);
}


