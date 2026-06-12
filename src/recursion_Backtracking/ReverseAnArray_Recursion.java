package recursion_Backtracking;

import java.util.Arrays;

public class ReverseAnArray_Recursion {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		System.out.println(Arrays.toString(reverseArray(arr,0)));
	}
	
	// using a single Variable and T.C -> O(n/2)
	private static int[] reverseArray(int[] arr, int l) {
		if (l>arr.length/2) return arr;
		int temp = arr[l];
		arr[l] = arr[arr.length-l-1];
		arr[arr.length-l-1] = temp;
		return reverseArray(arr, l+1);
	}
	
	// Using 2 variables 
	private static int[] reverseArray(int[] arr, int l, int r) {
		if (l>=r) return arr;
		int temp = arr[l];
		arr[l] = arr[r];
		arr[r] = temp;
		reverseArray(arr, l+1, r-1);
		return arr;
	}
	
}
