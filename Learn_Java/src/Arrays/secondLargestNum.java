package Arrays;

public class secondLargestNum {

	public static void main(String[] args) {
		int[] arr = {4,1,3,5,2};
		int largest = arr[0];
		int secondLargest = -1;
		for (int i = 0; i < arr.length; i++) {
			if ( arr[i]>largest) {
				secondLargest = largest;
				largest = arr[i]; 
			}else if (arr[i]>secondLargest && arr[i]!=largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println(secondLargest);
	}
}