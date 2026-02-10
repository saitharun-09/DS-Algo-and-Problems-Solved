package dynamic_Programming;

import java.util.Arrays;

public class Ninja_Training_dp {

	public static void main(String[] args) {
		int[][] mat = {{1,2,5},{3,1,1},{3,3,3}};
		System.out.println(ninja(mat, 0, 3, 0));
	}
	
	// Recursion + Memoization with O(4n) and S.C-> O(4n) both equivalent to O(n)
	private static int ninja(int[][] mat, int day, int i , int total) {
		if (mat.length==1) {
	        int max = 0;
	        for (int num : mat[0]) {
	            max = Math.max(num,max);
	        }
	        return max;
	    }
		int[][] memo = new int[mat.length][4];
		for ( int[] arr : memo) {
			Arrays.fill(arr, -1);
		}
		return maxPoints(mat, 0, 3, memo);
	}
	private static int maxPoints(int[][] mat, int day, int last, int[][] memo) {
		if (day==mat.length) return 0;
		if (memo[day][last] != -1) return memo[day][last];
        int max = 0;
            for (int i = 0; i<3; i++) {
                if (i==last) continue;
                int sum = mat[day][i] + maxPoints(mat, day+1, i, memo);
                max = Math.max(max, sum);
            }
        return memo[day][last] = max;
	}
}
