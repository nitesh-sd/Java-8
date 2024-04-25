package com.jtc.p1;

import java.util.Arrays;
import java.util.OptionalDouble;

public class Prog15_SumAndAverageOfAllElementOfAnArray {

	public static void main(String[] args) {
		
		int arr1[] = {1,2,3,4,5,6,7,8,9};
		
		int sum = Arrays.stream(arr1).sum();
		System.out.println(sum);
		
		OptionalDouble average = Arrays.stream(arr1).average();
		
		System.out.println(average.getAsDouble());
		
	}
}
