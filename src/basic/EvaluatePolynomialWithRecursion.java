package basic;

import java.util.Arrays;

public class EvaluatePolynomialWithRecursion {
    public static int polynomialEvaluationWithRecursion(int[]  a,int x) {
        if (a.length == 1) {
            return a[0];
        }
        return a[a.length - 1] + x * polynomialEvaluationWithRecursion(Arrays.copyOfRange(a, 0, a.length - 1), x);
    }
}
