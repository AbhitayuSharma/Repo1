package practice2;

public class Addition implements Add{

	@Override
	public void someMethod() {
		// TODO Auto-generated method stub
		System.out.println("Child Class");
		
	}
	public static void main(String a[]) {
		Addition a1 = new Addition();
		a1.add(5, 10);
		a1.someMethod();
	}

}
