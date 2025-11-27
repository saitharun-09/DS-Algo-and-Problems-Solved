package java_Begin;

public class BubbleSort {
	public static void main(String[] arg) {
		int[] arr = {1,8,5,7,3,6};
		bubbleSort(arr);
		for (int i = 0; i<arr.length; i++) {
			System.out.print(arr[i] + " ,");
		}
	}
			
/*	
	public static void recursiveBubbleSort(int[] arr, int n) {
		if (n==1) return;
		for (int j = 0; j < n-1; j++) {
			if(arr[j]>arr[j+1]) {
				int temp = arr[j+1];
				arr[j+1] = arr[j];
				arr[j] = temp;
			}	
		}
		n--;
		recursiveBubbleSort(arr, n);
	}
*/
		
	static void bubbleSort(int[] arr) {
		int swapped = 0;
		for (int i = arr.length-1; i>=0; i--) {
			for(int j = 0; j<i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j+1];
					arr[j+1] = arr[j];
			        arr[j] = temp;
			        swapped++;
				}
			}
		if (swapped==0)
			return;
		}
	}
}