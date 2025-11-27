package java_Begin;

public class maxConsecutive1s {

	public static void main(String[] args) {
		int[] arr = {1,0,1,1,1,1,0,1,1};
		System.out.println(maxConsecutiveOnes(arr));
	}
	
	public static int maxConsecutiveOnes(int[] arr) {
	    int max = 0;
	    int count = 0;
	    for(int i = 0; i<arr.length; i++) {
	    	if (arr[i]==1) {
	    		count++;
	    		max = Math.max(max, count);
	    	}else {
	    		count = 0;
	    	}
	    }
		return max;
	}
}

