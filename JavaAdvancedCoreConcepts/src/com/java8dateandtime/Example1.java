package com.java8dateandtime;
 
import java.time.*;
 
 
// joda.org ->Joda Time API
public class Example1 {
 
	public static void main(String[] args) {
		/*
		LocalDate date=LocalDate.now();
		System.out.println(date);
		
		LocalTime time=LocalTime.now();
		System.out.println(time);
		*/
		
		//LocalDate
		/*
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int day=date.getDayOfMonth();
		int month=date.getMonthValue();
		int year=date.getYear();
		
		System.out.println(day+"-"+month+"-"+year);
		System.out.printf("%d-%d-%d",day,month,year);
		
		*/
		
		//LocalTime
		LocalTime time=LocalTime.now();
		//System.out.println(time);
		int hour=time.getHour();
		int min=time.getMinute();
		int sec=time.getSecond();
		int nanos=time.getNano();
		
		System.out.printf("%d:%d:%d:%d",hour,min,sec,nanos);
		
		
	}
 
}