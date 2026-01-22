package strings;

import java.util.HashSet;

public class SmallestMissingIntGreaterThanPrefixSum {

	public static void main(String[] args) {
		int[] nums = {3,4,5,1,12,14,13};
		System.out.println(missingInteger(nums));
	}
	
	public static int missingInteger(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        int prefixSum = nums[0];
        for(int i = 1; i<nums.length; i++) {
            if (nums[i]==nums[i-1]+1) {
                prefixSum += nums[i];
            }else {
               break;
            }
        }
        while(set.contains(prefixSum)) {
            prefixSum++;
        }
        return prefixSum;
    }
}
