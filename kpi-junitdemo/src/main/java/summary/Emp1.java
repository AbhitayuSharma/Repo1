package summary;

public class Emp1 implements EmpInter{
	int emp;
	String name;
	int sal;
	@Override
	public void empId(int a) {
		// TODO Auto-generated method stub
		emp=a;
	}

	@Override
	public void name(String n) {
		// TODO Auto-generated method stub
		name=n;
	}

	@Override
	public void Salary(int s) {
		// TODO Auto-generated method stub
		sal=s;
	}
	void getData() {
		System.out.println("Employee Id is "+emp);
		System.out.println("Name is "+name);
		System.out.println("Salary is "+sal);
	}
	public static void main(String []args) {
		Emp1 e = new Emp1();
		e.empId(101);
		e.name("Abhi");
		e.Salary(700000);
		e.getData();
	}

}
