package dynamic_Programming;

import java.util.Arrays;

public class UniquePaths_II_dp {

	public static void main(String[] args) {
		int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
		int[][] memo = new int[grid.length][grid[0].length];
		for (int[] row : memo) {
			Arrays.fill(row, -1);
		}
		System.out.println(uniquePaths(0, 0, grid, memo));

	}

	// Recursion + Memoiazation with T.C -> O(m+n) and S.C -> O(m+n)
	private static int uniquePaths(int i, int j, int[][] grid, int[][] memo) {
		if (i == grid.length-1 && j == grid[0].length-1) return 1;
		if (i >= grid.length || j >= grid.length) return 0;
		if (grid[i][j] == 1) return 0;
		if (memo[i][j] != -1) return memo[i][j];
		int up = uniquePaths(i+1, j, grid, memo);
		int down = uniquePaths(i, j+1, grid, memo);
		return memo[i][j] =  down + up;
	}

}
