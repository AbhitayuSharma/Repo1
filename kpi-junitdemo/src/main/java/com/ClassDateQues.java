package com;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class ClassDateQues {

	public static void Datespeci() {

		LocalDate date = LocalDate.of(1922, 01, 26);
		System.out.println("Detail of Date "+date);
		
		LocalDate date2 = LocalDate.now();
		LocalDate year = date2.plus(8,ChronoUnit.YEARS);
		System.out.println("On This day but From 2030: "+year);
		
		LocalDate d1 = LocalDate.now();
		LocalDate somedate = d1.withDayOfMonth(7).withYear(2030).withMonth(10);
		LocalDate dayon = somedate.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
		
		System.out.println(dayon);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datespeci();
	}

}
