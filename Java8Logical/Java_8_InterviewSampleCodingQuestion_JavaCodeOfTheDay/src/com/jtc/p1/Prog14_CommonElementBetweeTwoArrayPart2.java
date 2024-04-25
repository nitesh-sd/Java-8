package com.jtc.p1;

import java.util.Arrays;
import java.util.List;

public class Prog14_CommonElementBetweeTwoArrayPart2 {

	public static void main(String[] args) {

		List<Integer> list1 = Arrays.asList(22, 33, 44, 55, 33, 77);
		List<Integer> list2 = Arrays.asList(11, 33, 44, 55, 88, 77);
		
		//first method
		System.out.println("First method");
		list1.stream().distinct().filter(x -> list2.stream().anyMatch(y -> y ==x)).forEach(System.out::println);
		
		//second method
		System.out.println("Second method");
		list1.stream().filter(list2::contains).forEach(x-> System.out.println(x));
	
	}

}
