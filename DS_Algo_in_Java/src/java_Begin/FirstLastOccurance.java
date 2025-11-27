package java_Begin;

public class FirstLastOccurance {

	public static void main(String[] args) {
		int [] arr = {1,3,5,5,5,5,67,123,125};
		int n = 5;
		solution(arr,n);
	}
	public static void solution(int[] arr, int n) {
		int [] array = {-1,-1};
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]==n) {
				array[0]=i;
				break;
			}
		}
		for(int i = arr.length-1; i>=0; i--) {
			if (arr[i]==n) {
				array[1]=i;
				break;
			}
		}
		
		for(int i = 0; i<array.length; i++) {
			System.out.print(array[i]+", ");
		}
	}

}
