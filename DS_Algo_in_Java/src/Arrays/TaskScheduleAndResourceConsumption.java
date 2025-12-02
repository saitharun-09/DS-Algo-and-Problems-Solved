package Arrays;

import java.util.ArrayList;
import java.util.Collections;

public class TaskScheduleAndResourceConsumption {

	public static void main(String[] args) {
		//int[] nums = {6,4,9,10,34,56,54};
		int[] nums = {4,3,2,1};
		System.out.println(resourceConsumption(nums));
	}
	
	public static int resourceConsumption(int[] nums) {
	    int sum = 0;
	    // Using List interface is good practice
	    ArrayList<Integer> array = new ArrayList<>(); 
	    for (int num : nums) {
	        array.add(num);
	    }

	    while (!array.isEmpty()) {
	        int min = Collections.min(array);
	        int x = array.indexOf(min);
	        sum += min;
	        int indexToRemoveRight = -1;
	        int indexToRemoveLeft = -1;
	        int indexToRemoveSelf = x;

	        if (x < array.size() - 1) {
	            indexToRemoveRight = x + 1;
	        }
	        if (x > 0) {
	            indexToRemoveLeft = x - 1;
	        }
	        if (indexToRemoveRight != -1) {
	            array.remove(indexToRemoveRight);
	        }
	        if (indexToRemoveLeft != -1) {
	            array.remove(indexToRemoveLeft);
	        }
	        if (indexToRemoveLeft != -1) {
	             indexToRemoveSelf = x - 1;
	        }
	        array.remove(indexToRemoveSelf);
	    }
	    return sum;
	}

/*
	public static int resourceConsumption(int[] nums) {
		int sum = 0;
		ArrayList<Integer> array = new ArrayList<>();
		for (int num : nums) {
			array.add(num);
		}
		while(!array.isEmpty()) {
			if (array.size() == 1) {
                sum += array.get(0);
                array.remove(0);
                break; 
            }
			int min = Collections.min(array);
			int x = array.indexOf(min);
			sum+=min;
			if (x<array.size()-1) {
				array.remove(x+1);
			}
			if (x>0) {
				array.remove(x-1);
			}
			array.remove(x);
		}
		return sum;
	}*/
}
