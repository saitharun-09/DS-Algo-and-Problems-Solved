package dynamic_Programming;

public class Fibonacci_dp {

	public static void main(String[] args) {
		int x = 7;
		int[] arr = new int[x+1];
		arr[0] = 0;
		arr[1] = 1;
		System.out.println(fib_dp(x));
	}

	private static int fib_dp(int x) {
		int prev2 = 0;
		int prev1 = 1;
		for (int i = 2; i<=x; i++) {
			int prev = prev2+prev1;
			prev2 = prev1;
			prev1 = prev;
		}
		return prev1;
	}

	
	// Tabulation DP with bottom-up Approach T.C-> O(n) and S.C-> O(n) 
	private static int fib_dp(int x, int[] arr) {
		for (int i = 2; i<=x; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		return arr[x];
	}
	

	
	/*
	// Recursion + Memoization using array  T.C -> O(n) and S.C -> O(n) and recursion calls
	private static int fib_dp(int x, int[] arr) {
		if (x<=1) return x;
		if (arr[x]!=0) return arr[x];
		arr[x] = fib_dp(x-1, arr)+fib_dp(x-2, arr);
		return arr[x];
	}
	*/
}
