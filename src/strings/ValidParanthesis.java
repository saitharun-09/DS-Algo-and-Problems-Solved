package strings;

import java.util.ArrayDeque;
import java.util.HashMap;

public class ValidParanthesis {

	public static void main(String[] args) {
		String s = "()[]{}";
		System.out.println(isValid(s));
	}
	
	public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        for (char c : s.toCharArray()) {
            if (c=='(' || c=='[' || c=='{') {
                stack.push(c);
            }else {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            }   
        }
    return stack.isEmpty();
    }
	/*
	//HashMap solution without if else checks
	public static boolean isValid(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for (char c : s.toCharArray()) {
            if (map.containsKey(c) && !stack.isEmpty()) {
                if (stack.pop()!=map.get(c)) return false;
            }else {
               stack.push(c);
            }   
        }
    return stack.isEmpty();
    }
    */
}
