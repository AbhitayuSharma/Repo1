package summary;

public class Calculator extends Add{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int ans = c.doAdd(5, 5);
		int ans2 = c.doAdd(6, 7, 8);
		System.out.println("Addition of 2 No."+ans);
		System.out.println("Addition of 3 No."+ans2);
	}

}
