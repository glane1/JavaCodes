package Sept25Activity;

import java.util.Scanner;

public class RevisedEmployeeSlipInput {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String employeeName;
        int numHours,sssCont,philhealth,houseLoan;
        int rateHour = 500;
        double taxRate = 0.10;
        
        System.out.print("Employee Name: ");
        employeeName = s.nextLine();
        
        System.out.print("Enter number of hours: ");
        numHours = s.nextInt();
        
        System.out.print("Enter SSS Contribution: ");
        sssCont = s.nextInt();
        
        System.out.print("Enter PhilHealth Contribution: ");
        philhealth = s.nextInt();
        
        System.out.print("Enter House Loan Amount: ");
        houseLoan = s.nextInt();
        
        double grossSalary = numHours * rateHour;
        double tax = grossSalary * taxRate;
        double totalDeduc = sssCont + philhealth + houseLoan + tax;
        double netSalary = grossSalary - totalDeduc;
        
        System.out.println();
        System.out.println("===============PAYSLIP================");
        System.out.println("=========EMPLOYEE INFORMATION=========");
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Rendered Hours: " + numHours);
        System.out.println("Rate per Hour : " + rateHour);
        System.out.printf("Gross Salary  : %.1f\n",grossSalary);
        
        System.out.println("==============DEDUCTIONS==============");
        System.out.println("SSS: " + sssCont);
        System.out.println("PhilHealth: " + philhealth);
        System.out.println("Other Loan: " + houseLoan);
        System.out.printf("Tax: %.1f\n", tax);
        System.out.printf("Total Deductions: %.1f\n", totalDeduc);
        
        System.out.println("\nNet Salary: " + netSalary);
        
        
        
        s.close();
    }
    
}
