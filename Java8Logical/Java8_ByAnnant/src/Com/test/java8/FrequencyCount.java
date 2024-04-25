package Com.test.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyCount {

	public static void main(String[] args) {
		String input = "java";
		
		Map<String, Long> map = Arrays
					.stream(input.split(""))
					.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);

	}

}
