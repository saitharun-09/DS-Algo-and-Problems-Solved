package dynamic_Programming;

import java.util.Arrays;

public class Frog_Jump_dp {

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 10};
		int[] memo = new int[arr.length];
		Arrays.fill(memo,-1);
		System.out.println(frogJump(arr, 0, memo));
		
		int prev2 = 0;
		int prev = 0;
		for (int i = 1; i<arr.length; i++) {
			int one = prev+Math.abs(arr[i]-arr[i-1]);
			int two = Integer.MAX_VALUE;
			if (i>1) {
				two = prev2+Math.abs(arr[i]-arr[i-2]);
			}
			int curr = Math.min(one, two);
			prev2 = prev;
			prev = curr;
		}
		System.out.println(prev);
		
		// Tabulation with just 1 Loop T.C -> O(n) and S.C -> O(n)
		/*
		memo[0] = 0;
		for (int i = 1; i<arr.length; i++) {
			int one = memo[i-1]+Math.abs(arr[i]-arr[i-1]);
			int two = Integer.MAX_VALUE;
			if (i>1) {
				two = memo[i-2]+Math.abs(arr[i]-arr[i-2]);
			}
			memo[i] = Math.min(one, two);
		}
		System.out.println(memo[arr.length-1]);
		*/
	}
	
	
	// Recursion + Memoization T.C-> O(n) and S.C -> O(n)
	private static int frogJump(int[] arr, int i, int[] memo) {
		if (i == arr.length-1) return 0;
		if (memo[i]!=-1) return memo[i];
		int one = Integer.MAX_VALUE;
		if (i+1 < arr.length) {
			one = frogJump(arr, i+1, memo) + Math.abs(arr[i+1]-arr[i]);
		}
		int two = Integer.MAX_VALUE;
		if (i+2 <arr.length) {
			two = frogJump(arr, i+2, memo) + Math.abs(arr[i+2]-arr[i]);
		}
		memo[i] = Math.min(one, two);
		return memo[i];
	}
	
	
	/*
	// Pure Recursion approach with T.C -> O(2^n) , S.C -> O(n) and recursion calls
	private static int frogJump(int[] arr, int i) {
		if (i == arr.length-1) return 0;
		int one = Integer.MIN_VALUE;
		if (i+1 < arr.length) {
			one = frogJump(arr, i+1) + Math.abs(arr[i+1]-arr[i]);
		}
		int two = Integer.MAX_VALUE;
		if (i+2 <arr.length) {
			two = frogJump(arr, i+2) + Math.abs(arr[i+2]-arr[i]);
		}
		return Math.min(one, two);
	}
	*/
}
