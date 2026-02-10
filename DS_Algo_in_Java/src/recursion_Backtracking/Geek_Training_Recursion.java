package recursion_Backtracking;

public class Geek_Training_Recursion {

	public static void main(String[] args) {
		int[][] mat = {{1,2,5},{3,1,1},{3,3,3}};
		System.out.println(geek(mat, 0, 3, 0));
	}
	
	// Pure Recursion with O(3^n) and S.C-> O(n) + recursion calls
	private static int geek(int[][] mat, int day, int i , int total) {
		if (mat.length==1) {
	        int max = 0;
	        for (int num : mat[0]) {
	            max = Math.max(num,max);
	        }
	        return max;
	    }
		return maxPoints(mat, 0, 3);
	}
	private static int maxPoints(int[][] mat, int day, int i) {
		if (day==mat.length) return 0;
        int max = 0;
            for (int j = 0; j<3; j++) {
                if (j==i) continue;
                int sum = mat[day][j] + maxPoints(mat, day+1, j);
                max = Math.max(max, sum);
            }
        return max;
	}

}
