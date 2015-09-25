I1 <= I2 ? //No
I2 <= I1 ? //Yes
I3 <= I1 ? //Yes
I3 <= I2 ? //No 
I2 <= I3 ? //No

interface I1{

}

interface I2{
		I1 a (I1 b);
}

interface I3{
		I2 a (I2 b);

}


