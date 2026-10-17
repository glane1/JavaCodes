package Oct6Acitivity;

import java.util.Scanner;

public class ageStatus {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        int age;
        String ageStatus;
        
        System.out.print("Enter Your Age: ");
        age = s.nextInt();
        
        if(age >= 60) {
            ageStatus = "Senior";
        } else if(age >= 18 && age <= 59) {
            ageStatus = "Adult";
        } else if(age >= 7 && age <= 17) {
            ageStatus = "Young Adult";
        } else {
            ageStatus = "Child";
        }

        System.out.println("You're a " + ageStatus);
        
        s.close();
    }
    
}
