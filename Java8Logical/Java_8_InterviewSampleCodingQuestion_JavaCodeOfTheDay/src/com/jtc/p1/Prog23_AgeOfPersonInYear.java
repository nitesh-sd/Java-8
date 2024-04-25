package com.jtc.p1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Prog23_AgeOfPersonInYear {

//	public static void main(String[] args) {
//		System.out.println("Enter Date Of Birth");
//		Scanner sc = new Scanner(System.in);
//		 int year = sc.nextInt();
//		 int month = sc.nextInt();
//		 int day = sc.nextInt();
////		 LocalDate birthday = LocalDate.of(1992, 10, 15);
//		 LocalDate birthday = LocalDate.of(year, month, day);
//		
//		LocalDate today = LocalDate.now();
//		System.out.println(ChronoUnit.YEARS.between(birthday, today) + " Years");
//	}
	
	
	 public static void main(String[] args) {
	        System.out.println("Enter Date Of Birth (dd/mm/yyyy)");
	        Scanner sc = new Scanner(System.in);
	        String input = sc.nextLine();

	        // Parse the input date using DateTimeFormatter
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate birthday = LocalDate.parse(input, formatter);

	        LocalDate today = LocalDate.now();
	        System.out.println(ChronoUnit.YEARS.between(birthday, today) + " Years");
	    }
}
