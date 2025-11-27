package Searching_and_Sorting_Algo;

public class MergeSort {
	public static void main(String[] args) {
		int [] arr = {100, 10, 5, 1, 11, 0, 15,1000};	
		int n = arr.length;
		mergeSort(arr);
		for (int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
		
		int count = inversionsCount(arr);
		System.out.println(count);
		
	//	divideAndConq(arr);
	}
	
	public static void mergeSort(int[] arr) {
		if (arr.length<=1) return;
		int mid = arr.length/2;
		int[] arr1 = new int[mid];
		int[] arr2 = new int[arr.length-mid];
		for (int i = 0; i < mid; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[mid+i];
		}
		mergeSort(arr1);
		mergeSort(arr2);
		merge(arr, arr1, arr2);
	}
	
	public static void merge(int[] arr, int[] arr1, int[] arr2) {
		int left = arr1.length;
		int right= arr2.length;
		int i = 0;
		int l = 0;
		int r = 0;
		while(l<left && r<right) {
			if (arr1[l]<arr2[r]) {
				arr[i++]=arr1[l++];
			}else {
				arr[i++]=arr2[r++];
			}
		}
		while (l<left) {
			arr[i++]=arr1[l++];
		}
		while (r<right) {
			arr[i++]=arr2[r++];
		}
	}
	
	//Inversion Count Problem
	public static int inversionsCount(int[] arr) {
		int count = 0;
		if (arr.length<=1) return count;
		int mid = arr.length/2;
		int[] arr1 = new int[mid];
		int[] arr2 = new int[arr.length-mid];
		for (int i = 0; i < mid; i++) {
			arr1[i] = arr[i];
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[mid+i];
		}
		count+=inversionsCount(arr1);
		count+=inversionsCount(arr2);
		count+=countInversion(arr, arr1, arr2);
		return count;
	}
	
	public static int countInversion(int[] arr, int[] arr1, int[] arr2) {
		int count = 0;
		int left = arr1.length;
		int right= arr2.length;
		int i = 0;
		int l = 0;
		int r = 0;
		while(l<left && r<right) {
			if (arr1[l] <= arr2[r])  {
				arr[i++]=arr1[l++];
			}else {
				arr[i++]=arr2[r++];
				count += left-l;
			}
		}
		while (l<left) {
			arr[i++]=arr1[l++];
		}
		while (r<right) {
			arr[i++]=arr2[r++];
		}
		return count;
	}
	
	//Reverse Pair Leetcode Problem
	/*
	public static int divideAndConq(int[] nums){
        int count = 0;
        if (nums.length<=1) return count;
        int mid= nums.length/2;
        int[] arr1 = new int[mid];
        int[] arr2 = new int[nums.length-mid];
        for (int i = 0; i<arr1.length; i++){
            arr1[i] = nums[i];
        }
        for (int i = 0; i<arr2.length; i++){
            arr2[i] = nums[mid+i];
        }
        count+=divideAndConq(arr1);
        count+=divideAndConq(arr2);
        count+=count(nums, arr1, arr2);
        return count;
    }

    public static int count(int[] nums, int[] arr1, int[] arr2){
        int count = 0;
        int j = 0;
        for(int i = 0; i<arr1.length; i++){
            while (j<arr2.length && (long)arr1[i]>(arr2[j]*2L)){
                j++;
            }
            count+=j;
        }
        //Basic merge Sort
        int i = 0;
        int l = 0;
        int r = 0;
        while(l<arr1.length && r<arr2.length){
            if (arr1[l]<=arr2[r]){
                nums[i++]=arr1[l++];
            }else {
                nums[i++]=arr2[r++];
            }
        }
        while(l<arr1.length){
            nums[i++]=arr1[l++];
        }
        while(r<arr2.length){
             nums[i++]=arr2[r++];
        }
        return count;
    }


*/
	
/*	public static void mergeSort(int[] arr) {
		int len = arr.length;
		if (len<=1) {
			return;
		}
		int	mid = len/2;
		int[] arr1 = new int[mid];
		int[] arr2 = new int[len-mid];
		for (int i = 0; i<arr1.length;i++) {
				arr1[i]=arr[i];
		}
		for (int j = 0; j<arr2.length; j++) {
				arr2[j]=arr[mid+j];
		}
		mergeSort(arr1);
		mergeSort(arr2);
		merge(arr1,arr2,arr);
	}
	public static void merge(int[] arr1, int[] arr2, int[] arr) {
		int leftSize = arr.length/2;
		int rightSize = arr.length-leftSize;
		int i = 0; 
		int l = 0;
		int r = 0;
		while (l<leftSize && r<rightSize ) {
			if ( arr1[l]<arr2[r]) {
				arr[i++]= arr1[l++];
			}else {
				arr[i++]=arr2[r++];
			}
		}
		while ( l<leftSize) 
			arr[i++]=arr1[l++];
			
		while ( r<rightSize) 
			arr[i++]= arr2[r++];	
	}
*/
}