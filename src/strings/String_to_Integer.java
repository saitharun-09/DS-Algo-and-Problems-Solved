package strings;

public class String_to_Integer {
    static void main(String[] args) {
        String s = "-9731l";
        System.out.println(myAtoi(s));
    }

    public static int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;
        int sign = 1;
        int i = 0;
        long sum = 0;
        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        }else if (s.charAt(i) == '+') {
            i++;
        }
        while (i<s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i)-'0';
            sum = sum * 10 + digit;
            if (sum*sign > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (sum*sign < Integer.MIN_VALUE) return Integer.MIN_VALUE;
            i++;
        }
        return (int)sum*sign;
    }
}
