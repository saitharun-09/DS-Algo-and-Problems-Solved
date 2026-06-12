package Arrays;

public class BinarySearchOnRotatedArray {

	public static void main(String[] args) {
		int[] nums = {4,5,6,7,0,1,2};
		int target = 1;
		System.out.println(search(nums,target));
		System.out.println(binarySearch(nums,target));
	}

	    public static boolean binarySearch(int[] nums, int target) {
	        int low = 0;
	        int high = nums.length-1;
	        while (low<=high){
	            int mid = low+(high-low)/2;
	            if (nums[mid]==target) return true;
	            if ((nums[mid]==nums[low]) && (nums[high]==nums[mid])){
	                low++;
	                high--;
	            }else if (nums[low]<=nums[mid]){
	                if (nums[low]<=target && target<nums[mid]){
	                    high = mid-1;
	                }else {
	                    low = mid+1;
	                }
	            }else {
	                if (nums[mid]<target && target<=nums[high]){
	                    low = mid+1;
	                }else {
	                    high = mid-1;
	                }
	            }
	        }
	    return false;
	    }
	
    public static int search(int[] nums, int target) {
        int low = 0; 
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[mid]==target) return mid;
            else if (nums[mid]<nums[high]){
                if (nums[mid]<=target && target<=nums[high]){
                    low = mid+1;
	            }else {
                    high = mid-1;
                }
            }else{
                if (nums[low]<=target && target<=nums[mid]){
                    high = mid-1;
                }else {
                    low = mid+1;
                }
            }
        }
        return -1;
    }

}
