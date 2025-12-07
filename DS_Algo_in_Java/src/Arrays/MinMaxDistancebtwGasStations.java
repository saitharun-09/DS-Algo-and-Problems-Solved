package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxDistancebtwGasStations {

	public static void main(String[] args) {
		int[] nums = {1,13,17,23};
		int k = 5;
		System.out.println(minimiseMaxDistance(nums,k));
	}

	public static double minimiseMaxDistance(int[] nums, int k) {
		List<Double> list = maximumGap(nums);
		while(k>0) {
			Double max = Collections.max(list);
			int maxIndex = list.indexOf(max);
			list.remove(maxIndex);
			list.add(maxIndex, max/2.0);
			list.add(maxIndex, max/2.0);
			k--;
			
		}
		
		return Collections.max(list);
	}
	public static List<Double> maximumGap(int[] nums) {
		List<Double> list = new ArrayList<>();
		for (int i = 1; i<nums.length; i++) {
			list.add((double) (nums[i]-nums[i-1]));
		}
		return list;
	}
}