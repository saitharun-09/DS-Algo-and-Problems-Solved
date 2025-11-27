package java_Begin;

import java.util.ArrayList;

public class MaxReminderByModk {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		int k=7;
		System.out.println(highestSumModulu(arr,k));
	}
	public static int highestSumModulu(int[] arr, int k) {
		int result = 0;
		ArrayList<Integer> evens = new ArrayList<>();
		ArrayList<Integer> odds = new ArrayList<>();
		for(int i = 0; i<arr.length; i++) {
			if (arr[i]%2==0) evens.add(arr[i]);
			else odds.add(arr[i]);
		}
		for (int i = 0; i<evens.size(); i++) {
			for (int j = 0; j<odds.size(); j++) {
				int r = (evens.get(i)+odds.get(j))%k;
				if (r>result) {
					result = r;
				}
			}
		}
		return result;
	}
}