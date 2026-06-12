package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoThreeFourSum {

	public static void main(String[] args) {
		int[] nums = {-1,0,1,2,-1,-4};
		threeSum(nums);
	}
	
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
		Arrays.sort(nums);
		int k = nums.length-1;
		for (int i = 0; i<nums.length-1; i++) {
			if (i>0 && nums[i]==nums[i-1]) continue; 
			int j = i+1;
			while(j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				if (sum==0) {
					list.add(Arrays.asList(nums[i], nums[j], nums[k]));
					j++;
					k--;
					while(j<k && nums[k]==nums[k-1]) k--;
					while(j<k && nums[j]==nums[j+1]) j++;
				}else if (sum<0) {
					j++;
				}else {
					k--;
				}
			}
		}
		return list;
	}
	
	
	/*
	public static List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> list = new ArrayList<>();
        for(int i = 0; i<nums.length-1; i++) {
            HashSet<Integer> hashset = new HashSet<>();
            for(int j = i+1; j<nums.length; j++) {
            	int x = -(-nums[i]+(-nums[j]));
                if (hashset.contains(x)) {
                	ArrayList<Integer> array = new ArrayList<>();
                	array.add(nums[i]);
                	array.add(nums[j]);
                	array.add(x);
                	Collections.sort(array);
                	if (!list.contains(array)) list.add(array);
                }else {
                	hashset.add(nums[j]);
                }
            }
        }
        return list;
	}
	*/
}