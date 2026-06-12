package strings;

import java.util.HashMap;

public class RomanToIntegerConversion {

	public static void main(String[] args) {
		String s = "MCMXCIV";
		System.out.println(romanToInt(s));
	}
	// T.C-> O(n) with HashMap
	public static int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans = 0;
        for (int i = s.length()-1; i>=0; i--) {
            if (i == s.length()-1 || map.get(s.charAt(i))>=map.get(s.charAt(i+1))) {
                ans += map.get(s.charAt(i));
            }else {
                ans -=map.get(s.charAt(i));
            }
        }
    return ans;
    }
	
	//Without HashMap Still T.C-> O(n) but S.C-> O(1)
	/*
    public static int romanToInt(String s) {
        int ans = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int current = value(s.charAt(i));
            if (i < s.length() - 1 && current < value(s.charAt(i + 1))) {
                ans -= current;
            } else {
                ans += current;
            }
        }
        return ans;
   }
    private int value(char c) {
        return switch (c) {
            case 'I' -> 1;
            case 'V' -> 5;
            case 'X' -> 10;
            case 'L' -> 50;
            case 'C' -> 100;
            case 'D' -> 500;
            case 'M' -> 1000;
            default -> 0;
        };
	}
*/
}
