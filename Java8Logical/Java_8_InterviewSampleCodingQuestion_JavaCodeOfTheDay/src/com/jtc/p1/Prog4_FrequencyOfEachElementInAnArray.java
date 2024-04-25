package com.jtc.p1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog4_FrequencyOfEachElementInAnArray {
	public static void main(String[] args) {
		
		List<Integer> frequencyOfEachElement = Arrays.asList(1,2,3,4,5,5,6,6,7,8);
		
		frequencyOfEachElement.stream()
					.collect(Collectors
							.groupingBy(Function
									.identity(),Collectors
									.counting()))
					.forEach((a,b) -> System.out.println(a + " : " + b));
	}

}
