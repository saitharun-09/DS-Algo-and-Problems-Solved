package dynamic_Programming;

public class ClimbStairs_dp {

	public static void main(String[] args) {
		int n = 4;
		System.out.println(climbStairs(n));
	}

	private static int climbStairs(int n) {
		 if (n == 0 || n==1) return n;
	        int prev2 = 1;
	        int prev = 2;
	        for (int i = 3; i<=n; i++) {
	            int curr = prev2+prev;
	            prev2= prev;
	            prev = curr;
	        }
	        return prev;
	    }
	  
	/*
	// Recursion + Memoization T.C-> O(n), S.C -> O(n) and Recursion calls
	private static int climbStairs(int n) {
		if (n<=2) return n;
        int[] arr = new int[n+1];
        arr[1] = 1;
        arr[2] = 2;
        return climb(arr,n);
	}

	private static int climb(int[] arr, int n) {
		if (n<=2) return n;
        if (arr[n]!=0) return arr[n];
        arr[n] = climb(arr,n-1)+ climb(arr, n-2);
        return arr[n];
    }
    */
}
