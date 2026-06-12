package Arrays;

public class MinElementInSortedRotatedArray {

	public static void main(String[] args) {
		int[] nums = {3,4,5,6,0,1,2};
		System.out.println(findMin(nums));
		System.out.println(findMini(nums));
	}

	//More Optimized Version 
	public static int findMini(int[] nums) {
        if (nums.length==1) return nums[0];
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[low]<nums[high]){
                min = Math.min(nums[low], min);
                break;
            }
            if (nums[low]<=nums[mid]){
                min = Math.min(nums[low],min);
                low = mid+1;
            }else if (nums[mid]<nums[high]){
                min = Math.min(nums[mid],min);
                high = mid-1;
            }
        }
        return min;
    }
	
	public static int findMin(int[] nums) {
        if (nums.length==1) return nums[0];
        int min = Integer.MAX_VALUE;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[low]<=nums[mid]){
                min = Math.min(nums[low],min);
                low = mid+1;
            }else if (nums[mid]<nums[high]){
                min = Math.min(nums[mid],min);
                high = mid-1;
            }
        }
        return min;
    }
}
