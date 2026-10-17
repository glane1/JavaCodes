package ATMSimulation;

import java.util.Scanner;

public class ATMSimulation {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        int[] accountPIN = {
            1217121300,
            1217121301,
            1217121302,
            1217121303,
            1217121304,
        };
        
        double[] accountBalance = {
            100.5,
            500.89,
            1000,
            56.9,
            900.5
        };
        
        int PIN;
        int indix = 0;
        boolean haveAccess = false;
        
        System.out.println("======= ATM SIMULATION =======");
        System.out.print("Enter Your PIN : ");
        PIN = s.nextInt(); s.nextLine();
        System.out.println();
        
        for(int i = 0; i < accountPIN.length; i++) {
            if(PIN == accountPIN[i]) {
                indix = i;
                haveAccess = true;
            }
        }
        
        int choice = 0;
        
        while(haveAccess) {
            System.out.println("======== Transaction Menu ========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Balance");
            System.out.println("4. Exit");
            System.out.print("Choice : ");
            choice = s.nextInt(); s.nextLine();
            
            switch(choice) {
                case 1 -> {
                    System.out.print("Enter Amount : ");
                    double depositAmount = s.nextDouble();
                    
                    for(int i = 0; i < accountBalance.length; i++) {
                        if(indix == i) {
                            accountBalance[i] += depositAmount;
                        }
                    }
                    System.out.println();
                }
                
                case 2 -> {
                    System.out.print("Withdraw Amount : ");
                    double withdrawAmount = s.nextDouble();
                    
                    for(int i = 0; i < accountBalance.length; i++) {
                        if(indix == i) {
                            if(withdrawAmount > accountBalance[indix]) {
                                System.out.println("Insufficeint Balance!");
                            } else if(withdrawAmount <= 0) {
                                System.out.println("Withdraw Amount Should NOT Less Than Zero");
                            }else {
                                accountBalance[i] -= withdrawAmount;
                            }
                            
                        }
                    }
                    System.out.println();
                }
                
                case 3 -> {
                    System.out.println("Current Balance : " + accountBalance[indix]);
                    System.out.println();
                }
                
                case 4 -> {
                    System.out.println("Exit.");
                    haveAccess = false;
                }
            }
            
        }
        
        s.close();
    }
    
}
