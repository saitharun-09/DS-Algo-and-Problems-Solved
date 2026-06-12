package matrix_2D_Arrays;

public class FindMedianInMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static int median(int[][] mat) {
        int i = 0;
        int low = Integer.MAX_VALUE;
        int high = Integer.MIN_VALUE;
        while(i<mat.length) {
            low = Math.min(low,mat[i][0]);
            high = Math.max(high,mat[i][mat[i].length-1]);
            i++;
        }
        int midPos = ((mat.length*mat[0].length)+1)/2;
        while(low<=high) {
            int mid = low+(high-low)/2;
            int num = upperBound(mat,mid);
            if (num<midPos) {
                low = mid+1;
            }else {
                high = mid-1;
            }
        }
        return low;   
    }
    public static int upperBound(int[][] mat, int x) {
        int count = 0;
        for (int i = 0; i<mat.length; i++) {
            int low = 0;
            int high = mat[i].length-1;
            while(low<=high) {
                int mid = low+(high-low)/2;
                if (mat[i][mid]<=x) {
                    low = mid+1;
                }else {
                    high = mid-1;
                }
            }
            count+=low;
        }
        return count;
    }
}
