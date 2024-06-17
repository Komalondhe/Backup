package com.Day26;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DayBetwwenDates {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd");
		System.out.println("Enter the first date(yyyy-mm-dd):");
		String firstDateString=scanner.nextLine();
		LocalDate firstDate=LocalDate.parse(firstDateString,formatter);
		System.out.println("Enter the second date(yyyy-mm-dd):");
		String secondDateString=scanner.nextLine();
		LocalDate secondDate=LocalDate.parse(secondDateString,formatter);
		 long daysBetween=ChronoUnit.DAYS.between(firstDate, secondDate);
		 System.out.println("Number of days between"+firstDate+"and"+secondDate+":"+daysBetween);
				

	}

}
