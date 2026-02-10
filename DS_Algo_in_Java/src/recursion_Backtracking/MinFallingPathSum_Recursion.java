package recursion_Backtracking;

public class MinFallingPathSum_Recursion {

	public static void main(String[] args) {
		int[][] matrix = {{2,1,3},{6,5,4},{7,8,9}};
		int m = matrix.length;
		int n = matrix[0].length;
		int min = 1000000000;     
		for (int idx = 0; idx< n; idx++) {
			int sum = minSumPath(0, idx, m, n, matrix);
			min = Math.min(min, sum);
		}
		System.out.println(min);
	}
	
	// Pure Recursion of T.C -> O(2^m+n) and S.C -> O(2^m+n) + recursion calls
	private static int minSumPath(int i, int j, int m, int n, int[][] matrix) {
		if (j < 0 || j >= n) return 1000000000;
		if (i == m-1) return matrix[i][j];
		int first = matrix[i][j] + minSumPath(i+1, j-1, m, n, matrix);
		int second = matrix[i][j] + minSumPath(i+1, j, m, n, matrix);
		int third = matrix[i][j] + minSumPath(i+1, j+1, m, n, matrix);
		return Math.min(first,Math.min(second,third));
	}
}
