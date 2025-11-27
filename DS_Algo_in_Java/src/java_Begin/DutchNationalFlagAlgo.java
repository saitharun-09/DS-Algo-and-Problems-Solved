package java_Begin;

public class DutchNationalFlagAlgo {

	public static void main(String[] args) {
		int[] nums = {2,0,2,1,1,0};
		dutchNationalFlag((nums));
		for (int i : nums) {
			System.out.print(i+", ");
		}
	}
	 
	// Best for in-place sorting of 0s, 1s & 2s - Take O(n) & O(1)
	
	public static void dutchNationalFlag(int[] nums) {
		int low = 0;
		int mid = low;
		int high = nums.length-1;
		while(mid<=high) {
			if (nums[mid]==0) {
				int temp = nums[low];
				nums[low] = nums[mid];
				nums[mid] = temp;
				low++;
				mid++;
			}else if (nums[mid]==2) {
				int temp = nums[high];
				nums[high] = nums[mid];
				nums[mid] = temp;
				high--;
			}else {
				mid++;
			}
		}
	}
}