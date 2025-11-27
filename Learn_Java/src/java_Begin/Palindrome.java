package java_Begin;

public class Palindrome {

	public static void main(String[] args) {
		String str ="Kaya ka y ,ak";
		Boolean isPalindrome=true;
		str=str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase().trim();
		for (int i=0;i<str.length()/2;i++) {
			if(str.charAt(i)!=str.charAt(str.length()-i-1)) {
				isPalindrome=false;
				break;
			}
		}
		if (isPalindrome) {System.out.println("Given String is a Palindrome");
		}
		else {System.out.println("Given String is not a Palindrome");
		}
		}
	}
