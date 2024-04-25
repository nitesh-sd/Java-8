package com.jtc.p1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Prog2_RemoveDuplicatFromList {
	public static void main(String[] args) {
		
		List<Integer> listOfString = Arrays.asList(1,2,3,3,4,4,5,6,7,8,8,9,10);
		
		List<Integer> collect = listOfString.stream().distinct().collect(Collectors.toList());
		
		System.out.println(collect);
		
		
		//Another way
		listOfString.stream().distinct().forEach(System.out::println);;
		
		
	}

}
