package recursion_Backtracking;

public class MinPathSum_Recursion {

	public static void main(String[] args) {
		int[][] grid = {{1,3,1},{1,5,1},{4,2,1}};
		System.out.println(minPath(0, 0, grid));
    }
	private static int minPath(int i, int j, int[][] grid) {
        if (i == grid.length-1 && j == grid[0].length-1) return grid[i][j];
        if (i >= grid.length  || j >= grid[0].length) return 1000000000;
        int down =grid[i][j] + minPath(i+1, j, grid);
        int right =grid[i][j] + minPath(i, j+1, grid);
        return Math.min(down,right);
    }
}
