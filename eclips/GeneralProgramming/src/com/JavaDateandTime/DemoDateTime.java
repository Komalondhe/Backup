package com.JavaDateandTime;

import java.time.*;

public class DemoDateTime {

	public static void main(String[] args) {
		/*
		LocalDate date=LocalDate.now();
		System.out.println(date);
		LocalTime time=LocalTime.now();
		System.out.println(time);
		*/
		LocalDate date=LocalDate.now();
		DayOfWeek day=date.getDayOfWeek();
		int month=date.getDayOfMonth();
		Month mon2=date.getMonth();
		int year=date.getYear();
		System.out.println(day+"-"+month+"-"+mon2+"-"+year);
		/*LocalTime time=LocalTime.now();
		System.out.printf("%d-%d-%d");*/
		

	}

}
