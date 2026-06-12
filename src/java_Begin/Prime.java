package java_Begin;

public class Prime {

	public static void main(String[] args) {
		int x = 0;
		int n = 0;
		int num = 5;
		x=num/2;
		if (num==0 ||num==1) {
			System.out.println(num+" is not a Prime Number");
		}
		else { for(int i=2;i<=x;i++) {
			if (num%i==0) {
				System.out.println(num+" is not a Prime Number");
				n=1;
				break;
				}
			}
		if (n==0) {
				System.out.println(num+" is a Prime Number");
		}
		}
	}
}