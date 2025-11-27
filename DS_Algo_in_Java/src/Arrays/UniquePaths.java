package Arrays;

public class UniquePaths {

	public static void main(String[] args) {
		int m = 7;
		int n = 3;
		System.out.println(uniquePath(m,n));
	}

	
	// nCr Problem (combinations)
	public static int uniquePath(int m, int n) {
		int N = m+n-2;
        int R = m-1;
        long result = 1;
        for (int i = 1; i<=R; i++){
            result = result * (N - R + i) / i;
        }
        return (int)result;
	}
	
	/*
    public static int uniquePath(int m, int n) {
	    int[][] dpHashTable = new int[m][n];
	    for (int i = 0; i <m; i++) {
	    	for (int j = 0; j<n; j++){
	        	dpHashTable[i][j] = -1;
	    	}
	    }
        int count = recursivePaths(0, 0, m, n, dpHashTable);
        return count;
    }
	    
	public static int recursivePaths(int i, int j, int m, int n, int[][] dpHashTable){
        if (i>=m || j>=n) return 0;
        if (i==(m-1) && j==(n-1)) return 1;
        if (dpHashTable[i][j]!=-1) return dpHashTable[i][j];
        return dpHashTable[i][j] = recursivePaths(i+1, j, m, n, dpHashTable)
        							+recursivePaths(i, j+1, m, n, dpHashTable);   
	}
	*/
	
	/*
	public static int uniquePath(int m, int n) {
        int i = 0;
        int j = 0;
        int count = recursivePaths(i, j, m, n, dpHashTable);
        return count;
    }
	    
	public static int recursivePaths(int i, int j, int m, int n){
        if (i>=m || j>=n) return 0;
        if (i==(m-1) && j==(n-1)) return 1;
        return recursivePaths(i+1, j, m, n) + recursivePaths(i, j+1, m, n);   
	}
	*/
	
}