package transportQuestion;

public class Bus extends Truck{

	@Override
	String type() {
		// TODO Auto-generated method stub
		return "Bus";
	}

	@Override
	String number() {
		// TODO Auto-generated method stub
		return "D1234";
	}

	@Override
	int passengers() {
		// TODO Auto-generated method stub
		return 50;
	}

}
