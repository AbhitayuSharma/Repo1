package com;

public class PrimeNumber {
	public String sol(int a) {
		for(int i=2;i<a/2;i++) {
			if(a%i==0) {
				return "Not a Prime Number"; 
			}
		}
		return "Prime Number";
	}
}
