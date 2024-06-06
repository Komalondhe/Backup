package com.java8dateandtime;
 
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
 
public class TemporalAdjusterExample {
	public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today: " + today);
 
        // Find the first day of the current month
        LocalDate firstDayOfMonth = today.with(TemporalAdjusters.firstDayOfMonth());
        System.out.println("First day of this month: " + firstDayOfMonth);
 
        // Find the next Monday
        LocalDate nextMonday = today.with(TemporalAdjusters.next(DayOfWeek.MONDAY));
        System.out.println("Next Monday: " + nextMonday);
 
        // Find the last day of the current month
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of this month: " + lastDayOfMonth);
    }
}
