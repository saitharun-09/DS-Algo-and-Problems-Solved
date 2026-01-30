package strings;

public class MaxParanthesisDepthInAString {

	public static void main(String[] args) {
		String  s = "(1+(2*3)+((8)/4))+1";
		System.out.println(maxDepth(s));
	}

	public static int maxDepth(String s) {
        int open = 0;
        int close = 0;
        int max = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') open++;
            else if (c == ')') close++;
            max = Math.max(max,open-close);
        }
        return max;
    }
}
