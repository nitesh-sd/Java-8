package Com.test.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SklptAndLimitExample {
	public static void main(String[] args) {
		List<Integer> nos  =Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		IntStream.range(1, 10)
			.skip(1)
			.limit(4)
			.forEach(System.out::println);
	}

}
