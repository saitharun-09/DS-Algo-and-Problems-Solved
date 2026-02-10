package dynamic_Programming;

import java.util.Arrays;

public class UniquePathGrid_dp {

	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		int[][] memo = new int[m][n];
		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}
		// System.out.println(uniquePath(0, 0, m, n, memo));
		
		// dp + Tabulation T.C -> O(m*n) and S.C -> O(m*n) 
		for (int i = 0; i<n; i++) {
			memo[0][i] = 1; 
		}
		for (int i = 0; i<m; i++) {
			memo[i][0] = 1;
		}
		for (int i = 1; i<m; i++) {
			for (int j = 1; j<n; j++) {
				memo[i][j] = memo[i-1][j]+memo[i][j-1];
			}
		}
		System.out.println(memo[m-1][n-1]);
	}

	private static int uniquePath(int i, int j, int m, int n, int[][] memo) {
		if (i == m-1 && j == n-1) return 1;
        if (i > m-1 || j > n-1) return 0;
        if (memo[i][j] != -1) return memo[i][j];
        int one = uniquePath(i+1, j, m, n, memo);
        int two = uniquePath(i, j+1, m, n, memo);
		return memo[i][j] = one + two;
	}

}
