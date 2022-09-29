package practice2;

import java.util.Scanner;

public class InputProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First Number");
		int a = sc.nextInt();
		System.out.println("Enter Second Number");
		int b = sc.nextInt();
		System.out.println("Enter Third Number");
		int c = sc.nextInt();
		int d = a+b+c;
		System.out.println("Sum is "+d);
	}

}
