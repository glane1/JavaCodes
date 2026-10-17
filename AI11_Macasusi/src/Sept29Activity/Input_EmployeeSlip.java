package Sept29Activity;

import java.util.Scanner;

public class Input_EmployeeSlip {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String name;
        int numberHours; 
        int sssContribution; 
        int philHealth; 
        int housingLoan; 
        int ratePerHour = 500;
        double taxRate = 0.10;
        
        System.out.print("Employee Name: ");
        name = s.nextLine();
        
        System.out.print("Enter number of hours: ");
        numberHours = s.nextInt();
        
        System.out.print("SSS Contribution: ");
        sssContribution = s.nextInt();
        
        System.out.print("Phil Health: ");
        philHealth = s.nextInt();
        
        System.out.print("Housing Loan: ");
        housingLoan = s.nextInt();
        
        double grossSalary = numberHours * ratePerHour;
        double tax = grossSalary * taxRate;
        double totalDeduction = sssContribution + philHealth + housingLoan + tax;
        double netSalary = grossSalary - totalDeduction;
        
        System.out.println();
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
        
        s.close();
    }
    
}
