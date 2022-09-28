package methodOverloadingandRidingUsecase;

public class Implementruntime extends Runtimepolymorphism {

	public Implementruntime() {
		// TODO Auto-generated constructor stub
	}
	void someMethod() {
		System.out.println("Child");  //overriding
	}
	public static void main(String a[]) {
		Implementruntime i = new Implementruntime();
		i.someMethod();
	}
}
