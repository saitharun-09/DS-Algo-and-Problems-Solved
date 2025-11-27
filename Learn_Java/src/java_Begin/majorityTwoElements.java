package java_Begin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majorityTwoElements {

	public static void main(String[] args) {
		int[] nums = {3,3,2,2,1};
		majorityElements(nums);
	}
	
	public static List<Integer> majorityElements(int[] nums) {
        List<Integer> array = new ArrayList<>();
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i <nums.length; i++) {
        	hashmap.put(nums[i], hashmap.getOrDefault(nums[i], 0)+1);
        	if (hashmap.getOrDefault(nums[i], 0)>nums.length/3 && !array.contains(nums[i])) {
        		array.add(nums[i]);
        	}
        }
    return array;
    }
}