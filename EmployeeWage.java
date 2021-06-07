package employeewage;

public class EmployeeWage {
	public static final int IS_FULL_PRESENT = 1;
	public static final int IS_PART__PRESENT = 2;

	public static void employeeSalaryPerMonth() {
		System.out.println("Welcome to Employee Wage Problem using oops");
		int wage_per_hr=20;
		int full_day_work_hr=8; 
		int part_day_work_hr=4; 
		int salary;
		int workingDays=20;
		int salaryPerMonth=0;
		for (int i=1;i<workingDays;i++)
		{
			double random= Math.floor(Math.random()*10)%2;
			if (IS_FULL_PRESENT==random)
			{
				salary=(wage_per_hr*full_day_work_hr);
				salaryPerMonth=(salaryPerMonth+salary);
			}
			else if (IS_PART__PRESENT==random)
			{
				salary=(wage_per_hr*part_day_work_hr);
				salaryPerMonth=(salaryPerMonth+salary);
			}
		}
		System.out.println("salary per month is"+salaryPerMonth);				
}

	public static void main(String[] args) {
		EmployeeWage employeewage = new EmployeeWage();
		employeewage.employeeSalaryPerMonth();
	}
}
