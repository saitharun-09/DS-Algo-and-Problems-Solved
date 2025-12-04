package Arrays;

import java.util.Arrays;

public class MagneticForceBtw2Balls {

	public static void main(String[] args) {
		int[] position = {1,2,3,4,7};
		int m = 3;
		System.out.println(maxDistance(position, m));
	}

	public static int maxDistance(int[] position, int m) {
        Arrays.sort(position);
        int low = 1;
        int high = position[position.length-1]-position[0];
        while (low<=high){
            int mid = low+(high-low)/2;
            if (maxDistance(position,mid,m)) low = mid+1;
            else high = mid-1;
        }
        return high;
    }
    public static boolean maxDistance(int[] position, int gap, int m){
        int balls = m-1;
        int last = position[0];
        for(int i = 1; i<position.length; i++){
            if (position[i]-last>=gap) {
                if (balls<=0) break;
                last = position[i];
                balls--;
            }
        }
    return balls==0;
    }
}
