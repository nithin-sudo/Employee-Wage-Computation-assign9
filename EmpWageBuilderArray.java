package empcode;
public class EmpWageBuilderArray {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpwageArray;
        public EmpWageBuilderArray(){
           companyEmpwageArray = new CompanyEmpWage[5];
        }
        private void addCompanyEmpWage(String company, int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {
            companyEmpwageArray[numOfCompany] = new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays, maxHoursPerMonth);
            numOfCompany++;
        }
        private void computeEmpWage() {
            for (int i = 0; i < numOfCompany; i++) {
                companyEmpwageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpwageArray[i]));
                System.out.println(companyEmpwageArray[i]);
            }
        }
            private int computeEmpWage(CompanyEmpWage companyEmpWage){
                int empHrs = 0, totalEmpHrs = 0, totalworkingDays = 0;
                while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalworkingDays < companyEmpWage.numOfWorkingDays) {
                    totalworkingDays++;
                    int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                    switch (empCheck) {
                        case IS_PART_TIME:
                            empHrs = 4;
                            break;
                        case IS_FULL_TIME:
                            empHrs = 8;
                            break;
                        default:
                            empHrs = 0;
                    }
                    totalEmpHrs += empHrs;
                    System.out.println("Day#: " + totalworkingDays + " Emp Hr: " + empHrs);
                }
                return totalEmpHrs * companyEmpWage.empRatePerHour;
            }
            public static void main (String[]args){
                EmpWageBuilderArray empwageBuilder = new EmpWageBuilderArray();
                empwageBuilder.addCompanyEmpWage("DMart", 20, 2, 10);
                empwageBuilder.addCompanyEmpWage("Reliance", 10, 4, 20);
                empwageBuilder.computeEmpWage();
            }
        }
