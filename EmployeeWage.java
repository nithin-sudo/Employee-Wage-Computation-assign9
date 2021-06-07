package employeewage;

public class EmployeeWage {
	public static final int IS_FULL_PRESENT = 1;

	public static void employeeAttendance() {
		System.out.println("Welcome to Employee Wage Problem using oops");
		int wage_per_hr = 20;
		int full_day_work_hr = 8;
		int salary;
		double random = Math.floor(Math.random() * 10) % 2;
		System.out.println("random value is:" + random);
		if (random == IS_FULL_PRESENT) {
			System.out.println("employee is present");
			salary = (wage_per_hr * full_day_work_hr);
			System.out.println(salary);
		} else {
			System.out.println("when employee is absent for the day his salary is zero");
		}
	}

	public static void main(String[] args) {
		EmployeeWage employeewage = new EmployeeWage();
		employeewage.employeeAttendance();
	}
}
