package Arrays;

public class MaxProductSubArray {

	public static void main(String[] args) {
		int[] nums = {-3,-1,-1};
		//System.out.println(maxProdSubarray(nums));
		System.out.println(maxProduct(nums));
		//maximumProduct(nums); //Another Problem
	}
	
	//prefix-Suffix Style - easy
	public static int maxProduct(int[] nums) {
	    int max = Integer.MIN_VALUE;
	    int prefixSum = 1;
	    int suffixSum = 1;
	    for (int i = 0; i<nums.length; i++){
	        if (suffixSum==0) suffixSum = 1;
	        if (prefixSum==0) prefixSum = 1;
	        prefixSum*=nums[i];
	        suffixSum*=nums[nums.length-i-1];
	        max = Math.max(max, Math.max(prefixSum, suffixSum));
	    }
	    
	    return max;
    }	
	/*
	//kadane's Algo Slightly modified
	public static int maxProdSubarray(int[] nums) {
		int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];
        for (int i = 1; i<nums.length; i++){
            if (nums[i]<0){
                int temp = maxProduct;
                maxProduct = minProduct;
                minProduct = temp;
            }
            maxProduct = Math.max(maxProduct*nums[i],nums[i]);
            minProduct = Math.min(minProduct*nums[i],nums[i]);
            result = Math.max(result, maxProduct);
        }
        return result;
	}
	
	//Maximum Product of Three Numbers
	public static int maximumProduct(int[] nums) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int num : nums){
            if (num<=min1){
                min2 = min1;
                min1 = num;
            }else if (num<=min2){
                min2 = num;
            }

            if (num >= max1){
                max3 = max2;
                max2 = max1; 
                max1 = num;
            }else if (num >= max2){
                max3 = max2;
                max2 = num;
            } else if (num >= max3) {
                max3 = num;
            }
        }
        int max = max1*max2*max3;
        int min = max1*min1*min2;
        int ans = Math.max(max,min);
        return ans;
    }
    */
}