package employeewage;

public class EmployeeWage {
	public static final int IS_FULL_PRESENT = 1;
	public static final int IS_PART__PRESENT = 2;
	public static void employeeAttendance() {
		System.out.println("Welcome to Employee Wage Problem using oops");
		int wage_per_hr = 20;
		int full_day_work_hr = 8;
		int part_day_work_hr = 4;
		int salary;
		double random = Math.floor(Math.random() * 10) % 3;
		System.out.println("random value is:" + random);
		if (random == IS_FULL_PRESENT) {
			System.out.println("employee is present");
			salary = (wage_per_hr * full_day_work_hr);
			System.out.println("salary is:" + salary);
		} else if (random == IS_PART__PRESENT) {
			salary = (wage_per_hr * part_day_work_hr);
			System.out.println("salary is :" + salary);
			System.out.println("employee is part time present");
		} else {
			System.out.println("when employee is absent for the day his salary is zero");
		}
	}

	public static void main(String[] args) {
		EmployeeWage employeewage = new EmployeeWage();
		employeewage.employeeAttendance();
	}
}
