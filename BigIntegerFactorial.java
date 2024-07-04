//This program prints Factorial of a Number using BigInteger in Java

import java.math.BigInteger;
public class BigIntegerFactorial {
    public static void main(String args[])
    {
        int num = 5;
        BigInteger f = new BigInteger("1");
        for(int i=1;i<=num;i++)
        {
            BigInteger a = BigInteger.valueOf(i);
            f = f.multiply(a);
        }
        System.out.println("Factorial = "+f);
    }
}