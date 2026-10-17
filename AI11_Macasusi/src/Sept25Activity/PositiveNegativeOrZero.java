package Sept25Activity;

import java.util.Scanner;

public class PositiveNegativeOrZero {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         
        int inputNumber;
        String status;
        
        System.out.print("Enter any Number: ");
        inputNumber = s.nextInt();
        
        if(inputNumber > 0) {
            status = "POSITIVE";
        } else if(inputNumber < 0) {
            status = "NEGATIVE";
        } else {
            status = "ZERO";
        }
        
        System.out.println("The Number " + inputNumber + " is " + status);
        
        s.close();
    }
    
}
