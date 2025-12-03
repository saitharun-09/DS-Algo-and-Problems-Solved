package Arrays;

public class FindSmallestDivisorGivenThreshold {

	public static void main(String[] args) {
		int[] nums = {44,22,33,11,1};
		int threshold = 5;
		System.out.println(smallestDivisor(nums,threshold));
	}

	public static int smallestDivisor(int[] nums, int threshold) {
        int high = 1000000;
        int low = 1;
        while(low<=high){
            int mid = low+(high-low)/2;
            if(findDivisor(nums, mid, threshold)) {
                high = mid-1;
            }else {
                low = mid+1;
            }
        }
        return low;
    }
    public static boolean findDivisor(int[] nums, int i, int threshold){
        int ans = 0;
        for (int num : nums){
            ans += Math.ceil((double)num/i);
        }
        return ans<=threshold; 
    }
}
