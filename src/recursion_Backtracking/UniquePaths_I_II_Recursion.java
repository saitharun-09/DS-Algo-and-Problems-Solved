package recursion_Backtracking;

public class UniquePaths_I_II_Recursion {

	public static void main(String[] args) {
		int m = 3;
		int n = 7;
		int[][] grid = {{0,0,0},{0,1,0},{0,0,0}};
		//System.out.println(grids(0, 0, m, n));
		
        System.out.println(uniquePaths_II(0, 0, grid));
	}
	
	// unique Paths 2 grid with pure Recursion T.C -> O(2^n+m) and S.C -> O(n+m) + recursion calls
	private static int uniquePaths_II(int i, int j, int[][] grid) {
		int m = grid.length;
		int n = grid[0].length;
		if (grid[0][0] == 1 || grid[m-1][n-1] == 1) return 0;
		return grids(0, 0, m, n, grid);
	}
	private static int grids(int i, int j, int m, int n, int[][] grid) {
		if (i > m-1 || j > n-1) return 0;
		if (grid[i][j] == 1) return 0;
		if (i == m-1 && j == n-1) return 1;
	        int one = grids(i+1, j, m, n, grid);
	        int two = grids(i, j+1, m, n, grid);
	        return one + two;
	}

	
	// Recursion T.C -> O(2^n+m) and S.C -> O(n*m) + recursion calls
	private static int grids(int i, int j, int m, int n) {
		 if (i == m-1 && j == n-1) return 1;
	        if (i > m-1 || j > n-1) return 0;
	        int one = grids(i+1, j, m, n);
	        int two = grids(i, j+1, m, n);
	        return one + two;
	}

}