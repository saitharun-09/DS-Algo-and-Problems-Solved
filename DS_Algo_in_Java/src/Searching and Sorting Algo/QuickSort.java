package java_Begin;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {1,8,6,7,3,5,2,2};
		quickSort(arr, 0, arr.length-1);
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i]+", ");
		}
	}

	public static void quickSort(int[] arr, int start, int end) {
		if (start>=end) return;
		int pivot = partition(arr, start, end);
		// for infinite loop version use quickSort(arr, start,pivot);
		quickSort(arr, start, pivot-1);
		quickSort(arr, pivot+1, end);
	}
		
	// Hoare's Partition Version which is Fastest
	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start; 
		int j = end;
		
		while (i<j) {
			while (arr[i]<=pivot && i<end) {
				i++;
			}
			while (arr[j]>=pivot && j>start) {
				j--;
			}
			if (i<j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[start];
		arr[start] = arr[j];
		arr[j] = temp;
		return j;
	}
	/*
	 // infinite loop version of Hoare's version which is more efficient in edge cases
	public static int partition(int[] arr, int start, int end) {
	    int pivot = arr[start];
	    int i = start - 1;
	    int j = end + 1;

	    while (true) {
	        do { i++; } 
	        	while (arr[i] < pivot);
	        do { j--; } 
	        while (arr[j] > pivot);

	        if (i >= j) return j;

	        int temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }
	}
	
/*
 // Lomuto Partion Version 

	public static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start+1;
		for (int j = i; j<=end; j++) {
			if (arr[j]<pivot) {
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
				i++;
			}
		}
		int temp = arr[start];
		arr[start] = arr[i-1];
		arr[i-1] = temp;
		return i-1;
	}
	*/
}
