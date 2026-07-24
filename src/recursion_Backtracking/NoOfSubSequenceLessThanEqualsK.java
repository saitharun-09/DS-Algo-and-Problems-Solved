package recursion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class NoOfSubSequenceLessThanEqualsK {
    public static void main(String[] args) {
        int[] nums = {14,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14};
        int target = 22;
        System.out.println(subSequenceEqualsSum(nums, target, 0, new ArrayList<Integer>()));
    }

    public static int numSubseq(int[] nums, int target) {
        long sum = 0;
        int MOD = 1000000007;
        Arrays.sort(nums);
        int[] power = new int[nums.length];
        power[0] = 1;
        for (int i = 1; i<nums.length; i++) {
            power[i] = (power[i-1]*2)%MOD;
        }
        int left = 0;
        int right = nums.length-1;
        while (left<=right) {
            if ((nums[left]+nums[right]) <= target) {
                sum += (power[right-left])%MOD;
                left++;
            }else right--;
        }
        return (int)sum;
    }

    // Not at all Optimal but Recursion
    public static int subSequenceEqualsSum(int[] nums, int target, int index, ArrayList<Integer> array) {
        if (index == nums.length) {
            int min = 0;
            int max = 0;
            if (array.size() == 0) return 0;
            min = Collections.min(array);
            max = Collections.max(array);
            if ((min + max) <= target) return 1;
            return 0;
        }
        array.add(nums[index]);
        int pick = subSequenceEqualsSum(nums, target, index + 1, array);
        array.remove(array.size() - 1);
        int notPick = subSequenceEqualsSum(nums, target, index + 1, array);
        return pick + notPick;
    }
}
