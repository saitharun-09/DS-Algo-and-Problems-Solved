package strings;

public class LargestOddNumInString {

	public static void main(String[] args) {
		String num = "239537672423884969653287101";
		System.out.println(largestOddNumber(num));
	}
	
	//simple for loop from end 
	public static String largestOddNumber(String num) {
        for (int i = num.length() - 1; i >= 0; i--) {
            if ((num.charAt(i) - '0') % 2 == 1) {
                return num.substring(0, i+1);
            }
        }
    return "";
	}
}
