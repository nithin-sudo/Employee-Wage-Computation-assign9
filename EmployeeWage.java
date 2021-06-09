package empcode;
import java.util.Random;
public class EmployeeWage {
        public static final int IS_FULL_PRESENT = 1;
        public static final int IS_PART__PRESENT = 2;


        private static int wagePerHr;
        private static int workingDays;

        /**
         * initialsing variables using constructor
         * @param wagePerHr
         * @param workingDays
         */
        public EmployeeWage(int wagePerHr,int workingDays){
            this.wagePerHr=wagePerHr;
            this.workingDays=workingDays;
        }

        /**
         * calculating total wage of an employee for multiple companies
         * @param company
         */
        public static void employeeSalaryPerMonth(String company) {
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

        /**
         * calling functions from main method
         * @param args
         */
        public static void main(String[] args) {
            EmployeeWage infosys= new EmployeeWage(8, 20);
            EmployeeWage hp = new EmployeeWage( 10, 22);
            infosys.employeeSalaryPerMonth("infosys");
            hp.employeeSalaryPerMonth("hp");
        }


    }
