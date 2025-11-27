package java_Begin;

public class TotalCurtains {

	public static void main(String[] args) {
		int[] arr = {3,42,60,6,14};
		System.out.println(findTotalCurtains(arr));
	}
	public static int findTotalCurtains(int[]arr) {
		int totalCurtains = 0;
		for (int i = 0; i<arr.length; i++) {
			if (arr[i]>12) {
				totalCurtains+= Math.floor(arr[i]/12);
			}
		}
		return totalCurtains;
	}
}
