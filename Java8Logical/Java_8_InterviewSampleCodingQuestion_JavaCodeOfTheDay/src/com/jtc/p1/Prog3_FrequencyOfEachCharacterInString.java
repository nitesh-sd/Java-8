package com.jtc.p1;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Prog3_FrequencyOfEachCharacterInString {

	public static void main(String[] args) {
		
	
	//List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	String str = "aaaabbbcdefgg";
	str.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(
			Function.identity(),
			Collectors.counting()
			)).forEach((character, count)-> System.out.println(character +" : " + count ));
			
	/*
	Impl Spec:The default implementation is equivalent to, for this map:  
	for (Map.Entry<K, V> entry : map.entrySet())
	     action.accept(entry.getKey(), entry.getValue());
	     
	The default implementation makes no guarantees about synchronization or atomicity 
	properties of this method. Any implementation providing atomicity 
	guarantees must override this method and document its concurrency properties.
	
	*/
	}
	
}
