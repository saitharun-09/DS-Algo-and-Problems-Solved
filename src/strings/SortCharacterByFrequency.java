package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortCharacterByFrequency {

	public static void main(String[] args) {
		String s = "Acbb";
		System.out.println(frequencySort(s));
	}
	
	// Using Bucket Sort and looping from back because buckets[i] holds characters appear i times
	// T.C -> O(n) and S.C -> O(n)
	public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }        
        List<Character>[] buckets = new List[s.length()+1];
        for (Map.Entry<Character,Integer> value : map.entrySet()) {
            char c = value.getKey();
            int freq = value.getValue();
            if (buckets[freq]==null) {
                buckets[freq] = new ArrayList<>();
            }
            buckets[freq].add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = buckets.length-1; i>=0; i--) {
            if (buckets[i] != null) {
                for (char c : buckets[i]) {
                    for (int j = 0; j<i; j++) {
                        sb.append(c);
                    }
                }
            }
        }
    return sb.toString();
    }
	
	/*
	// O(n+k log n) T.C using HashMap and sorting it by converting it to list. S.C - O(n)
	public static String frequencySort(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c,map.getOrDefault(c,0)+1);
        }        
        List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
        list.sort(Map.Entry.<Character,Integer>comparingByValue().reversed());
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Character,Integer> value : list) {
            char c = value.getKey();
            int freq = value.getValue();
            for (int i = 0; i<freq; i++) {
                sb.append(c);
            }
        }
    return sb.toString();
    }
    */
}
