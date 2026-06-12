package Arrays;

public class MedianBtw2SortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(medianBtwSortedArrays(nums1, nums2));
	}

	private static double medianBtwSortedArrays(int[] nums1, int[] nums2) {
		if (nums1.length > nums2.length) {
            return medianBtwSortedArrays(nums2, nums1);
		}
		int m = nums1.length;
        int n = nums2.length;
        int low = 0;
        int high = m;
        int halfLen = (m + n + 1) / 2; //works for both even and odd lengths
        while (low <= high) {
        	int mid1 = (low + high) / 2;
        	int mid2 = halfLen - mid1; 
        	int maxLeft1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
        	int minRight1 = (mid1 == m) ? Integer.MAX_VALUE : nums1[mid1];
        	int maxLeft2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
        	int minRight2 = (mid2 == n) ? Integer.MAX_VALUE : nums2[mid2];
        	if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
        		if ((m + n) % 2 != 0) {
        			return (double) Math.max(maxLeft1, maxLeft2);
        		} else { 
        			return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        		}
        	} else if (maxLeft1 > minRight2) {
        		high = mid1 - 1;
        	} else {
        		low = mid1 + 1;
        	}
        }
        return 0.0;
	}
	
	/*
	// better solution than forming a new array by merge sort
	    private static double medianBtwSortedArrays(int[] nums1, int[] nums2) {
	        int n1 = nums1.length;
	        int n2 = nums2.length;
	        int n = n1+n2;
	        int count = 0;
	        int i = 0;
	        int j = 0;
	        int idx1 = (n-1)/2;
	        int idx2 = n/2;
	        int ele1 = Integer.MIN_VALUE;
	        int ele2 = Integer.MIN_VALUE;
	        while(count<=idx2) {
	            int num;
	            if (i<n1 && (j>=n2 || nums1[i]<=nums2[j])) {
	                num = nums1[i++];
	            }else {
	                num = nums2[j++];
	            }
	            if (count == idx1) ele1 = num;
	            if (count == idx2) ele2 = num;
	            count++;
	        }
	        if (n%2==1) return (double) ele2;
	        else return (double) (ele1+ele2)/2;
	    }
	}
	*/

	/*
	private static double medianBtwSortedArrays(int[] nums1, int[] nums2) {
		int i = 0;
		int j = 0;
		int k = 0;
		int[] arr = new int[nums1.length+nums2.length];
		while(i<nums1.length && j<nums2.length) {
			if (nums1[i]<=nums2[j]) arr[k++]=nums1[i++];
			else arr[k++]=nums2[j++];
		}
		while(i<nums1.length) {
			arr[k++]=nums1[i++];
		}
		while(j<nums2.length) {
			arr[k++]=nums2[j++];
		}
		if (arr.length%2==1) {
			return (double)arr[arr.length/2];
		}else {
			double num = arr[arr.length/2]+arr[(arr.length/2)-1];
			return (double)num/2.0;
		}
	}
*/
}
