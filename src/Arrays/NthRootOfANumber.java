package Arrays;

import java.math.BigInteger;

public class NthRootOfANumber {

	public static void main(String[] args) {
		int N = 8;
		int M = 89;
		System.out.println(NthRoot(N, M));
	}
	
	public static int NthRoot(int N, int M) {
        int low = 0; 
        int high = M;
        while(low<=high){
            int mid = low+(high-low)/2;
            long x = (long)rootOfN(mid,N);
            if (x==M) return mid;
            else if (x<M){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -1;
    }
	
    public static long rootOfN(int mid, int N){
        long ans = 1;
        for (int i = 0; i<N; i++){
            ans*=mid;
        }
        return ans;
    }
 
    public static long binPowerBuiltIn(long base, long exp, long mod) {
       BigInteger b = BigInteger.valueOf(base);
       BigInteger e = BigInteger.valueOf(exp);
       BigInteger m = BigInteger.valueOf(mod);
       BigInteger result = b.modPow(e, m);
       return result.longValue();
    }
}
