package Oct7Activity;

import java.util.Scanner;

public class CheckIfcanVote {

    public static void main(String[] args) {
        
        //1.
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = s.nextInt();
        
        if(age >= 18) {
            System.out.println("You can vote!");
        } else {
            System.out.println("You can not vote yet!");
        }
        
        s.close();
    }
    
}
