package employeewage;

import java.util.Random;

public class EmployeeWage {
	public static final int IS_FULL_PRESENT = 1;
	public static final int IS_PART__PRESENT = 2;

	public static void employeeSalaryPerMonth(String company, int wagePerHr, int workingDays) {
		System.out.println("Welcome to Employee Wage Problem using oops");
		int fullDayWorkHr = 8, partDayWorkHr = 4, salary;
		int salaryPerMonth = 0, totalWorkingHrs = 0, i;
		for (i = 0; i < workingDays; i++) {
			Random var = new Random();
			int random;
			random = var.nextInt(3);
			switch (random) {
			case 1:
				salary = (wagePerHr * fullDayWorkHr);
				salaryPerMonth = (salaryPerMonth + salary);
				totalWorkingHrs = (totalWorkingHrs + fullDayWorkHr);
				break;
			case 2:
				salary = (wagePerHr * partDayWorkHr);
				salaryPerMonth = (salaryPerMonth + salary);
				totalWorkingHrs = (totalWorkingHrs + partDayWorkHr);
				break;
			}
			if (totalWorkingHrs == 100 || i == 20) {
				break;
			}
		}
		System.out.println("salary is credited for" + totalWorkingHrs + "hours" + i + "days for a employee in "
				+ company + " is" + salaryPerMonth);
	}

	public static void main(String[] args) {
		EmployeeWage employeewage = new EmployeeWage();
		EmployeeWage employeewagetwo = new EmployeeWage();
		employeewage.employeeSalaryPerMonth("Infosys", 8, 20);
		employeewage.employeeSalaryPerMonth("Hp", 10, 22);
	}
}
