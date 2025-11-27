package Arrays;

public class MaxSubArrayWithLargestSum {

	public static void main(String[] args) {
		int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArrayWithTheLargestSum((nums)));
	}
	
	//kadane's Algorithm
	
	public static int  maxSubArrayWithTheLargestSum(int[] nums) {
		int res = Integer.MIN_VALUE;
		int sum = 0;
		int start = -1;
		int end = -1;
		for (int i = 0; i<nums.length; i++) {
			if (sum==0) {
				start = i;
			}
			sum+=nums[i];
			if (res>sum) {
				res=sum;
			}
			res = Math.max(sum, res);
			end = i;
			if (sum<0) {
				sum=0;
			}
		}
		System.out.println(start);
		System.out.println(end);
		return res;
	}
}