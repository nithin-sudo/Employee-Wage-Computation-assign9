package employeewage;

import java.util.Random;

public class EmployeeWage {
	public static final int IS_FULL_PRESENT = 1;
	public static final int IS_PART__PRESENT = 2;

	public static void employeeSalaryPerMonth() {
		System.out.println("Welcome to Employee Wage Problem using oops");
		int wage_per_hr=20;
		int fullDayWorkHr=8; 
		int partDayWorkHr=4; 
		int salary;
		int workingDays=20;
		int salaryPerMonth=0;
		int totalWorkingHrs=0;
		int i;
		  for (i=0;i<workingDays;i++)
		  {
				Random var = new Random();
				int random;
				random=var.nextInt(3);
				switch(random) {
				case 1:
					salary=(wage_per_hr*fullDayWorkHr);
					salaryPerMonth=(salaryPerMonth+salary);
					totalWorkingHrs=(totalWorkingHrs+fullDayWorkHr);
					break;
				case 2:
					salary=(wage_per_hr*partDayWorkHr);
					salaryPerMonth=(salaryPerMonth+salary);
					totalWorkingHrs=(totalWorkingHrs+partDayWorkHr);
					break;
			  }
				if (totalWorkingHrs==100 || i==20)
				{
					break;
				}
			}
		System.out.println("salary is credited for" +totalWorkingHrs+ "hours"  +i+ "days"+salaryPerMonth);			
}

	public static void main(String[] args) {
		EmployeeWage.employeeSalaryPerMonth();
	}
}
