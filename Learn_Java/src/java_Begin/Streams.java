package java_Begin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streams {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5, 1, 7, 3, 9, 7);
		List<String> names = Arrays.asList("Adam", "Bob", "Alex", "John");
		names.stream().filter(n->n.startsWith("A")).count();
		Double x = list.stream().collect(Collectors.averagingInt(Integer::intValue));
	}

}
