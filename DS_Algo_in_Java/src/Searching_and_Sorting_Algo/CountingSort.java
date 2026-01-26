package Searching_and_Sorting_Algo;

import java.util.Arrays;

public class CountingSort {

	public static void main(String[] args) {
		int[] nums = {0,8,9,4,5,6,-3,2,4,7,5,-1,3};
		System.out.println(Arrays.toString(countingSort(nums)));
	}
	
	public static int[] countingSort(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i : nums) {
            min = Math.min(min,i);
            max = Math.max(max,i);
        }
        int[] count = new int[(max-min)+1];
        for (int i = 0; i<nums.length; i++) {
        	count[nums[i]-min]++; // add minimum value to all number to negate negative values
        }
        for (int i = 1; i<count.length; i++) {
        	count[i] += count[i-1]; // prefix sum to find the index of values 
        }
        int[] ans = new int[nums.length];
        for (int i = nums.length-1; i>=0; i--) {
        	ans[count[nums[i]-min]-1] = nums[i]; 
        	count[nums[i]-min]--;
        }
        return ans;
    }
}
