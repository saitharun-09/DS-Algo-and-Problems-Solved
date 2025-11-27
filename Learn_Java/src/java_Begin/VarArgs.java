package java_Begin;

public class VarArgs {
//to run a single method with overloaded methods with different arguments
	public static void main(String[] args) {
		System.out.println(avg(1,2,3));

	}
	static double avg(int... numbers) {
		double sum = 0;
		for (double number :numbers) {
			sum+=number;
		}
		return sum/numbers.length;
		
	}
}
