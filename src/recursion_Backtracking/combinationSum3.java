package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class combinationSum3 {
    static void main(String[] args) {
        int k = 3;
        int target = 7;
        List<List<Integer>> list = new ArrayList<>();
        combiSum(k, target, list, new ArrayList<>(), 1);
        System.out.println(list);
    }
    public static void combiSum(int k, int target, List<List<Integer>> list, ArrayList<Integer> array, int index) {
        if (target == 0 && array.size() == k) {
            list.add(new ArrayList<>(array));
            return;
        }
        if (index > 9 || target < 0 || array.size() > k) return;
        array.add(index);
        combiSum(k, target-index, list, array, index+1);
        array.remove(array.size()-1);
        combiSum(k, target, list, array, index+1);
    }
}
