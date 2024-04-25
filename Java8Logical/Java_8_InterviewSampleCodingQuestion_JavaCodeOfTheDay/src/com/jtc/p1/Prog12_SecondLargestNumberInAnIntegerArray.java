package com.jtc.p1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog12_SecondLargestNumberInAnIntegerArray {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 25, 45, 65, 8, 54, 66, 485, 112, 475);

		Optional<Integer> findFirst = list.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findFirst.get());

		//Array
		
		int arr1[] = { 22, 33, 55, 34, 54, 23 };

		int secondLargest = Arrays.stream(arr1).boxed() // Convert to Integer stream
				.sorted((a, b) -> b - a) // Sort in descending order
				.skip(1) // Skip the largest element
				.findFirst() // Get the first element remaining
				.orElseThrow(() -> new IllegalArgumentException("Array length is less than 2"));

		System.out.println("Second largest number: " + secondLargest);

		
		//another way
		
	      int secondLargest2 = Arrays.stream(arr1)
	                .boxed() // Convert to Integer stream
	                .sorted((a, b) -> Integer.compare(b, a)) // Sort in descending order
	                .skip(1) // Skip the largest element
	                .findFirst() // Get the first element remaining
	                .orElseThrow(() -> new IllegalArgumentException("Array length is less than 2"));

	        System.out.println("Second largest number: " + secondLargest2);
	
	        
	
	}

}
