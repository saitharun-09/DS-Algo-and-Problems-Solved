package recursion_Backtracking;

public class FactorialOfN_Recursion {
	
	public static void main(String[] args) {
		int n = 4;
		System.out.println(factorial(n));

	}

	// T.C -> O(n) and S.C -> O(n)
	private static int factorial(int n) {
		if (n == 0) return 1;
		return n*factorial(n-1);
	}
}
