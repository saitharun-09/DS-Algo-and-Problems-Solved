package java_Begin;

import java.util.ArrayList;

public class UnionOfArrays {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3,5,8};
		int[] arr2 = {4,5,8,9,10};
		 union(arr1,arr2);
		 System.out.println(union(arr1,arr2));
	}
	
	public static ArrayList<Integer> union(int[] arr1, int[] arr2) {
		ArrayList<Integer> array = new ArrayList<>();
		int n1 = arr1.length;
		int n2 = arr2.length;
		int i = 0;
		int j = 0;
		while ( i<n1 && j<n2) {
			if (arr1[i]<=arr2[j]) {
				if (array.size()==0 || array.getLast()!=arr1[i]){
					array.add(arr1[i]);
				}
				i++;
			}else {
				if (array.size()==0 || array.getLast()!=arr2[j]){
					array.add(arr2[j]);
				}
				j++;
			}
		}
		while ( i<n1 ) {
			if (array.size()==0 || array.getLast()!=arr1[i]){
				array.add(arr1[i]);
			}
			i++;
		}
		while ( j<n2 ) {
			if (array.size()==0 || array.getLast()!=arr2[j]){
				array.add(arr2[j]);
			}
			j++;
		}
		return array;
	}
}
