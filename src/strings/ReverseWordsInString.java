package strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWordsInString {

	public static void main(String[] args) {
		String s =" a good   example  ";
		System.out.println(reverseWords(s));
	}
	
	public static String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        String[] string = s.split("\\s+");
        for (int i = string.length-1; i>=0; i--) {
            sb.append(string[i]);
            if (i!=0) sb.append(" ");
        }
        return sb.toString();
    }
	
	/*
	public static String reverseWords(String s) {
        s = s.trim();
        List<String> words = Arrays.asList(s.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words);
    }
	*/
}
