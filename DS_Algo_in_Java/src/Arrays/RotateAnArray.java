package Arrays;

public class RotateAnArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		int k = 3;
		// to Rotate right, first reverse the entire array
		// if rotate number is greater than length of array then k=k%n;
		reverseArray(arr,0,k-1);
		reverseArray(arr,k,arr.length-1);
		reverseArray(arr,0,arr.length-1);
		for (int i : arr) {
			System.out.print(i+", ");
		}
	}
	public static void reverseArray(int[] arr,int start, int end) {
		int i=start;
		int j=end;
		while(i<j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		i++;
		j--;
		}
	}
}
