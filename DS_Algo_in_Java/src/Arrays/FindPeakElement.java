package Arrays;

public class FindPeakElement {

	public static void main(String[] args) {
		int[] nums = {1,5,1,3,1};
		System.out.println( findPeakElement(nums));
	}

	public static int findPeakElement(int[] nums) {
        if (nums.length==1) return 0;
        if (nums[0]>nums[1]) return 0;
        int n  = nums.length;
        if (nums[n-1]>nums[n-2]) return n-1;
        int low = 1;
        int high = nums.length-2;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if( nums[mid-1]>nums[mid]){
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return -1;
	}
	
	/*
	    public int findPeakElement(int[] nums) {
	        if (nums.length==1) return 0;
	        if (nums[0]>nums[1]) return 0;
	        int n  = nums.length;
	        if (nums[n-1]>nums[n-2]) return n-1;
	        int low = 0;
	        int high = nums.length-1;
	        while(low<=high){
	            int mid = low+(high-low)/2;
	            if (nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
	            else if(nums[low]<nums[mid] && nums[mid-1]<nums[mid]){
	                low = mid;
	            }else {
	                high = mid;
	            }
	        }
	        return -1;
	    }
	*/
}
