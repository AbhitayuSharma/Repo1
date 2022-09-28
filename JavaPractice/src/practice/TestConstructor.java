package practice;

public class TestConstructor {

	public TestConstructor() {
		// TODO Auto-generated constructor stub
		int noOfLegs = 2;
	}
	public TestConstructor(int wings,boolean fly) {
		if(wings==2) {
			fly=true;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
