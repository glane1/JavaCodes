package BankLoanEvaluation;

import java.util.Scanner;

public class BankLoanEvaluation {

    public static void main(String[] args) {

        // won't try this for the mean time because there's some features for this program that i don't know yet I will deg deeper it for the following days so that I can create this program, thank you

        Scanner s = new Scanner(System.in);
        
        double income;
        double expenses;
        String status;
        double loan;
        
        System.out.print("Enter Monthly Income  : ");
        income = s.nextDouble();
        
        System.out.print("Enter Monthly Expenses: ");
        expenses = s.nextDouble(); s.nextLine();
        
        System.out.print("Enter Employment Status\n [Permanent/Contractual/Unemployed]: ");
        status = s.nextLine().toLowerCase();
        
        System.out.print("Enter Requested Loan Amount: ");
        loan = s.nextDouble();
        
        double dispossableIncome = income - expenses;
        String result;
        
        if(status.equals("unemployed") || dispossableIncome < 3000 || loan > income * 10){
            
            result = "REJECTED!";
            
        }else if(status.equals("permanent") || dispossableIncome >= 8000 || loan <= income * 5) {
            
            result = "APPROVED!";
            
        }else {
            
            result = "CONDITIONALLY APPROVED!";
            
        }
        
        System.out.println("\n==== EVALUATION RESULT ====");
        System.out.println("Disposable Income: " + dispossableIncome);
        System.out.println("Decision: " + result);
        
        s.close();
    }
    
}
