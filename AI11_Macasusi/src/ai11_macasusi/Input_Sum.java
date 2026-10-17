package ai11_macasusi;

import java.util.Scanner;

public class Input_Sum {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double inputOne;
        double inputTwo;
        double sum;
        
        System.out.print("First Num: ");
        inputOne = s.nextDouble();
        
        System.out.print("Second Input: ");
        inputTwo = s.nextDouble();
        
        sum = inputOne + inputTwo;
        
        System.out.printf("Summary: %.2f + %.2f = %.3f\n",inputOne, inputTwo, sum);
        
        
        s.close();
    }
    
}
