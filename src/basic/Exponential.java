package basic;

public class Exponential {

    public static double exponential(double x , Integer n)
    {
        double pow = 1;
        double z = x;

        while (n > 0)
        {
            byte b = (byte) (n % 2);
            n = Double.valueOf(Math.floor(n/2.0)).intValue();
            if(b == 1)
                pow = pow * z;
            z = z * z;
        }
        return pow;
    }
}
