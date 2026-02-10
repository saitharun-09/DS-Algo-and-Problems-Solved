package Arrays;

public class Adobe_OA_Question {

	public static void main(String[] args) {
		int[] arr = {4,7,5,11,15};
		// Identical Distribution
		System.out.println(minOpsToMakeCardDistribution(arr));	
	}
	
	private static int minOpsToMakeCardDistribution(int[] arr) {
		int count = Integer.MAX_VALUE;
		int[] primes = {2,3,5,7,11,13};
		for (int i : primes) {
			int sum = 0;
			for (int num : arr) {
				sum+=num%i;
			}
			count = Math.min(sum, count);
		}
		return count;
	}
}