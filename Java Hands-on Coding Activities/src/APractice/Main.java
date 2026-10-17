/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package APractice;

import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count = 10;
        int[] employeeScore = {5};
        String[] scaleResult = {
                "Poor", "Needs Improvement", "Meets", "Exceeds", "Outstanding"
            };


        for(int i = 0; i < 1; i++) {
            int scoreStats = 0;
            if(employeeScore[i] == 5) {
                scoreStats = scaleResult[i].indexOf("Outstanding");
            }
            System.out.println(scoreStats);
        }
        
    }
    
}
