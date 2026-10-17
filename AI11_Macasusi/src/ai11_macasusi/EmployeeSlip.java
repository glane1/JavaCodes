package ai11_macasusi;

public class EmployeeSlip {

    public static void main(String[] args) {
        
        String name = "Glenn Jeff Macasusi";
        int numberHours = 10;
        int sssContribution = 100;
        int philHealth = 100;
        int housingLoan = 100;
        int ratePerHour = 500;
        double taxRate = 0.10;
        
        double grossSalary = numberHours * ratePerHour;
        double tax = grossSalary * taxRate;
        double totalDeduction = sssContribution + philHealth + housingLoan + tax;
        double netSalary = grossSalary - totalDeduction;
        
        System.out.println("Employee Name: " + name);
        System.out.println("Enter number of hours: " + numberHours);
        System.out.println("SSS Contribution: " + sssContribution);
        System.out.println("Phil Health: " + philHealth);
        System.out.println("Housing Loan: " + housingLoan);
        
        System.out.println("===============PAYSLIP================");
        System.out.println("=========EMPLOYEE INFORMATION=========");
        System.out.println("Employee Name : " + name);
        System.out.println("Rendered Hours: " + numberHours);
        System.out.println("Rate per Hour : " + ratePerHour);
        System.out.printf("Gross Salary  : %.1f\n",grossSalary);
        
        System.out.println("==============DEDUCTIONS==============");
        System.out.println("SSS: " + sssContribution);
        System.out.println("PhilHealth: " + philHealth);
        System.out.println("Other Loan: " + housingLoan);
        System.out.printf("Tax: %.1f\n", tax);
        System.out.printf("Total Deductions: %.1f\n", totalDeduction);
        
        System.out.println("\nNet Salary: " + netSalary);
        
    }
    
}
