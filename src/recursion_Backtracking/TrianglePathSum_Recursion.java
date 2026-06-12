package recursion_Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrianglePathSum_Recursion {

	public static void main(String[] args) {
		List<List<Integer>> triangle = new ArrayList<>();  
		triangle.add(new ArrayList<>(Arrays.asList(2)));
		triangle.add(new ArrayList<>(Arrays.asList(3,4)));
		triangle.add(new ArrayList<>(Arrays.asList(6,5,7)));
		triangle.add(new ArrayList<>(Arrays.asList(4,1,8,3)));
		
		
		System.out.println(minTriangle(0, 0, triangle));
    }
	private static int minTriangle(int i, int j, List<List<Integer>> triangle) {
        if (i == triangle.size()) return 0;
        if (i == triangle.size()-1) return triangle.get(i).get(j);
        int down = triangle.get(i).get(j) + minTriangle(i+1, j, triangle);
        int diagonal = triangle.get(i).get(j) + minTriangle(i+1, j+1, triangle);
        return Math.min(down,diagonal);
    }

}
