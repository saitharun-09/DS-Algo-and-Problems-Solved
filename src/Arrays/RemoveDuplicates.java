package Arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
			int[] arr = {1,2,2,3,4,4,5,5,6};
			removeDuplicates(arr);
			System.out.println(Arrays.toString(arr));
		}

	public static void removeDuplicates(int[] arr) {
		int i = 0;
		for (int j = 0; j < arr.length; j++) {
			if (arr[i]!=arr[j]) {
				arr[i+1]=arr[j];
					i++;
			}
		}
	}
}
