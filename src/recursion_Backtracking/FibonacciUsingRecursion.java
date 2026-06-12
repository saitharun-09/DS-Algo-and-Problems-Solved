package recursion_Backtracking;

public class FibonacciUsingRecursion {

	public static void main(String[] args) {
		int x = 6;
		System.out.println(fib(x));

	}
	// T.C -> O(n^2) for recursion calls 
	private static int fib(int x) {
		if (x <= 1) return x;
		return fib(x-1)+fib(x-2);
	}
	
}
