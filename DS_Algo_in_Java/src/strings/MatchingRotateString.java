package strings;

public class MatchingRotateString {

	public static void main(String[] args) {
		String s = "abcde";
		String goal = "cdeab";
		System.out.println(rotateString(s, goal));
	}
	// optimal solution with O(n) T.C
	public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        s+=s;
        return s.contains(goal);
    }		
	/*
	// Brute force by physically rotating the string
	public static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;
        for(int i = 0; i<s.length(); i++) {
            s = rotate(s);
            if (s.equals(goal)) return true;
        }
        return false;
    }
    public static String rotate(String s) {
        char first = s.charAt(0);
        for (int i = 1; i<s.length(); i++) {
            char[] arr = s.toCharArray();
            arr[i-1] = arr[i]; 
            s = new String(arr);
        }
        char[] arr = s.toCharArray();
        arr[s.length()-1] = first;
        s = new String(arr);
        return s;
    }
    */
}
