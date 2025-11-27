package java_Begin;

public class longestSubArrayEqualsToSum {
	// Longest consequtive subArray which sum equals to k

	public static void main(String[] args) {
		int[] array = {2, 3, 1, 1, 1, 1, 1};
		int k=3;
		System.out.println(longestSubArrayEqualToSum(array,k));
	}
	
	
	// optimal Best case for Positive only Array (2 pointer technique)
	public static int longestSubArrayEqualToSum(int[] array, int k) {
		int i = 0;
		int j = 0;
		int res = 0;
		int sum = 0;
	//	int num = 0; To Find No, of subArrays sum Equal to k
		while (j<array.length) {
			sum+=array[j];
			if (sum==k) {
			    res = Math.max(res, (j - i + 1));
			 //   num++;
			}
			while (sum > k && i <= j) {
				sum-=array[i];
				i++;
				if (sum==k) {
					res = Math.max(res, (j-i)+1);
				//	num++;
				}
			}
			j++;
		}
		return res; 
	}
	
	/*
	// optimal for both neg and positive elements
	public static int longestSubArrayEqualToSum(int[] array, int k) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		int sum = 0;
		int res = 0;
		for (int i = 0; i<array.length; i++) {
			sum+=array[i];
			if (sum==k) {
				res = i+1;
			}
			if (hashMap.containsKey(sum-k)) {
				int len = i-hashMap.get(sum-k);
				res = Math.max(res, len);
			}
			if (!hashMap.containsKey(sum)) { 
				hashMap.put(sum, i);
			}
		}
		return res;
	}
	// brute
	/*
	
	public static int longestSubArrayEqualToSum(int[] array, int k) {
		int res = 0;
		for (int i = 0; i<array.length; i++) {
			int sum = 0;
			for (int j = i; j<array.length; j++) {
				sum=sum+array[j];
				if (sum==k) {
					res = Math.max(res, (j-i)+1);
					}
			}
		}
		return res;
	}
	*/
}