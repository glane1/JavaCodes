package Oct7Activity;

import java.util.Scanner;

public class CheckCredintials {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //2.
        String userName = "admin";
        String pass = "pass";
        

        System.out.print("Enter Username: ");
        String inputName = s.nextLine();

        System.out.print("Enter Password: ");
        String inputPass = s.nextLine();

        if(inputName.equals(userName) && inputPass.equals(pass)) {
            System.out.println("Logged In");
        } else {
            System.out.println("Invalid Credintials, Try Again.");
        }
        
        
        
    }
    
}
