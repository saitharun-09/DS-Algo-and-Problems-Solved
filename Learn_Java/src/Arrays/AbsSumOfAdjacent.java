package Arrays;

public class AbsSumOfAdjacent {

	public static void main(String[] args) {
		int[] arr = {11,22,12,24,13,26,14};
		int pos = 5;
		System.out.println(sumOfAdjacent(arr,pos));
	}
	public static int sumOfAdjacent(int[] arr, int pos) {
		int leftAdj = 0;
		int rightAdj = 0;
		for(int i = 0; i<arr.length; i++) {
			if (i==pos) {
				leftAdj = Math.abs(arr[i]-arr[i-1]);
				rightAdj = Math.abs(arr[i]-arr[i+1]);
				break;
			}
		}
		return leftAdj+rightAdj;
	}
}
