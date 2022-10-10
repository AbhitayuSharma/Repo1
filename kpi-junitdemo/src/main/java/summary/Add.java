package summary;

public class Add implements AddInter{
	int a;
	int b;
	Add(){
		a=0;
		b=0;
	}
	@Override
	public int doAdd(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}
	
	int doAdd(int a,int b,int c) {
		return a+b+c;
	}
	

	
	
	
}
