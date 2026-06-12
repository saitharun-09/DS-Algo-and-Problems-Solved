package java_Begin;

public class Swap {

	public static void main(String[] args) {
	int a=12;
	int b=37;
	System.out.println("Before Swapping:");
	System.out.println("a is "+a+" and b is " +b);
	b=b+a;
	a=b-a;
	b=b-a;
	System.out.println("After Swapping:");
	System.out.println("a is "+a+" and b is " +b);
	}

}
