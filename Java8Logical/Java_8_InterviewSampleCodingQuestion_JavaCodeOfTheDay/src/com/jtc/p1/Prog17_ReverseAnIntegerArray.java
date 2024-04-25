package com.jtc.p1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Prog17_ReverseAnIntegerArray {
	public static void main(String[] args) {
		
	
	//List<Integer> intArr = Arrays.asList(1,2,3,4,5,6,7,8);
	
	int arr[] = {1,2,3,4,5,6,7,8,9,10};
	int[] array = IntStream.rangeClosed(1, arr.length).map(i-> arr[arr.length-i]).toArray();
	
	  for (int num : array) {
          System.out.print(num + " ");
	}
	  
	List<Integer> intArr = Arrays.asList(1,2,3,4,5,6,7,8);
	  Collections.sort(intArr,Comparator.reverseOrder());
	  
	  System.out.println(intArr);
	  
	}
}
