package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PowerSet_Subset {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        List<List<Integer>> list = new ArrayList<>();
        generateSubset(nums, list, 0, new ArrayList<>());
        System.out.println(list);
    }


    // Using Recursion T.C and S.C -> O(2^N * N)
    public static void generateSubset(int[] nums, List<List<Integer>> list, int index, ArrayList<Integer> array) {
        if (index == nums.length) {
            list.add(new ArrayList<>(array));
            return;
        }
        array.add(nums[index]);
        generateSubset(nums, list, index+1, array);
        array.remove(array.size()-1);
        generateSubset(nums, list, index+1, array);
        return;
    }
}
