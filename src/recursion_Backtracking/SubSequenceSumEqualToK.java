package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class SubSequenceSumEqualToK {
    public static void main(String[] args) {
        int sum = 2;
        int[] nums = {1,2,1};
        List<List<Integer>> list = new ArrayList<>();
        subSequenceEqualsSum(nums, sum, list, 0, new ArrayList<>(), 0);
        System.out.println(list);
    }

    public static void subSequenceEqualsSum(int[] nums, int sum, List<List<Integer>> list, int index, ArrayList<Integer> array, int currSum) {
        if (index == nums.length) {
            if ( currSum == sum ) list.add(new ArrayList<>(array));
            return;
        }
        if ( currSum == sum ) {
            list.add(new ArrayList<>(array));
            return;
        }
        currSum += nums[index];
        array.add(nums[index]);
        subSequenceEqualsSum(nums, sum, list, index+1, array, currSum);
        currSum -= nums[index];
        array.remove(array.size()-1);
        subSequenceEqualsSum(nums, sum, list, index+1, array, currSum);
        return;
    }
}
