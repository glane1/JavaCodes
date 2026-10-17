package Sept30Activity;

import java.util.Scanner;

public class CalculateTriangleArea {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double base;
        double height;
        double area;
        
        System.out.print("Enter Base of the Rectangle: ");
        base = s.nextDouble();
        
        System.out.print("Enter Height of the Rectangle: ");
        height = s.nextDouble();
        
        area = (base * height) / 2;
        
        System.out.println("The Area of Triangle is: " + area);
        
        s.close();
    }
    
}
