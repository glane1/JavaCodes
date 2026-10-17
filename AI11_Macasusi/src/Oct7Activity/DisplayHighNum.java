package Oct7Activity;

import java.util.Scanner;

public class DisplayHighNum {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //2.
        System.out.print("Enter first Number: ");
        int numOne = s.nextInt();
        
        System.out.print("Enter second Number: ");
        int numTwo = s.nextInt();
        
        System.out.print("Enter third Number: ");
        int numThree = s.nextInt();
        
        int highNum =  0;
        
        if(numOne > numTwo && numOne > numThree) {
            highNum = numOne;
        }else if(numTwo > numOne && numTwo > numThree) {
            highNum = numTwo;
        }else if(numThree > numOne && numThree > numTwo) {
            highNum = numThree;
        }
        
        System.out.println("Highest Number: " + highNum);
        
    }
    
}
