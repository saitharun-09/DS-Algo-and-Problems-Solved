package recursion_Backtracking;

public class HouseRobber_II_Recursion {

	public static void main(String[] args) {
		int[] nums = {1,2,3,1};
		int start = houseRob(nums, 0, nums.length-2);
		int end = houseRob(nums, 1, nums.length-1);
		System.out.println(Math.max(start, end));
	}

	private static int houseRob(int[] nums, int i, int n) {
		if (i>n) return 0;
		int one = nums[i]+houseRob(nums, i+2, n);
		int two = houseRob(nums, i+1, n);
		return Math.max(one, two);
	}
}
