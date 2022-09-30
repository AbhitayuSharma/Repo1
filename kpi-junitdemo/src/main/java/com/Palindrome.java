package com;

public class Palindrome {
	String palindrome (int n) {
		int temp=n;
		int sum=0,rem;
		while(temp>0) {
			rem=temp%10;
			sum=(sum*10)+rem;
			temp=temp/10;
		}
		if(n==sum) {
			return "Palindrome";
		}
		else {
			return "Not a Palindrome";
		}
		
	}
}
