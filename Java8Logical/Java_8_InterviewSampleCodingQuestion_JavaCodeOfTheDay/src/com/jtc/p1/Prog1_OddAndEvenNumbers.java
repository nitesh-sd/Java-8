package com.jtc.p1;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog1_OddAndEvenNumbers {
	public static void main(String[] args) {

		List<Integer> listOfInteger = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		Map<Boolean, List<Integer>> collect = listOfInteger.stream().collect(Collectors.partitioningBy(i -> i % 2 == 0));
		
		 System.out.println("Even Numbers: " + collect.get(true));
	     System.out.println("Odd Numbers: " + collect.get(false));
	     
	     
	     //Another way 
	     System.out.println("Even numbers are :");
	     listOfInteger.stream().filter(n -> n%2 ==0).forEach(a -> System.out.println(a));
	     System.out.println("\n Odd numbers are :");
	     listOfInteger.stream().filter(n -> n%2 !=0).forEach(a -> System.out.println(a));
	     
		
	
	}
}
