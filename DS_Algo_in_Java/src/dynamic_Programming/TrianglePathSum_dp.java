package dynamic_Programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrianglePathSum_dp {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();  
		triangle.add(new ArrayList<>(Arrays.asList(2)));
		triangle.add(new ArrayList<>(Arrays.asList(3,4)));
		triangle.add(new ArrayList<>(Arrays.asList(6,5,7)));
		triangle.add(new ArrayList<>(Arrays.asList(4,1,8,3)));
		
		int[][] memo = new int[triangle.size()][triangle.size()];
        for (int[] row : memo) {
            Arrays.fill(row, Integer.MIN_VALUE);
        }
		System.out.println(minTriangle(0, 0, triangle, memo));
    }
	
	// Recursion + Memoization T.C -> O(n^2) and S.C -> O(n^2) 
	private static int minTriangle(int i, int j, List<List<Integer>> triangle, int[][] memo) {
        if (i == triangle.size()) return 0;
        if (i == triangle.size()-1) return triangle.get(i).get(j);
        if (memo[i][j] != Integer.MIN_VALUE) return memo[i][j];
        int down = triangle.get(i).get(j) + minTriangle(i+1, j, triangle, memo);
        int diagonal = triangle.get(i).get(j) + minTriangle(i+1, j+1, triangle, memo);
        return memo[i][j] = Math.min(down,diagonal);
    }

}
