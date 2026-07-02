package Math;

public class Count_Good_Numbers {
    static void main(String[] args) {
        System.out.println(countGoodNumbers(50));
    }

    public static int countGoodNumbers(long n) {
        final long MOD = 1000000007;
        long even = (n+1)/2;
        long odd = n/2;
        long ans1 = power(5,even);
        long ans2 = power(4,odd);
        return (int)((ans1*ans2)%MOD);
    }
    public static int power(long x, long n){
        final long MOD = 1000000007;
        long res = 1;
        while (n>0) {
            if (n%2==0) {
                x = (x*x)%MOD;
                n = n/2;
            }else {
                res = (res*x)%MOD;
                n--;
            }
        }
        return (int)res;
    }
}
