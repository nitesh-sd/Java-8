package Com.test.java8;

import java.util.Arrays;

public class FindTheLargestStringFromGivenArray {
	public static void main(String[] args) {

		String[] strArray = { "Java", "Technical", "Springboot", "Interesting" };
		String longStr = Arrays.stream(strArray)
				.reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2).orElse(null);

		System.out.println("Longest string: " + longStr);
	}
}
