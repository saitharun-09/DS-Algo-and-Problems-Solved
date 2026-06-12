package Arrays;

import java.util.Arrays;

public class AgressiveCows {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7};
		int cows = 3;
		System.out.println(aggressiveCows(arr, cows));
	}

	public static int aggressiveCows(int[] arr, int cows) {
		Arrays.sort(arr);
		int low = 1;
		int high = arr[arr.length-1]-arr[0];
		int ans = 0;
		while(low<=high) {
			int mid = low+(high-low)/2;
			boolean flag = calculateDistance(arr,cows,mid);
			if (flag) low = mid+1;
			else high = mid-1;
		}
		return high;
	}
	public static boolean calculateDistance(int[] arr, int cows, int gap) {
		int cowCount = cows-1;
		int lastCow = 0;
		for (int i = 1; i<arr.length; i++) {
			if (arr[i]-arr[lastCow]>=gap) {
				if (cowCount<=0) break;
				cowCount--;
				lastCow = i;
			} 
		}
		return cowCount==0;
	}
}
