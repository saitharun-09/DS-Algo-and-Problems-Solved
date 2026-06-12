package strings;

public class RemoveOuterParanthesis {

	public static void main(String[] args) {
		String s = "(()())(())(()(()))";
		System.out.println(removeOuterParentheses(s));
	}
	
	public static String removeOuterParentheses(String s) {
	       StringBuilder result = new StringBuilder();
	        int count = 0;
	        for (char c : s.toCharArray()) {
	            if (c == '(') {
	                if (count>0) result.append(c);
	                count++;
	            }else {
	                count--;
	                if (count>0) result.append(c);
	            }
	        }
	        return result.toString();
	    }
	
	//With Counters and indexes and String Concat
	/*
	public static String removeOuterParentheses(String s) {
        String string = "";
        int count = 0;
        int i = 0;
        int j = 1;
        for (char c : s.toCharArray()) {
            if (c == '(') count++;
            else count--;
            i++;
            if (count == 0) {
                string+=s.substring(j,i-1);
                j = i+1;
            }
        }
        return string;
    }	
*/
}
