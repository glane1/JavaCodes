package EmployeePayrollSystem;

import java.util.Scanner;

public class EmployeePayrollSystem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        Employee employees;
        
        String name;
        double hourlyWage;
        int hoursWork;
        
        System.out.println("==== Employee Payroll System ====");
        System.out.println();
        
        System.out.print("Employee Name : ");
        name = s.nextLine();
        
        System.out.print("Hourly Wage   : ");
        hourlyWage = s.nextDouble();
        
        System.out.print("Hours Work    :");
        hoursWork = s.nextInt(); s.nextLine();
        
        employees = new Employee(name, hourlyWage,hoursWork);
        
        employees.toDisplay();
        
        s.close();
    }
    
}
