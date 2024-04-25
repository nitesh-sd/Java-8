package com.jtc.p1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Prog21_FIndDuplicateElementFromAnArray {
	public static void main(String[] args) {
		
	
	List<Integer> list = Arrays.asList(1,2,2,3,6,5,4,4,5,6,6);
	
	Set<Integer> set = new HashSet<>();
	Set<Integer> collect = list.stream().filter(i->!set.add(i)).collect(Collectors.toSet());
	
	System.out.println(collect);
	
	
	//In case of array
	int[] arr = {1,2,3,4,5,6,7,8,8,9,9,5,5,2};
	
	Set<Integer> set2 = new HashSet<>();
	
	Set<Integer> collect2 = Arrays.stream(arr).boxed().filter(i->!set2.add(i)).collect(Collectors.toSet());
	
	System.out.println(collect2);
	
	
	}
}
