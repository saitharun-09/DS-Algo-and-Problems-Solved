package java_Begin;

public class ReverseInt {

	public static void main(String[] args) {
		int x = 123;
		System.out.println(reverse(x));
	}
	public static int  reverse(int x) {
		int rev = 0;
		int rem = 0;
		while (x>0) {
			rem=x%10;
			rev = (rev*10)+rem;
			x/=10;
		}
			return rev;
		}
}
	