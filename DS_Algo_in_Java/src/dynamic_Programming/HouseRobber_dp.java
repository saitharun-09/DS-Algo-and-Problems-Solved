package dynamic_Programming;

import java.util.Arrays;

public class HouseRobber_dp {

	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
        int[] memo = new int[nums.length];
        Arrays.fill(memo,-1);
        //System.out.println(pickhouse(nums,0,memo)); 
        //System.out.println(rob(nums)); 
        
        // dp with Space Optimize -> O(1) and T.C -> O(n)
        int prev2 = 0;
        int prev = 0;
        for (int num : nums) {
            int curr = Math.max(prev2+num,prev);
            prev2 = prev;
            prev = curr;
        }
        System.out.println(prev);
    }
	
	// dp with Tabulation with T.c-> O(n) and S.C -> O(n)
	private static int rob(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        memo[1] = Math.max(nums[0], nums[1]);
        
        for (int i = 2; i<nums.length; i++) {
            memo[i] = Math.max(nums[i]+memo[i-2],memo[i-1]);
        }
        return memo[nums.length-1];
    } 
	
	// Recursion + Memoization T.C -> O(n) and S.C -> O(n) and recursion calls
	private static int pickhouse(int[] nums, int i, int[] memo) {
        if (i>nums.length-1) return 0;
        if (memo[i] != -1) return memo[i];
        int robFirst = nums[i]+pickhouse(nums,i+2,memo);
        int robSecond = pickhouse(nums,i+1, memo);
        memo[i] = Math.max(robFirst, robSecond);
        return memo[i];
    } 
}
