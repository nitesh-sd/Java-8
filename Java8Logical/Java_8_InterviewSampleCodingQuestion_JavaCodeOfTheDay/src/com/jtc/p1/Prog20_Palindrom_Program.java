package com.jtc.p1;

import java.util.stream.IntStream;

public class Prog20_Palindrom_Program {
	public static void main(String[] args) {
		String str= "radar";
		
		boolean match = IntStream.range(0, str.length()/2)
				.noneMatch(i->str.charAt(i) != str.charAt(str.length()-i - 1));
		if(match) {
			System.out.println(str +" It is Palindrom");
		}else {
			System.out.println(str + "It is not Palindrom");
		}
		
	}

}
