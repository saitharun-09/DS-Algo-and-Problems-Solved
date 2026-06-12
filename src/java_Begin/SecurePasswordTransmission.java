package java_Begin;

import java.util.Scanner;

public class SecurePasswordTransmission {
	
	public static void main(String[] arg) {
		
		Scanner scanner = new Scanner(System.in);
	//	System.out.println("Enter Binary String : ");
	//	String pwd = scanner.nextLine();
		String pwd = "0001011";
		System.out.println(pwd.charAt(pwd.length()-3));
		int result = 0;
		
		for(int i = 0; i<pwd.length()-1; i+=2) {
			if(pwd.charAt(i)!=pwd.charAt(i+1)) {
				result++;
			}
		}
		System.out.println(result);
	}

}
