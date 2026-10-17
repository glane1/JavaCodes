package EmployeePayrollSystem;

public class Employee {
    
    final double GSIS = 0.09;
    final double PhilHealth = 0.025;
    final double Pag_Ibig = 200.0;
    
    String name;
    double hourlyWage;
    int hoursWork;
    
    Employee(String name, double hourlyWage, int hoursWork) {
        this.name = name;
        this.hourlyWage = hourlyWage;
        this.hoursWork = hoursWork;
    }
    
    double grossSalary;
    double deductions;
    double taxableIncome;
    boolean haveWithHoldingTax = false;
    double withHoldingTax;
    double totalDeductions;
    double netSalary;
    
    void toDisplay() {
 
        grossSalary = (hourlyWage * hoursWork) * 30;
        
        double taxedGSIS = grossSalary * GSIS;
        double taxedPH = grossSalary * PhilHealth;
        deductions = taxedGSIS + taxedPH + Pag_Ibig;
        
        taxableIncome = grossSalary - deductions;
        if(taxableIncome >= 66668 && taxableIncome <= 166667) {
            withHoldingTax = ((taxableIncome - 66667) * 0.25) + 8541.80;
            haveWithHoldingTax = true;
        }else if(taxableIncome >= 33334 && taxableIncome <= 66667) {
            withHoldingTax = ((taxableIncome - 33333) * 0.20) + 1875;
            haveWithHoldingTax = true;
        }else if(taxableIncome >= 20834 && taxableIncome <= 33333) {
            withHoldingTax = (taxableIncome - 20834) * 0.15;
            haveWithHoldingTax = true;
        }
        
        if(taxableIncome > 20834) {
            totalDeductions = taxedGSIS + taxedPH + Pag_Ibig + withHoldingTax;
        }else {
            totalDeductions = taxedGSIS + taxedPH + Pag_Ibig;
        }
        
        netSalary = grossSalary - totalDeductions;
        
        System.out.println();
        System.out.println("======= Salary Details =======");
        System.out.println("Name          : " + name);
        System.out.println("Hourly Wage   : " + hourlyWage);
        System.out.println("Hours Work    : " + hoursWork);
        System.out.println("------------------------------");
        System.out.println("Gross Income  : " + grossSalary);
        System.out.println("GSIS          : " + taxedGSIS);
        System.out.println("PhilHealt     : " + taxedPH);
        System.out.println("Pag-Ibig      : " + Pag_Ibig);
        if(haveWithHoldingTax) {
            System.out.println("W/Holding Tax : " + withHoldingTax);
        }else {
            System.out.println("W/Holding Tax : " + "N/A");
        }
        System.out.println("Total Deduct. : " + totalDeductions);
        System.out.println("Net Salary    : " + netSalary);
        
    }
    
}
