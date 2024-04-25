package Com.test.java8;

import java.util.Arrays;
import java.util.List;

public class StringJoinMethod {

	public static void main(String[] args) {
		List<String> nos = Arrays.asList("1","2","3","4");
		String result = String.join(",", nos);
		System.out.println(result);

	}

}
