package Searching_and_Sorting_Algo;

import java.util.Arrays;

public class RadixSort {

	public static void main(String[] args) {
		int nums[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		System.out.println(Arrays.toString(radixSort(nums)));
	}

	public static int[] radixSort(int[] nums) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<nums.length; i++) {
			max = Math.max(max, nums[i]);
		}
		int[] ans = new int[nums.length];
		for (int p = 1; max/p>0; p*=10) {
			int[] count = new int[10];
			for (int i = 0; i<nums.length; i++) {
				count[(nums[i]/p)%10]++;
			}
			for (int i = 1; i<count.length; i++) {
				count[i] += count[i-1];
			}
			for (int i = nums.length-1; i>=0; i--) {
				ans[count[(nums[i]/p)%10]-1] = nums[i];
				count[(nums[i]/p)%10]--;
			}
			for(int i = 0; i<nums.length; i++) {
				nums[i] = ans[i];
			}
		}
		return ans;
	}
}
