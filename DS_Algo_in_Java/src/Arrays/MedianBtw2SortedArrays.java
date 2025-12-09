package Arrays;

public class MedianBtw2SortedArrays {

	public static void main(String[] args) {
		int[] nums1 = {1,2};
		int[] nums2 = {3,4};
		System.out.println(medianBtwSortedArrays(nums1, nums2));
	}

	private static double medianBtwSortedArrays(int[] nums1, int[] nums2) {
		
	
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
