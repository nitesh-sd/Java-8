package com.jtc.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog13_SortListOfString_In_IncreasingOrderOfTheirLength {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("aa","ffxx","rrxxxx","ss","jj","ww","oo","vv");
		
		list.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
	}

}
