package java_Begin;

import java.util.Arrays;

public class ZerosAtTheEnd {

	public static void main(String[] args) {
		int[] nums = {1,5,0,7,9,0,4,0,3,0,2};
		moveZeroes(nums);
		System.out.println(Arrays.toString(nums));
	}
	
    public static void moveZeroes(int[] nums) {
    	int j = -1;
    	for (int i = 0; i<nums.length; i++) {	  
    		if (nums[i]==0) {
    			j = i;
    			break;
    		}
    	}
    	for (int i = j; i<nums.length; i++) {
    		if (nums[i]!=0) {
    			int temp = nums[j];
    			nums[j] = nums[i];
    			nums[i] = temp;
    			j++;
    		}
    	}
	}
}