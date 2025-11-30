package Arrays;

public class CountNoOfTimesArrayRotated {

	public static void main(String[] args) {
		int[] nums = {3,2,1};
		System.out.println(countRotations(nums));
	}

	public static int countRotations(int[] nums) {
        if (nums.length==1) return 0;
        int min = Integer.MAX_VALUE;
        int index = -1;
        int low = 0;
        int high = nums.length-1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if (nums[low]<nums[high]){
                if (nums[low]<min) {
            		index = low;
            		min = nums[low];
            	}
                break;
            }
            if (nums[low]<=nums[mid]){
            	if (nums[low]<min) {
            		index = low;
            		min = nums[low];
            	}
                low = mid+1;
            }else if (nums[mid]<nums[high]){
            	if (nums[mid]<min) {
            		index = mid;
            		min = nums[mid];
            	}
                high = mid-1;
            }
        }
        return index;
	}
}