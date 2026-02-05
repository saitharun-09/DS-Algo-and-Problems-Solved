package dynamic_Programming;

import java.util.Arrays;

public class HouseRobber_II_dp {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		int[] memo = new int[nums.length];
		Arrays.fill(memo, -1);
		//int start = houseRob(nums, 0, nums.length-2, memo);
		Arrays.fill(memo, -1);
		//int end = houseRob(nums, 1, nums.length-1, memo);
		//System.out.println(Math.max(start, end));
		
		// dp with Space Optimization of O(1) and T.C -> O(n)
	    System.out.println(Math.max(houseRob(nums,0,nums.length-2),houseRob(nums,1,nums.length-1)));
}

	public static int houseRob(int[] nums, int k, int n) {
		int prev2 = 0;
	    int prev = 0;
	    for(int i = k; i<=n; i++) {
	        int curr = Math.max(prev2+nums[i], prev);
	        prev2 = prev;
	        prev = curr;
	    }
	    return prev;
	}
	 /*
	// dp-Recursion + Memoization T.C-> O(n) and S.C-> O(n) 
	private static int houseRob(int[] nums, int i, int n, int[] memo) {
		if (i>n) return 0;
		if (memo[i] != -1) return memo[i];
		int one = nums[i]+houseRob(nums, i+2, n , memo);
		int two = houseRob(nums, i+1, n, memo);
		return memo[i] = Math.max(one, two);
	}
	*/
}
