package com.jtc.p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Prog19_FindStringWhichStartWIthNumberInListOfString {
	public static void main(String[] args) {
		
		List<String> listOfString = Arrays.asList("aaa","bbb","5rrr","gggg","77yyy","33yy");
		
		listOfString.stream()
					.filter(str->Character
							.isDigit(str.charAt(0)))
					.forEach(System.out::println);
	}

}
