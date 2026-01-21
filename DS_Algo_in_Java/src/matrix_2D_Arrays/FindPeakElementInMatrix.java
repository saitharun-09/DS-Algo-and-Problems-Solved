package matrix_2D_Arrays;

import java.util.Arrays;

public class FindPeakElementInMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{10,20,15},{21,30,14},{7,16,32}};
		System.out.println(Arrays.toString(findPeakGrid(matrix)));
	}
	
	// Optimal Solution
	public static int[] findPeakGrid(int[][] mat) {
        if (mat.length == 1 && mat[0].length==1) return new int[] {0,0};
        int n = mat.length;
        int m = mat[0].length;
        if (mat[0][0]>mat[0][1] && mat[0][0]>mat[1][0]) return new int[]{0,0};
        if (mat[0][m-1]>mat[0][m-2] && mat[0][m-1]>mat[1][m-1]) return new int[]{0,m-1};
        if (mat[n-1][0]>mat[n-1][1] && mat[n-1][0]>mat[n-2][0]) return new int[]{n-1,0};
	    if (mat[n-1][m-1]>mat[n-1][m-2] && mat[n-1][m-1]>mat[n-2][m-1]) return new int[]{n-1,m-1};
	    int low = 0; 
	    int high = mat.length-1;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int maxEle = findMax(mat, mid);
            int top = mid-1>=0 ? mat[mid-1][maxEle] : -1;
            int bottom = mid+1<=mat.length-1 ? mat[mid+1][maxEle] : -1;
            if (mat[mid][maxEle]>top && mat[mid][maxEle]>bottom) return new int[]{mid,maxEle};
            else if (mat[mid][maxEle]<top) {
                high = mid-1;
            }else low = mid+1;
        }
    return new int[]{0,0};
    }

    public static int findMax(int[][] mat, int row) {
        int max = -1;
        int idx = -1;
        for (int i = 0; i<mat[row].length; i++) {
            if (mat[row][i]>max) {
                max = mat[row][i];
                idx = i;
            }
        }
        return idx;
    }
}