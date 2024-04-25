package com.jtc.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog10_ThreeMaxAndMinNumberFromList {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,22,56,235,57,88541,111,24545);
		
		//Min 3 number
		System.out.println("Min three numbers");
		list.stream().sorted().limit(3).forEach(System.out::println);
		
		//Max 3 numbers
		System.out.println("Max three numbers");
		list.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
		
		
		
		
		
	}

}
