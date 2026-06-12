package Arrays;

public class SplitArrayAndPaintersPartition {

	public static void main(String[] args) {
		int [] nums = {10,20,30,40};
		int k = 2;
		System.out.println(splitArray(nums,k));
	}
	
	// Split Array and Painters Partition problems
	
	public static int painterPartition(int[] nums, int k) {
		int low = 0;
		int high = 0;
		for (int num : nums) {
			low = Math.max(low, num);
			high+=num;
		}
		for (int i = low; i<=high; i++) {
			int count = paint(nums,i);
			if (count==k) return i;
		}
		return 0;
	}
	public static int paint(int[] nums, int unit) {
		int count = 1;
		int sum = 0;
		for (int i = 0; i<nums.length; i++) {
			if (sum+nums[i]<unit) {
				sum+=nums[i];
			}else {
				count++;
				sum = nums[i];
			}
		}
		return count;
	}
	
	
	
	
    public static int splitArray(int[] nums, int k) {
        int low = Integer.MIN_VALUE;
        int high = 0;
        for (int num : nums){
            low = Math.max(low,num);
            high+=num;
        }
       if (k ==1) return high;
        while(low<=high){
            int mid = low+(high-low)/2;
            int mini = largestMinSubArray(nums, mid);
            if (mini>k) low = mid+1;
            else high = mid-1;
        }
        return low;
    }
    public static int largestMinSubArray(int[] nums, int mid){
        int count = 1;
        int sum = 0;
        for (int i = 0; i<nums.length; i++){
            if (sum+nums[i]<=mid){
                sum+=nums[i];
            }else {
                sum = nums[i];
                count++;
            }
        }
        return count;
    } 
}