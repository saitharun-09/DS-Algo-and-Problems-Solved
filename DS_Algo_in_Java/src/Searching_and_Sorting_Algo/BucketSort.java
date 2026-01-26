package Searching_and_Sorting_Algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

	public static void main(String[] args) {
		int nums[] = { 170, 45, 75, 90, 802, 24, 2, 66 };
		float[] arr = {0.897f, 0.565f, 0.656f, 0.1234f, 0.665f, 0.3434f};
		System.out.println(Arrays.toString(bucketSort(nums)));
		System.out.println(Arrays.toString(bucketSort(arr)));

	}

	private static long[] bucketSort(float[] arr) {
		
		return null;
	}

	public static int[] bucketSort(int[] nums) {
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i<nums.length; i++) {
			max = Math.max(max, nums[i]);
			min = Math.min(min, nums[i]);
		}
		int buckets = nums.length;
		int range = (max-min)+1;
		int[] ans = new int[nums.length];
		List<List<Integer>> bucketList = new ArrayList<>(buckets);
		for (int i = 0; i<buckets; i++) {
			bucketList.add(new ArrayList<>());
		}
		for (int num : nums) {
			int bucketIdx = (int)((long)(num - min) * buckets / range);
			bucketList.get(bucketIdx).add(num);
		}
		int idx = 0;
		for (List<Integer> bucket : bucketList) {
			Collections.sort(bucket);
			for (int value : bucket) {
				ans[idx++] = value;
			}
		}
		return ans;
	}
}
