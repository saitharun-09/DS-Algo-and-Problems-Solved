package Arrays;

public class BookAllocationToStudents {
	
	public static void main(String[] args) {
		int[] pages = {25, 46, 28, 49, 24};
		int std = 4;
		System.out.println(findPages(pages, std));
	}
	
	public static int findPages(int[] pages, int std) {
		int low = Integer.MIN_VALUE;
		int high = 0;
		for (int page : pages) {
			low= Math.max(low, page);
			high+=page;
		}
		while(low<=high) {
			int mid = low+(high-low)/2;
			int page = maxPagestoStd(pages, mid);
			if (page<=std) high = mid-1;
			else low = mid+1;
		}
		return low;
	}
	/*
	public static int findPages(int[] pages, int std) {
		int low = Integer.MIN_VALUE;
		int high = 0;
		for (int page : pages) {
			low= Math.max(low, page);
			high+=page;
		}
		for (int i = low; i<high; i++) {
			int page = maxPagestoStd(pages, i);
			if (page==std) {
				return i;
			}
		}
		return -1;
	}*/
	
	public static int maxPagestoStd(int[] pages, int mid) {
		int count = 1;
		int sum = 0;
		for (int i = 0; i < pages.length; i++) {
			if (sum+pages[i]<=mid) {
				sum += pages[i];
			}else {
				count++;
				sum = pages[i];
			}
		}
		return count;
	}
}