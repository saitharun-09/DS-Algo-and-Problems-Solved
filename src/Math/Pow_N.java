package Math;

public class Pow_N {
    static void main(String[] args) {
        long n = 9;
        long x = 5;
        System.out.println(power(x,n));
    }

    public static int power(long x, long n) {
        double res = 1.0;
        if (n < 0) n = n * -1;
        while (n > 0) {
            if (n % 2 == 0) {
                x = x*x;
                n = n/2;
            }else {
                res = res * x;
                n--;
            }
        }
        if ( n < 0) res = 1.0 / res;
        return (int)res;
    }
}
