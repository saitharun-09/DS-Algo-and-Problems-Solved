package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Adobe_OA_Service_Timeout {

	public static void main(String[] args) {
		int[] arr = {10,10,60,20,80};
		int threshold = 1;
		String[] serviceIds = {"svc1","svc2","svc2","svc1","svc1"};
		System.out.println(Arrays.toString(TimedOutIds(arr, threshold, serviceIds)));
	}

	private static String[]  TimedOutIds(int[] arr, int threshold, String[] serviceIds) {
		HashMap<String, Integer> map = new HashMap<>();
		TreeSet<String> set = new TreeSet<>();
		for (int i = 0; i<arr.length; i++) {
			if (map.containsKey(serviceIds[i])) {
				if (arr[i]-map.get(serviceIds[i]) >= threshold) set.add(serviceIds[i]);
			}
			map.put(serviceIds[i], arr[i]);
		}
		return set.toArray(new String[set.size()]);
	}
	/*
	private static String[]  TimedOutIds(int[] arr, int threshold, String[] serviceIds) {
		HashSet<String> set = new HashSet<>();
		for (int i = 0; i<arr.length; i++) {
			if (i>0 && serviceIds[i].equalsIgnoreCase(serviceIds[i-1])) continue;
			for (int j = i+1; j<serviceIds.length; j++) {
				if (serviceIds[i].equalsIgnoreCase(serviceIds[j])) {
					if (arr[j]-arr[i]>=threshold) {
						set.add(serviceIds[i]);
						break;
					}
					else continue;
				}else continue;
			}
		}
		String[] result = set.toArray(new String[set.size()]);
		Arrays.sort(result);
		return result;
	}
	*/
}
