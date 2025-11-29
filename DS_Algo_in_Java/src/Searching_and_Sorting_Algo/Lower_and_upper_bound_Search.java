package Searching_and_Sorting_Algo;

public class Lower_and_upper_bound_Search {
	
	public static void main(String[] args) {
		int[] nums = {10,20,30,40,50,60,70,90};
		int key = 25;
	//	System.out.println(lowerBound(nums,key));
	//	System.out.println(upperBound(nums,key));
		System.out.println(floor(nums,key));
		System.out.println(ceil(nums,key));
	}
	
	public static int floor(int[] nums, int key) {
		int low = 0;
		int high = nums.length-1;
		int res = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if (nums[mid]<=key) {
				res = mid;
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return res;
	}
	
		
	public static int ceil(int[] nums, int key) {
		int low = 0;
		int high = nums.length-1;
		int res = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if (nums[mid]>=key) {
				res = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return res;
	}
		
	
	public static int upperBound(int[] nums, int key) {
		int low = 0;
		int high = nums.length-1; 
		int res = nums.length;
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
				res = mid;
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return res;	
	}
	
}
