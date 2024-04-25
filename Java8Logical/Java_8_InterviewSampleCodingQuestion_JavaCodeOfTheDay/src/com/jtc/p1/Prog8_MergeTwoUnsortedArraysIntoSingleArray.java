package com.jtc.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Prog8_MergeTwoUnsortedArraysIntoSingleArray {
	public static void main(String[] args) {
		
	
	
	List<Integer> list = new ArrayList<>();
	
	int a [] = {22,25,65,455,68,74};
	int b [] = {33,56,48,74,56,54,66};
	
	IntStream concat = IntStream.concat(Arrays.stream(a), Arrays.stream(b));
	concat.sorted().forEach(System.out::println);
	
	}
}
