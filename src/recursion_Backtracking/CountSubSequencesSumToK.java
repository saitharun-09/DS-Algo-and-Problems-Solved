package recursion_Backtracking;

public class CountSubSequencesSumToK {

	public static void main(String[] args) {
		int[] nums = {1,2,2,3,4};
		int target = 4;
		System.out.println(CountSubSequence(nums, 0, 0, target));
	}

	private static int CountSubSequence(int[] nums, int sum, int i, int target) {
		if (i >= nums.length) {
			if (sum == target) return 1;
			else return 0;
		}
		sum+=nums[i];
		int pick = CountSubSequence(nums, sum, i+1, target);
		sum-=nums[i];
		int skip =  CountSubSequence(nums, sum, i+1, target);
		return pick+skip;		
	}

}
