package com.jtc.p1;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Prog16_ReverseEachWordOfA_String {
	public static void main(String[] args) {
		
	
	String str = "Hell I am Nitesh Kumar";
	
//    String reversed = Arrays.stream(str.split(""))
//            .map(input -> new StringBuilder(input).reverse()) // Corrected StringBuffer to StringBuilder
//            .map(StringBuilder::toString)
//            .collect(Collectors.joining(""));
	
	String collect = Arrays.stream(str.split("\\s+"))  // Split the string into words using whitespace as delimiter
    .map(word -> new StringBuilder(word).reverse()) // Reverse each word
    .collect(Collectors.joining(" "));
	
	System.out.println(collect);
	}
}
