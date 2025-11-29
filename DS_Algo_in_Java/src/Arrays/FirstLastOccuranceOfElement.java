package Arrays;

import java.util.Arrays;

public class FirstLastOccuranceOfElement {

	public static void main(String[] args) {
		int[] nums = {5,7,7,8,8,10};
		int target = 5;	
		System.out.println(Arrays.toString(searchRange(nums, target)));
		System.out.println(Arrays.toString(binarySolutions(nums, target)));
	}
	
	// Binary Search Approach 
	public static int[] binarySolutions(int[] nums, int target) {
		if (nums.length == 0) {
            return new int[]{-1, -1};
        }
		return new int[]{firstBinarySearch(nums,target), secondBinarySearch(nums,target)};
	}
	public static int firstBinarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int first = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if (nums[mid]==target) {
				first = mid;
				high = mid-1;
			}else if (nums[mid]>target) {
				high = mid-1;
			}else {
				low = mid+1;
			}
		}
		return first;
	}
	public static int secondBinarySearch(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int last = -1;
		while(low<=high) {
			int mid = low+(high-low)/2;
			if (nums[mid]==target) {
				last = mid;
				low = mid+1;
			}else if (nums[mid]<target) {
				low = mid+1;
			}else {
				high = mid-1;
			}
		}
		return last; 
	}
	
	// UpperBound and LowerBound Solution with 2logn TC
	
	public static int[] searchRange(int[] nums, int target) {
    	if (nums.length == 0) {
            return new int[]{-1, -1};
        }
    	int[] array = new int[2];
        array[0] = lowerBound(nums, target);
        if (array[0] == -1 || nums[array[0]] != target) {
            return new int[]{-1, -1};
        }
        array[1] = upperBound(nums, target);
	        return array;
	}
    public static int lowerBound(int[] nums, int target){
        int low = 0; 
        int high = nums.length-1;
        int res = -1;
        while (low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]>=target) {
                res = mid;
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return res;
    }
    public static int upperBound(int[] nums, int target){
        int low = 0;
        int high = nums.length - 1;
        int res = nums.length;
        while (low <= high){
            int mid = low + (high - low) / 2;
            if (nums[mid] > target) {
                res = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return res - 1;
    }
    
}