package com.jtc.p1;

import java.util.stream.IntStream;

public class Prog18_SumOfFirst10NaturalNumbers {
	
	public static void main(String[] args) {
		int sum = IntStream.range(1, 11).sum();
		System.out.println(sum);
	}

}
