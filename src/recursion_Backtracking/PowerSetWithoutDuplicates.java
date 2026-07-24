package recursion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PowerSetWithoutDuplicates {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();
        subset(nums, list, 0, new ArrayList<>());
        System.out.println(list);
    }

    public static void subset(int[] nums, List<List<Integer>> list, int index, ArrayList<Integer> array) {
        list.add(new ArrayList<>(array));
        for (int i = index; i<nums.length; i++) {
            if (i > index && nums[i] == nums[i-1]) continue;
            array.add(nums[i]);
            subset(nums,list, i+1, array);
            array.remove(array.size()-1);
        }
    }
}
