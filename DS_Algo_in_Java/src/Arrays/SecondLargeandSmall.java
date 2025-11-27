package Arrays;

public class SecondLargeandSmall{
	
	public static void main(String[] args) {
		int[] arr = {1,8,6,7,8,7,3,5,2};
		int [] arrFinal = {slargest(arr),ssmallest(arr)};
		for(int i : arrFinal) {
			System.out.print(i);
		}
	}
	public static int slargest(int[] arr) {
		int large = arr[0];
		int sLargest = -1;
		for (int i = 1; i<arr.length; i++) {
			if (arr[i]>large) {
				sLargest = large;
				large = arr[i];
			}else if (arr[i]<large && arr[i] > sLargest) {
				sLargest = arr[i];
			}
		}
		return sLargest;
}
	public static int ssmallest(int[] arr) {
		int small = arr[0];
		int sSmallest= slargest(arr);
		for (int i = 1; i<arr.length; i++) {
			if (arr[i]<small) {
				sSmallest = small;
				small = arr[i];
			}else if (arr[i]>small && arr[i] < sSmallest) {
				sSmallest = arr[i];
			}
		}
		return sSmallest;
}
}
