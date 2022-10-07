package com;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Chrono {
	
	public static void checkingChronoEnum(){
		LocalDate date = LocalDate.now();
		System.out.println("Current Date is "+date);
		
		LocalDate year = date.plus(2,ChronoUnit.YEARS);
		System.out.println("Next to Next Year is: "+year);
		
		LocalDate nextmonth = date.plus(1,ChronoUnit.MONTHS);
		System.out.println("Next Month is "+nextmonth);
		
		LocalDate nextweek = date.plus(1,ChronoUnit.WEEKS);
		System.out.println("Next Week is "+nextweek);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		checkingChronoEnum();
	}

}
