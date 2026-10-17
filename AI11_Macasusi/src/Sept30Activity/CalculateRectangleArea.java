package Sept30Activity;

import java.util.Scanner;

public class CalculateRectangleArea {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        
        double length;
        double width;
        double area;
        
        System.out.print("Enter the Length of the Rectangle: ");
        length = s.nextDouble();
        
        System.out.print("Enter the Width of the Rectangle: ");
        width = s.nextDouble();
        
        area = length * width;
        
        System.out.println("The Area of Rectangle is: " + area);

        s.close();
    }
    
}
