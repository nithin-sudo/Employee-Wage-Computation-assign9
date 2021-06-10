package empcode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage {
    public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME=2;

    private int numOfCompany = 0;
    private LinkedList<CompanyEmpWage> companyEmpWageList;
    private Map<String,CompanyEmpWage> companyToEmpWageMap;

    public EmpWageBuilder() {
        companyEmpWageList = new LinkedList<>();
        companyToEmpWageMap = new HashMap<>();
    }

    public void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays,maxHoursPerMonth);

        companyEmpWageList.add(companyEmpWage);
        companyToEmpWageMap.put(company, companyEmpWage);
    }

    public void computeEmpWage() {
        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println(companyEmpWage);
        }
    }

    @Override
    public int getTotalWage(String company) {
        return companyToEmpWageMap.get(company).totalEmpWage;
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
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

    public static void main(String[] args) {
        IComputeEmpWage empWageBuilder = new EmpWageBuilder();
        empWageBuilder.addCompanyEmpWage("Dmart", 20, 2, 18);
        empWageBuilder.addCompanyEmpWage("Reliance",10,4,20);
        empWageBuilder.computeEmpWage();
        System.out.println("Total Wage for Dmart Company:" + empWageBuilder.getTotalWage("Dmart"));
    }
}
