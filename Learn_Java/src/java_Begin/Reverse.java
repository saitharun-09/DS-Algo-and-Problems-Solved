package java_Begin;

public class Reverse {
	public static void main(String[] args) {
		String str="which ever it is!";
		String result="";
		char character;
		for (int i=0;i<str.length();i++) {
			character=str.charAt(i);
			result=character+result;
		}
		System.out.println(result);
	}
}