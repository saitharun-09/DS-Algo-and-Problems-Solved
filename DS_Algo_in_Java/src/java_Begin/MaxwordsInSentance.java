package java_Begin;

public class MaxwordsInSentance {

	public static void main(String[] args) {
		String one = "Ram is a good boy. He drinks a lot of water, he stays in shimla.";
		System.out.println(maxWords(one));
	}
	public static int maxWords(String one) {
		String[] words = one.split("[.,]");
		int totalCount = 0;
		for (String word : words) {
			int count = word.trim().isEmpty() ? 0 : word.trim().split("\\s+").length;
			if (count>totalCount) {
				totalCount=count;
			}
		}
		return totalCount;
	}
}