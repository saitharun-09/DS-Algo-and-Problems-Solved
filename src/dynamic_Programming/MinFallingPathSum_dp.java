package dynamic_Programming;

import java.util.Arrays;

public class MinFallingPathSum_dp {

	public static void main(String[] args) {
		int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
		int m = matrix.length;
		int n = matrix[0].length;
		int min = 1000000000;
		
		int[][] memo = new int[m][n];
		for (int[] row : memo) {
			Arrays.fill(row, Integer.MAX_VALUE);
		}   
		
		for (int idx = 0; idx< n; idx++) {
			int sum = minSumPath(0, idx, m, n, matrix, memo);
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}
	
	// Recursion + Memoization T.C -> O(m*n) and S.C -> O(m*n)
	private static int minSumPath(int i, int j, int m, int n, int[][] matrix, int[][] memo) {
		if (j < 0 || j >= n) return 1000000000;
		if (i == m-1) return matrix[i][j];
		if (memo[i][j] != Integer.MAX_VALUE) return memo[i][j];
		int first = matrix[i][j] + minSumPath(i+1, j-1, m, n, matrix, memo);
		int second = matrix[i][j] + minSumPath(i+1, j, m, n, matrix, memo);
		int third = matrix[i][j] + minSumPath(i+1, j+1, m, n, matrix, memo);
		return memo[i][j] = Math.min(first,Math.min(second,third));
	}
}
