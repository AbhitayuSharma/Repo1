package com;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class Date {
	public static void LocalDateTimeApi() {
		LocalDate date = LocalDate.now();
		System.out.println("The Current Date is "+date);
		
		LocalTime time = LocalTime.now();
		System.out.println("The Current Time is "+time);
		
		LocalDateTime current = LocalDateTime.now();
		System.out.println("Current Date and Time "+current);
		
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formatedDateTime = current.format(format);
		System.out.println("In Formated Manner"+formatedDateTime);
		
		Month month = current.getMonth();
		int day = current.getDayOfMonth();
		int seconds = current.getSecond();
		int hour = current.getHour();
		int year = current.getYear();
		System.out.println("Month "+month+" Day "+day+" Seconds: "+seconds+" Hour "+hour+" Year "+year);
		
		
		LocalDate date2 = LocalDate.of(1950, 1, 26);
		System.out.println("The Rublic Day: "+date2);
		
		LocalDateTime specificDate = current.withDayOfMonth(24).withYear(2016);
		
		System.out.println("Specific date with Current time: "+specificDate);
	}
	public static void main(String a[]) {
		LocalDateTimeApi();
	}
}
