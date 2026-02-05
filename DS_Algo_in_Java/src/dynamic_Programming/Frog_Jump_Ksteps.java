package dynamic_Programming;

import java.util.Arrays;

public class Frog_Jump_Ksteps {

	public static void main(String[] args) {
		int[] arr = {7, 4, 8, 2, 9, 1};
		int	k = 3;  	// Output = 6
		int[] memo = new int[arr.length];
		Arrays.fill(memo, -1);
		System.out.println(frogJumpK(arr, k, 0, memo));
	}

	private static int frogJumpK(int[] arr, int k, int i, int[] memo) {
		if (i==arr.length-1) return 0;
		if (memo[i]!=-1) return memo[i];
		int min = Integer.MAX_VALUE;
		for (int j = 1; j<=k; j++) {
			if(i+j<arr.length) {
				int one = frogJumpK(arr, k, i+j, memo) + Math.abs(arr[i+j]-arr[i]);
				min = Math.min(min, one);
			}
		}
		memo[i] = min;
		return min;		
	}

} 