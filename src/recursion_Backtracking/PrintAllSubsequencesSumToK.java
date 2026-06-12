package recursion_Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequencesSumToK {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		int sum = 0;
		List<List<Integer>> lists = new ArrayList<>();
		subSequenceSumk(nums, 0, new ArrayList<>(), lists, sum);
		System.out.println(lists);
	}
/*
	private static void subSequenceSumk(int[] nums, int i, List<Integer> list, List<List<Integer>> lists, int sum) {
		if (i==nums.length) {
			if (sum==3) lists.add(new ArrayList<>(list));
			return;
		}
		sum += nums[i];
		list.add(nums[i]);
		subSequenceSumk(nums, i+1, list, lists, sum);
		list.remove(list.size()-1);
		sum-=nums[i];
		subSequenceSumk(nums, i+1, list, lists, sum);
	}
*/
	// To print only 1st subsequence using boolean return type
	private static boolean subSequenceSumk(int[] nums, int i, List<Integer> list, List<List<Integer>> lists, int sum) {
		if (i==nums.length) {
			if (sum==3) {
				lists.add(new ArrayList<>(list));
				return true;
			}else return false;
		}
		sum += nums[i];
		list.add(nums[i]);
		if (subSequenceSumk(nums, i+1, list, lists, sum)) return true;
		list.remove(list.size()-1);
		sum-=nums[i];
		if (subSequenceSumk(nums, i+1, list, lists, sum)) return true;
		return false;
	}	
	
}