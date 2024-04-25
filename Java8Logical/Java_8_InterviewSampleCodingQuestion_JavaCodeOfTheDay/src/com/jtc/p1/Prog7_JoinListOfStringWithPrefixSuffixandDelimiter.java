package com.jtc.p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog7_JoinListOfStringWithPrefixSuffixandDelimiter {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaa","bbb","ccc");
		
		//String collect = list.stream().collect(Collectors.joining("Delimiter", "Prefix", "Suffix"));
		String collect = list.stream().collect(Collectors.joining("|", "|", ""));
		
		System.out.println(collect);
		
	
	}
}
