package Arrays;

import java.util.Collections;
import java.util.PriorityQueue;

public class LastStoneWeight {

	public static void main(String[] args) {
		int[] stones = {2,7,4,1,8,1};
		System.out.println(lastStoneWeight(stones));
	}

	public static int lastStoneWeight(int[] stones) {
        if (stones.length<=1) return stones[0];
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<stones.length; i++){
            maxPq.add(stones[i]);
        }
        while(maxPq.size()>1){     
            int first = maxPq.poll();
            int second = maxPq.poll();
            if (first != second) {
                maxPq.add(first - second);
            }
        }
        return maxPq.isEmpty() ? 0 : maxPq.peek();
    }
}
