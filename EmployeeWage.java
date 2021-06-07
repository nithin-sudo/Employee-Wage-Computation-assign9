package employeewage;

public class EmployeeWage {
	public static final int IS_FULL_PRESENT=1;
	public static void employeeAttendance()
	{
		System.out.println("Welcome to Employee Wage Problem using oops");
		double random=Math.floor(Math.random()*10)%2;
		System.out.println("random value is:"+random);
		if (random==IS_FULL_PRESENT) 
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");			
		}
	}
	public static void main(String[] args){
		EmployeeWage employeewage=new EmployeeWage();
		employeewage.employeeAttendance();
	}
}
