package Arrays;

public class SqRootOfNum {

	public static void main(String[] args) {
		int n = 650;
		System.out.println(findSquRoot(n));
	}
	
	public static int findSquRoot(int n) {
		int low = 0;
	    int high = (n/2)+1;
	    int ans = 0;
	    while (low<=high){
	    	int mid = low+(high-low)/2;
	        long i = (long)mid*mid;
	        if (i==n) return mid;
	        if (i<n){
	            ans = mid;
	            low = mid+1;
	        }else {
	        	high = mid-1;
	        }        
	      }
	      return ans;
	}
}