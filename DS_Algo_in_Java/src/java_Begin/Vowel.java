package java_Begin;

public class Vowel {

	public static void main(String[] args) {
	String str="vowel is present or not";
	str=str.toLowerCase();
	int count=0;
	for (int i=0;i<str.length();i++) {
		if (str.charAt(i)=='a'||
			str.charAt(i)=='e'||
			str.charAt(i)=='i'||
			str.charAt(i)=='o'||
			str.charAt(i)=='u' ) {
			count++;
		}
		}
	  System.out.println("Total no of Vowels in string are: " + count);
	}
	}
