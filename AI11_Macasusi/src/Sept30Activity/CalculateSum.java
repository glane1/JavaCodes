package Sept30Activity;

import java.util.Scanner;

public class CalculateSum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int num1;
        int num2;
        int sum;
        
        System.out.print("Enter firt number: ");
        num1 = s.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = s.nextInt();
        
        sum = num1 + num2;
        
        System.out.println("The SUM of " + num1 + " and " + num2 + " is " + sum);
        
        s.close();
    }
    
}
