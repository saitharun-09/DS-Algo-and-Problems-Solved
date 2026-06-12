package matrix_2D_Arrays;

public class SearchInMatrix2 {

	public static void main(String[] args) {
		int[][]matrix = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
		int target = 5;
		System.out.println(searchMatrix(matrix, target));
		
	}
	
	//Optimal O(m+n) T.C
	public static boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length-1;
        while(row<matrix.length && column>=0) {
            if (matrix[row][column]==target) return true;
            else if (matrix[row][column]>target) column--;
            else row++;
        }
        return false; 
    }
/*
	// better solution than Linear search 
	public static boolean searchMatrix(int[][] matrix, int target) {
	       for (int i = 0; i<matrix.length; i++){
	            if (target>=matrix[i][0] && target<=matrix[i][matrix[i].length-1]) {
	                int low = 0;
	                int high = matrix[i].length-1;
	                while (low<=high) {
	                    int mid = low+(high-low)/2;
	                    if (target==matrix[i][mid]) return true;
	                    else if (target<matrix[i][mid]) high = mid-1;
	                    else low = mid+1;
	                }
	            }else continue;
	        }
	        return false; 
	    }
 	*/
}
