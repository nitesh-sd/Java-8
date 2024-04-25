package com.jtc.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog5_SortTheListInReverseOrder {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("AAA","BBB","CCC","DDD","EEE");
		list.stream().sorted(Comparator.reverseOrder())
						.forEach(System.out::println);
	}
}
