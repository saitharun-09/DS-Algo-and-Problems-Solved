package greedy_Algo;

public class LongestAlternatingSubSequence {

	public static void main(String[] args) {
		int[] arr = { 10, 22, 9, 33, 49, 50, 31, 60 };
        int n = arr.length;
        System.out.println(alternatingSubSequence(arr, n));
	}

	
	// Length of Alternating SubSequence with Greedy Algo T.C -> O(n) and S.C -> O(1)
	private static int alternatingSubSequence(int[] arr, int n) {
		int inc = 1;
		int dec = 1;
		int sum = 0;
		int prev = arr[0];
		for (int i = 1; i<n; i++) {
			if (arr[i]>prev) {
				inc = dec +1;
				sum+=prev;
			}else if (arr[i]<prev) {
				dec = inc+1;
				sum+=prev;
			}
			prev = arr[i];
		}
		return sum;
	}
}