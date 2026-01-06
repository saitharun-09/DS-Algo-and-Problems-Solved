package deque_Stack;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class cpuTime {

	public static void main(String[] args) {
		int n = 2; 
		List<String> logs = Arrays.asList("0:start:0","1:start:2","1:end:5","0:end:6");
		System.out.println(Arrays.toString(exclusiveTime(n, logs))); 
	}
	
	public static int[] exclusiveTime(int n, List<String> logs) {
        int[] arr = new int[n];
        Deque<Integer> dq = new ArrayDeque<>();
        int prevTime = 0;
        for (String log : logs) {
            String[] values = log.split(":");
            int functionId = Integer.parseInt(values[0]);
            String ss = values[1];
            int time = Integer.parseInt(values[2]);
            if (ss.startsWith("s")) {
            	if (!dq.isEmpty()) {
            		arr[dq.peek()] += time-prevTime;
                	prevTime = time;
            	}
            	dq.push(functionId);
            	prevTime = time;
            }else {
            		arr[dq.pop()] += time-prevTime+1;
            		prevTime = time+1;
            	}
            }
		return arr;
	}
}
