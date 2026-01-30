package strings;

public class ASCIIStirngToInteger {

	public static void main(String[] args) {
		String s = " -042";
		System.out.println(myAtoi(s));
	}
	public static int myAtoi(String s) {
        if (s == null) return 0;
        s=s.trim();
        if (s.isEmpty()) return 0;
        int start = 0;
        int sign = 1;
        long res = 0;
        if (s.charAt(0)=='-' || s.charAt(0)=='+'){
            sign = (s.charAt(0)=='-') ? -1 : 1;
            start++;
        }
        while (start<s.length()) {
            if (!Character.isDigit(s.charAt(start))) break;
            res = res*10+(s.charAt(start)-'0');
            if (sign == 1 && res > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sign == -1 && -res < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            start++;
        }
        return (int) (res*sign);
    }
}
