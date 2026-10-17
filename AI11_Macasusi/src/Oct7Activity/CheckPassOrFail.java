package Oct7Activity;

import java.util.Scanner;

public class CheckPassOrFail {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        //2.
        System.out.print("Enter your english grade: ");
        int english = s.nextInt();
        
        System.out.print("Enter your science grade: ");
        int science = s.nextInt();
        
        System.out.print("Enter your math grade: ");
        int math = s.nextInt();
        
        int average = (english + science + math) / 3;
        
        if(average >= 75) {
            System.out.println("pass!");
        }else {
            System.out.println("failed");
        }
        
        
        
    }
    
}
