package java_Begin;

import java.util.HashMap;

public class CountSubarraysEqualToSum {

	public static void main(String[] args) {
		int[] nums = {4,2,2,6,4};
		int key = 6;
		System.out.println(countSubArraysEqualToSum(nums, key));
		System.out.println(countSubArraysEqualToSumXOR(nums, key));
	}

	public static int countSubArraysEqualToSumXOR(int[] nums, int key) {
		int sum = 0;
		int count = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		for (int i = 0; i<nums.length; i++) {
				sum^=nums[i];
				if (hashMap.containsKey(sum^key)){
					count+=hashMap.get(sum^key);
				}
				hashMap.put(sum, hashMap.getOrDefault(sum, 0)+1);
		}
		return count;
	}
	
	public static int countSubArraysEqualToSum(int[] nums, int key) {
		int count = 0;
		int sum = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		hashMap.put(0, 1);
		for (int i = 0; i<nums.length; i++) {
			sum+=nums[i];
			if (hashMap.containsKey(sum-key)) {
				count+=hashMap.get(sum-key);
			}
			hashMap.put(sum, hashMap.getOrDefault(sum, 0)+1);
		}
		return count;
		
	}
}
