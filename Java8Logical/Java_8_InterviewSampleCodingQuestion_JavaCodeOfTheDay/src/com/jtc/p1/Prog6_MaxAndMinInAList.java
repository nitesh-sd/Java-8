package com.jtc.p1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Prog6_MaxAndMinInAList {
	public static void main(String[] args) {
		
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,66);
		System.out.println("Max Value");
		Integer integer = list.stream().max(Comparator.naturalOrder()).get();
		System.out.println(integer);
		
		
		System.out.println("Min Value");
		Integer integer2 = list.stream().min(Comparator.naturalOrder()).get();
		System.out.println(integer2);
		
		
	}

}
