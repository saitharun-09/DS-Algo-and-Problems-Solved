package Searching_and_Sorting_Algo;

public class InsertionSort {
	public static void main(String[] arg) {
		int[] arr = {9,8,5,7,3,6};
	//	insertionSort(arr);
		int i = 1; 
		recursiveInsertionSort(arr,i);
		for (int k = 0; k<arr.length; k++) {
			System.out.print(arr[k] + " ,");
		}
	}

	public static void recursiveInsertionSort(int[] arr, int i) {
		if (i==arr.length)
			return;
		int j= i;
		while (j>0 && arr[j-1]>arr[j]) {
			int temp = arr[j-1];
			arr[j-1] = arr[j];
			arr[j] = temp;
			j--;
		}
		
		recursiveInsertionSort(arr, ++i);
	}

	
	/*
	static void insertionSort(int[] arr) {
		for(int i = 1; i<arr.length; i++) {
			int j = i;
			while (j>0 && arr[j]<arr[j-1]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
	}
*/
}
