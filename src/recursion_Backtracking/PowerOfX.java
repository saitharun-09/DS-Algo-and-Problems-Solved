package recursion_Backtracking;

public class PowerOfX {

	public static void main(String[] args) {
		double x = 2.10000;
		int n = 3;
		System.out.println(myPow(x, n));
	}
// T.C -> O(log n) 
	private static double myPow(double x, int n) {
		double ans = 1.0; 
        long l = n;
        if (l<0) {
            l=-1*l;
            x= 1/x;
        }
        while(l>0) {
            if (l%2==1) {
                ans = ans*x;
                l--;
            }
                x = x*x;
                l/=2;
        }
        return ans;
    }
	 /*
	// Brute Force O(n) T.C
	private static double myPow(double x, int n) {
        double ans = 1.0; 
        long l = n;
        if (l<0) {
            l = -1*l;
            x = 1/x;
        }
        for (long i = 0; i<l; i++) {
            ans*=x;
        }
        return ans;
    }
    */
}
