package recursion_Backtracking;

public class HouseRobber_Recursion {

	public static void main(String[] args) {
		int[] nums = {2,1,3,9};
		System.out.println(robber(nums, 0));

	}

	// Recursion with T.C -> O(2^n) and S.C-> O(n) 
	
	private static int robber(int[] nums, int i) {
		if (i >= nums.length) return 0;
		int first = nums[i]+robber(nums, i+2);
		int second = robber(nums, i+1);
		return Math.max(first, second);
	}

}
