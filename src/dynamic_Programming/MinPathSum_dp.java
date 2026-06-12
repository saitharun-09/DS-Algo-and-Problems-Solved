package dynamic_Programming;

import java.util.Arrays;

public class MinPathSum_dp {

	public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		int[][] memo = new int[grid.length][grid[0].length];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
		System.out.println(minPath(0, 0, grid, memo));
	}
	
	private static int minPath(int i, int j, int[][] grid, int[][] memo) {
        if (i == grid.length-1 && j == grid[0].length-1) return grid[i][j];
        if (i >= grid.length  || j >= grid[0].length) return 1000000000;
        if (memo[i][j] != -1) return memo[i][j];
        int down =grid[i][j] + minPath(i+1, j, grid, memo);
        int right =grid[i][j] + minPath(i, j+1, grid, memo);
        return  memo[i][j] = Math.min(down,right);
    }
}
