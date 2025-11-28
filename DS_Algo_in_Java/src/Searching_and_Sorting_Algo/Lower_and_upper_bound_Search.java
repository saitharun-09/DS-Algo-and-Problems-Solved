package Searching_and_Sorting_Algo;

public class Lower_and_upper_bound_Search {
	
	public static void main(String[] args) {
		int[] nums = {1,3,4,5,6,7,9};
		int key = 8;
		System.out.println(lowerBound(nums,key));
		System.out.println(upperBound(nums,key));
	}
	
	public static int upperBound(int[] nums, int key) {
		int low = 0;
		int high = nums.length-1; 
		int res = -1;
		while (low<=high) {
			int mid = low+(high-low)/2;
			if (nums[mid]>key) {
				res = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return res;
	}
	
	public static int lowerBound(int[] nums, int key) {
		int low = 0;
		int high = nums.length-1;
		int res = nums.length;
		while(low<=high) {
			int mid =low+(high-low)/2;
			if (nums[mid]>=key) {
				high = mid-1;
				res = mid;
			}else {
				low = mid+1;
			}
		}
		return res;	
	}
	
}
