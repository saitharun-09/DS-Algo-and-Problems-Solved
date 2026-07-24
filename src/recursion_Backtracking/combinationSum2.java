package recursion_Backtracking;

import java.util.*;

public class combinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {10, 1, 2, 7, 6, 1, 5};
        Arrays.sort(candidates);
        int target = 8;
        Set<List<Integer>> list = new HashSet<>();
        combiSum2(candidates, target, list, 0, new ArrayList<>());
        System.out.println(list);
    }

    public static void combiSum2(int[] candidates, int target, Set<List<Integer>> list, int index, ArrayList<Integer> array) {
        if (target == 0) {
            list.add(new ArrayList<>(array));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) continue;
            if (target < candidates[i]) break;
            array.add(candidates[i]);
            combiSum2(candidates, target - candidates[i], list, i + 1, array);
            array.remove(array.size() - 1);
        }
    }

    /*
    // Sort + Pick n Not Pick Recursion for all indexs T.C - Massive
    public static void combiSum2(int[] candidates, int target, Set<List<Integer>> list, int index, ArrayList<Integer> array) {
        if (index == candidates.length) {
            if (target == 0) list.add(new ArrayList<>(array));
            return;
        }
        array.add(candidates[index]);
        if (target > 0) combiSum2(candidates, target - candidates[index], list, index + 1, array);
        array.remove(array.size() - 1);
        combiSum2(candidates, target, list, index + 1, array);
    }

     */
}