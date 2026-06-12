package java_Begin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class mergeOverLapIntervals {

	public static void main(String[] args) {
		int[][] input = {{1,4},{4,5}};
		int[][] result = merge(input);
		//System.out.println(Arrays.deepToString(result));
		int[] array1 = {1,3,5,7};
		int[] array2 = {0,2,6,8,9};
		mergeTwoSortedArrays(array1,array2);
	}
	
	public static void mergeTwoSortedArrays(int[] array1, int[] array2) {
		int i = array1.length-1;
		int j = 0;
		while(i>=0 && j<array2.length) {
			if (array1[i]>array2[j]) {
				int temp = array1[i];
				array1[i] = array2[j];
				array2[j] = temp;
				i--;
				j++;
			}else {
				break;
			}
			
		}
		Arrays.sort(array1);
		Arrays.sort(array2);
		for (int num : array1) {
			System.err.print(num);
		}
		System.out.println("___");
		for (int num : array2) {
			System.err.print(num);
		}
	}
	
	public static int[][] merge(int[][] input) {
		if (input == null || input.length == 0) {
            return new int[0][0];
        }
		Arrays.sort(input, (a, b) -> Integer.compare(a[0],b[0]));
		List<int[]> array = new ArrayList<>();
		array.add(input[0]);
		for (int i = 1; i<input.length; i++) {
			int[] lastInterval = array.get(array.size()-1);
			int start = input[i][0];
			int end = input[i][1];
			if(start < lastInterval[1]) {
				lastInterval[1] = Math.max(lastInterval[1], end);
			}else {
				array.add(input[i]);
			}
		}
		return array.toArray(new int[array.size()][]);
	
	}
	
	/*
	 public static int[][] merge(int[][] input) {
		Arrays.sort(input, (a, b) -> Integer.compare(a[0],b[0]));
		 List<int[]> arrayList = new ArrayList<>();
		int i = 0;
		while(i<input.length) {
			int start = input[i][0];
			int end = input[i][1];
			int j = i + 1;
			while(j<input.length && input[j][0]<=end) {
				end = Math.max(end, input[j][1]);
				j++;
			}
			arrayList.add( new int[] {start,end});
			i=j;
		}
		return arrayList.toArray(new int[arrayList.size()][]); 
	 }*/
}