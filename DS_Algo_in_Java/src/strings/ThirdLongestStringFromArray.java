package strings;

public class ThirdLongestStringFromArray {

	public static void main(String[] args) {
		String[] input = {"hello", "world", "before", "all"};
		System.out.println(thirdLongestString(input));
	}

	public static String thirdLongestString(String[] input) {
		if (input.length < 3) return null;
		String str1 = "";
		String str2 = ""; 
		String str3 = ""; 
		for (int i = 0; i<input.length; i++) {
			if (input[i].length()>str1.length()) {
				str3 = str2;
				str2 = str1;
				str1 = input[i];
			}else if (input[i].length()>str2.length()) {
				str3 = str2;
				str2 = input[i];
			}else if (input[i].length()>str3.length()) {
				str3 = input[i];
			}
		}
		return str3;
	}
}
