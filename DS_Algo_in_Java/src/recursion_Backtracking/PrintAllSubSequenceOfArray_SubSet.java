package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubSequenceOfArray_SubSet {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		List<List<Integer>> lists = new ArrayList<>();
		printSubsequence(nums, 0, new ArrayList<>(), lists);
		System.out.println(lists);
	}
	
	// T.C -> O(2^n) for all 2 recursion calls per element and 
	private static void printSubsequence(int[] nums, int i, List<Integer> list, List<List<Integer>> lists) {
		if (i >= nums.length) {
			lists.add(new ArrayList<>(list));
			return;
		}
		list.add(nums[i]);
		printSubsequence(nums, i+1, list, lists);
		list.remove(list.size()-1);
		printSubsequence(nums, i+1, list, lists);
	}
}
