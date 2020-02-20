package basic;

public class BinomialCoefficient {
    //n >= m
    public static int bin(int n,int m)
    {
        if(n==m || m==0)  return 1;
        return bin(n-1,m) + bin(n-1,m-1);
    }
}
