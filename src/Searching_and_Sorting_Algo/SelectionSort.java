package Searching_and_Sorting_Algo;

public class SelectionSort {
	public static void main(String[] arg) {
		int[] arr = {9,8,5,7,3,6};
		selectionSort(arr);
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}

	static void selectionSort(int[] arr) {
		for(int i = 0; i<arr.length-1; i++) {
			int min = i;
			for (int j = i; j<arr.length; j++) {
				if (arr[min]>arr[j]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
}
