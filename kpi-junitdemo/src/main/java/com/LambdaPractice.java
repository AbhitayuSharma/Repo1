package com;

public class LambdaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LambdaPractice tester = new LambdaPractice();
		
		MathOperation addition = (int a,int b) -> a + b;
		
		MathOperation substraction = (int a,int b) -> a - b;

		MathOperation multiplication = (a,b) -> {return a*b;};
		
		MathOperation division = (a,b) -> a/b;
		
		System.out.println(tester.operate(10,5,addition));
		System.out.println(tester.operate(10,5,substraction));
		System.out.println(tester.operate(10,5,multiplication));
		System.out.println(tester.operate(10,5,division));
			
	}
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	}


}
