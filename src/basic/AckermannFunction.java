package basic;

public class AckermannFunction {
    public static int recursiveAckermann(int m,int n)
    {
        if(m==0) return n+1;
        if(n==0) return recursiveAckermann(m-1,1);
        return recursiveAckermann(m-1,recursiveAckermann(m,n-1));
    }
}
