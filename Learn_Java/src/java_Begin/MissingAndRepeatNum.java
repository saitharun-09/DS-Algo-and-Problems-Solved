package java_Begin;

public class MissingAndRepeatNum {

	public static void main(String[] args) {
		int[] nums = {1,3,4,5,1};
		findErrorNums(nums);
	}
	
	    public static void findErrorNums(int[] nums) {
	    	// take long because of square of n numbers
	        long n = nums.length;
	        long sum = 0;
	        long squareSum = 0;
	        long totalSum = (n*(n+1))/2; //sum of 1st n whole numbers
	        long totalSquareSum = (n*(n+1)*(2*n+1))/6; //square of 1st n whole numbers 
	        for(int i = 0; i<n; i++){
	            sum+=nums[i];
	            squareSum+=nums[i]*nums[i];
	        }
	        long val1 = sum-totalSum;  //x-y
	        long val2 = squareSum-totalSquareSum; //x^2-y^2
	        val2 = val2/val1; //x+y
	        long x = (val1+val2)/2;
	        long y = x-val1;
	        System.out.println(x+", "+y);
	    }
	
}