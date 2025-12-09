package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class MinMaxDistancebtwGasStations {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5, 6 ,7, 8, 9, 10};
		int k = 9;
		System.out.println(minimiseMaxDistance(nums,k));
		System.out.println(minimiseMaxDistancePQ(nums, k));
	}
	
	private static double minimiseMaxDistance(int[] nums, int k) {
		double result = Math.pow(10, -6);
		double low = 0;
		double high = 0;
		for (int i = 0; i<nums.length-1; i++) {
			high = Math.max(nums[i+1]-nums[i], high);
		}
		while (high - low > result) {
			double mid = low+(high-low)/2;
			int count = checkPossibleGas(nums,mid);
			if (count<=k) high = mid;
			else low = mid;
		}
		return high;
	}

	private static int checkPossibleGas(int[] nums, double mid) {
		int count = 0;
		for (int i = 0; i<nums.length-1; i++) {
			int gap = nums[i + 1] - nums[i];
            count += (int) Math.floor(gap / mid); 
		}
		return count;
	}
	
	// Priority Queue Answer for TC-> O(klogn+nlogn) and SC -> O(n-1) Better Solution  

	static class Pair {
	    double length;
	    int index;

	    Pair(double length, int index) {
	        this.length = length;
	        this.index = index;
	    }
	}
	
	public static double minimiseMaxDistancePQ(int[] nums, int k) {
		int[] arr = new int[nums.length-1];
		PriorityQueue<Pair> pq = new PriorityQueue<>(
				(a,b)-> Double.compare(b.length, a.length));
				
		
		for (int i = 0; i < nums.length-1; i++) {
			pq.add(new Pair (nums[i+1]-nums[i], i));
		}
		for (int i = 1; i<=k; i++) {
			int initalIndex = pq.peek().index;
			pq.poll();
			arr[initalIndex]++;
			double len = nums[initalIndex+1]-nums[initalIndex];
			pq.add(new Pair (len/(arr[initalIndex] + 1.0),initalIndex));
		}
		
		return pq.peek().length;
	}
	
	// Still O(k*n) but Efficient
	/*
	public static double minimiseMaxDistance(int[] nums, int k) {
		int[] arr = new int[nums.length-1];
		for (int i = 1; i<=k; i++) {
			int index = -1;
			double maxLen = -1;
			for (int j = 0; j<nums.length-1; j++) {
				double diff = nums[j+1]-nums[j];
				double length = diff/(double)(arr[j]+1.0);
				if (length>maxLen) {
					maxLen = length;
					index = j;
				}
			}
			arr[index]++;
		}
		double ans = -1;
		for (int i = 0; i<nums.length-1; i++) {
			int diff = nums[i+1]-nums[i];
			double maxLen = diff/(arr[i]+1.0);
			ans = Math.max(ans, maxLen);
		}
		return ans;
	}
	*/
	// Easy with TC O(k*n) but, Not Efficient 
	/*
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
	*/
}