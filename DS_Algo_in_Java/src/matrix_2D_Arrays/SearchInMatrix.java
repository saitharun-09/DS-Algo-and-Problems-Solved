package matrix_2D_Arrays;

import java.util.Arrays;

public class SearchInMatrix {

	public static void main(String[] args) {
		int[][] matrix = {{0,0,0},{0,1,1}};
		System.out.println(Arrays.toString(rowAndMaximumOnes(matrix)));
		System.out.println(rowWithMax1s(matrix));

	}
	// for Un-Sorted rows in Matrix 
	public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] arr = new int[2];
        for (int i = 0; i<mat.length; i++) {
            int count = 0;
            for (int j = 0; j<mat[i].length; j++) {
                count+=mat[i][j];
            }
            if (count>arr[1]) {
                arr[0] = i;
                arr[1] = count;
            }

        }
        return arr;
    }
	
	// For Sorted Rows in Matrix 
	public static int rowWithMax1s(int arr[][]) {
        int max = 0;
        int ans = -1;
        for (int i = 0; i<arr.length; i++) { 
            int low = 0; 
            int high = arr[i].length-1; 
            int count = 0; 
            while(low<=high) { 
                int mid = low+(high-low)/2; 
                if (arr[i][mid]==1){ 
                    count = arr[i].length-mid; 
                    high = mid-1;
                }else { 
                    low = mid+1;
                }
            } 
            if (count>max) { 
                max = count;
                ans = i;    
            }
        } 
        return ans;
    }
}
