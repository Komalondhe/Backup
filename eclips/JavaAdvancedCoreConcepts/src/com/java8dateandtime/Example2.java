package com.java8dateandtime;
 
import java.time.LocalDateTime;
import java.time.Month;
 
public class Example2 {
	public static void main(String[] args) {
		LocalDateTime dt=LocalDateTime.now();
		//System.out.println(dt);
		int d=dt.getDayOfMonth();
		int m=dt.getMonthValue();
		int y=dt.getYear();
		//System.out.printf("%d-%d-%d",d,m,y);
		//System.out.println();
		int h=dt.getHour();
		int mi=dt.getMinute();
		int s=dt.getSecond();
		int n=dt.getNano();
		//System.out.printf("%d:%d:%d:%d",h,mi,s,n);
		//LocalDateTime.of(yy,mm,dd,h,m,s,n);
		LocalDateTime dt1=LocalDateTime.of(1993,Month.JUNE,03,8,32);
		System.out.println("After 6 months "+dt1.plusMonths(5));
		System.out.println("After 6 months "+dt1.minusMonths(5));
}
}