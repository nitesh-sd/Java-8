package com.jtc.p1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog11_SumOfALlDigitsOfANumber {
	
	public static void main(String[] args) {
		
	int a = 344565;
	
	Integer collect = Stream.of(String.valueOf(a).split("")).collect(Collectors.summingInt(Integer::parseInt));
	
	System.out.println(collect);
	
	}

}
