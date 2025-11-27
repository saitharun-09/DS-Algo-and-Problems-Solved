package Searching_and_Sorting_Algo;

public class Lower_and_upper_bound_Search {
	
	public static void main(String[] args) {
		int[] nums = {1,3,4,5,6,7,9};
		int key = 9;
		System.out.println(lowerBound(nums,key));
	}
	
	public static int lowerBound(int[] nums, int key) {
		int low = 0;
		int high = nums.length-1;
		int mid =low+(high-low)/2;
		int res = nums.length;
		while(low<=high) {
			if (nums[mid]>=key) {
				high = mid-1;
				res = nums[mid];
			}else if (nums[mid]<key) {
				low = mid+1;
			}
		}
		return res;	
	}
	
}
