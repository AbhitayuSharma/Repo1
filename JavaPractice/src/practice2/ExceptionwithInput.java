package practice2;

import java.util.Scanner;

public class ExceptionwithInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a,b,c;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter First Number");
//		a=sc.nextInt();
//		System.out.println("Enter Second Number");
//		b=sc.nextInt();
//		try {
//			c=a/b;
//			System.out.println(c);
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
		try(Scanner sc = new Scanner(System.in);
			Scanner sc1 = new Scanner(System.in);
				Scanner sc2 = new Scanner(System.in)){
			System.out.println(sc.nextInt()+sc1.nextInt()+sc2.nextInt());
			
		}
		catch(Exception e) {
			
		}
	}

}
