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
        int halfLen = (m + n + 1) / 2; 
        while (low <= high) {
        	int i = (low + high) / 2;
        	int j = halfLen - i; 
        	int maxLeft1 = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
        	int minRight1 = (i == m) ? Integer.MAX_VALUE : nums1[i];
        	int maxLeft2 = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
        	int minRight2 = (j == n) ? Integer.MAX_VALUE : nums2[j];
        	if (maxLeft1 <= minRight2 && maxLeft2 <= minRight1) {
        		if ((m + n) % 2 != 0) {
        			return (double) Math.max(maxLeft1, maxLeft2);
        		} else { 
        			return (double) (Math.max(maxLeft1, maxLeft2) + Math.min(minRight1, minRight2)) / 2.0;
        		}
        	} else if (maxLeft1 > minRight2) {
        		high = i - 1;
        	} else {
        		low = i + 1;
        	}
        }
        return 0.0;
	}

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
