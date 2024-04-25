package com.jtc.p1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Prog9_AnagramProgram {

	public static void main(String[] args) {

		String str1 = "aabbccdd";
		String str2 = "ddbbaacc";

		str1 = Stream.of(str1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		str2 = Stream.of(str2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());

		if (str1.equals(str2)) {

			// or we can write str1.contains(str2)
			System.out.println(str1 + " and " + str2 + " anagram");
		} else {
			System.out.println(str1 + " and " + str2 + " are not anagram");
		}
	}

}
