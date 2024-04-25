package com.jtc.p1;

import java.util.Arrays;

public class Prog14_CommonElementBetweeTwoArray {
	
	
	public static void main(String[] args) {
		int arr1[] = { 1, 22, 44, 55, 88, 99 };
		int arr2[] = { 22, 56, 77, 88, 45, 88,67 };

		//Core Code
		System.out.println("Core code output");
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
					continue;
				} 

			}
			
			

		}
		
		//String matcching
		String str1[] = {"aa", "bb","cc","dd"};
		String str2[] = {"ee","ff", "cc", "gg","cc"};
		
		Arrays.stream(str1).distinct().filter(x-> Arrays.stream(str2).anyMatch(y->y==x)).forEach(System.out::println);		

		System.out.println("**************************");
		Arrays.stream(str1).distinct().filter(x-> Arrays.stream(str2).allMatch(y->y==x)).forEach(System.out::println);		
	
		
		//Java 8 Code
		//integer matching
		System.out.println("Java 8 code");
		
		   Arrays.stream(arr1)
           .distinct()
           .filter(x -> Arrays.stream(arr2).anyMatch(y -> y == x))
           .forEach(System.out::println);
		
	}

}
