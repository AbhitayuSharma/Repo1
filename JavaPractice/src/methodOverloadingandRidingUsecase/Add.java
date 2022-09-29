package methodOverloadingandRidingUsecase;

public class Add {

	public Add() {
		// TODO Auto-generated constructor stub
	}
	int Add1() {
		return 0;
	}
	int Add1(int a,int b) { //overloading
		return a+b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Add a1 = new Add();
		a1.Add1();
		a1.Add1(5,6);

	}
}
