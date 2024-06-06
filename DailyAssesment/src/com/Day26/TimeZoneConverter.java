package com.Day26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeZoneConverter {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-mm-dd");
		System.out.println("Enter the date-time(yyyy-mm-dd hh:mm):");
		String datetimeString=scanner.nextLine();
		LocalDateTime localDateTime=LocalDateTime.parse(datetimeString,formatter);
		
		System.out.println("Enter the sourse time zone");
		String sourceTimezoneString=scanner.nextLine();
		ZoneId sourceZoneId=ZoneId.of(sourceTimezoneString);
		
		System.out.println("Enter the target time zone");
		String TargetTimezoneString=scanner.nextLine();
		ZoneId TargetZoneId=ZoneId.of(TargetTimezoneString);
		
		ZonedDateTime sourceDateTime=ZonedDateTime.of(localDateTime, sourceZoneId);
		
		ZonedDateTime targetZonedDateTime=sourceDateTime.withZoneSameInstant(TargetZoneId);
		
		
		String formattedTargetDateTimeString=targetZonedDateTime.format(formatter);
		System.out.println("Convert date time into targeted zone:"+formattedTargetDateTimeString);
		

	}

}
