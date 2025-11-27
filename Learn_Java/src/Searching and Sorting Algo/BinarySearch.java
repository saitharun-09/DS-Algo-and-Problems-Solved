package java_Begin;

public class BinarySearch {
	public static void main(String[] arg) {
		int[] arr = {1,2,3,4,5,6,7,8,9};
		int key = 1;
	 //   System.out.println(binarySearch(arr,key));
	    System.out.println(recursiveSearch(0, arr.length-1,key,arr));
	}

	public static int recursiveSearch(int low, int high, int key, int[] nums) {
		if (low>high) return -1;
		int mid = low+(high-low)/2;
		if (nums[mid]==key) return mid;
		else if (nums[mid]<key) return recursiveSearch(mid+1, high, key, nums);
		else return recursiveSearch(low, mid-1, key, nums);
	}
	
	/*
	public static int binarySearch(int[] arr, int key) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = low + (high - low) / 2;
			if(arr[mid]== key) {
				return mid;
			}else if (arr[mid]<key) {
				low=mid+1;
			}else {
				high=mid-1;
			}
		}
		return -1;
	}*/
}
