package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum1 {
    public static void main(String[] args) {
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> list = new ArrayList<>();
        combiSum(candidates, target, list, 0, new ArrayList<>());
        System.out.println(list);
    }

    public static void combiSum(int[] candidates, int target, List<List<Integer>> list, int index, ArrayList<Integer> array) {
        if (index == candidates.length) {
            if (target == 0) list.add(new ArrayList<>(array));
            return;
        }
        array.add(candidates[index]);
        if (target > 0) combiSum(candidates, target - candidates[index], list, index, array);
        array.remove(array.size()-1);
        combiSum(candidates, target, list, index + 1, array);
    }
}
