package summary;

public class Employee implements SalaryInter, LeaveInter {
	int salary;
	int bonusv;
	int leave;
	Employee(){
		leave=0;
		bonusv = 0;
	}

	@Override
	public void leave(int l) {
		// TODO Auto-generated method stub
		leave+=l;
	}

	@Override
	public void sal(int s) {
		// TODO Auto-generated method stub
		salary = s+bonusv;
	}
	@Override
	public void bonus(int b) {
		// TODO Auto-generated method stub
		bonusv = b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee();
		emp.bonus(1000);
		emp.sal(700000);
		System.out.println(emp.salary);
	}

	


}
