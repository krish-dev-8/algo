package basic;

public class IsNumberEqualsSumOfDivisors {
    public static boolean isNumberEqualsSumOfDivisors(final int n)
    {
        int sum = n==1?0:1;
        for(int i = 2; i < Math.sqrt(n);i++)
            if(n%i == 0)
                sum = sum + i + n/i;
        if(n%Math.sqrt(n) == 0 && n!=Math.sqrt(n))
            sum = (int) (sum + Math.sqrt(n));
        return sum == n;
    }
}
