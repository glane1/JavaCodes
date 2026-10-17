/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClassroomSeatArrangement;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class ClassroomSeatArrangement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        String[] seatStatus = new String[30];
        
        for(int i = 0; i < seatStatus.length; i++) {
            seatStatus[i] = "Vacant.";
        }
        
        int choice = 0;
        boolean runAgain = false;
        
        do {
            System.out.println("""
                               ====================================
                               ==== Classroom Seat Arrangement ====
                               ====================================
                               Choices:
                               1. Reserve Seat     
                               2. Cancel Reservation
                               3. Display Seat Status""");
            do {
                try {
                    System.out.print("Choice: ");
                    choice = s.nextInt();

                    if(choice < 1 || choice > 3) {
                        System.out.println("Between 1 to 3 only!");
                        continue;
                    }
                    break;
                } catch(InputMismatchException e) {
                    s.nextLine();
                    System.out.println("Input Number Only!");
                }
            }while(true);

            switch(choice) {
                
                case 1 -> {
                    
                    int seatNum;
                    boolean reserveSeatAgain = false;
                    
                    System.out.println("\n========================");
                    System.out.println("==== Seat Reservation ====");
                    System.out.println("==========================");
                    do {
                        
                        boolean checkInput = false;
                        boolean seatIsFull = false;
                        
                        do {
                            
                            System.out.print("Please Enter Seat Number: ");
                            seatNum = s.nextInt();
                            s.nextLine();
                            seatNum--;
                            

                            if(((seatNum + 1) < 1) || seatNum > 29) {
                                System.out.println("Must be between 1 to 30 only!");
                                checkInput = true;
                                continue;
                            }
                            //if ("Reserved.".equals(seatStatus[seatNum]))
                            if("Reserved.".equals(seatStatus[seatNum])) {
                                
                                for(int i = 0; i < seatStatus.length; i++) {
                                    /*
                                    if(seatStatus[i] == null) {
                                        seatStatus[i] = "Vacant.";
                                    }
                                    */
                                    if ("Reserved.".equals(seatStatus[seatNum])) {
                                        seatIsFull = true;
                                    }else {
                                        System.out.println("This seat " + (seatNum + 1) + " is already reserved.");
                                        seatIsFull = false;
                                        break;
                                    }

                                }
                                
                                //continue;
                            } else {
                                seatStatus[seatNum] = "Reserved.";
                                System.out.println("Seat " + (seatNum + 1) + " reserved.");

                            }
                            /*
                            for(int i = 0; i < seatStatus.length; i++) {

                                if(seatStatus[i] == null) {
                                    seatStatus[i] = "Vacant";
                                }
                                
                                if(seatStatus[i] == "Reserved.") {
                                    seatIsFull = true;
                                }else {
                                    seatIsFull = false;
                                }
                                
                            }
                            */
                            if(seatIsFull) {
                                do {
                                    System.out.println("Seat are fully occupied!");
                                    System.out.print("Type E to Exit: ");
                                    char exit = s.nextLine().toLowerCase().charAt(0);

                                    if(exit != 'e') {
                                        System.out.println("Must be letter E");
                                        continue;
                                    }else {
                                        checkInput = false;
                                        reserveSeatAgain = false;
                                        runAgain = true;
                                        System.out.println();
                                        break;
                                    }
                                    
                                }while(true);
                                
                            } else {
                            
                                do {
                                    System.out.print("Want to reserve seat again? (y/n): ");
                                    char reserveAgain = s.nextLine().toLowerCase().charAt(0);

                                    if(reserveAgain == 'y') {
                                        checkInput = true;
                                        reserveSeatAgain = true;
                                        break;
                                    } else if(reserveAgain == 'n') {
                                        checkInput = false;
                                        reserveSeatAgain = false;
                                        runAgain = true;
                                        break;
                                    } else {
                                        System.out.println("Must be Y or N only!");
                                        continue;
                                    }
                                }while(true);
                            
                            }
                        
                        }while(checkInput);

                    }while(reserveSeatAgain);
                    
                }

                case 2 -> {
                    int calcelSeat;
                    boolean firstLoop = false;
                    
                    System.out.println();
                    System.out.println("============================");
                    System.out.println("==== Cancel Reservation ====");
                    System.out.println("============================");
                    do {
                        
                        do {
                            System.out.print("Seat Number to Cancel: ");
                            calcelSeat = s.nextInt();
                            s.nextLine();
                            calcelSeat--;
                            
                            if(((calcelSeat + 1) < 1) || ((calcelSeat + 1) > 30)) {
                                System.out.println("Must be between 1 to 30 only!");
                                continue;
                            } else {
                                break;
                            }
                            
                        }while(true);
                        
                        if("Reserved.".equals(seatStatus[calcelSeat])) {
                            System.out.println("Seat " + (calcelSeat + 1) + " is now Vacant.");
                            seatStatus[calcelSeat] = "Vacant.";
                        }else if("Vacant.".equals(seatStatus[calcelSeat])) {
                            System.out.println("This seat is not reserved.");
                        }
                        
                        do {
                            System.out.print("Cancel seat reservation again? (y/n): ");
                            char cancelSeatAgain = s.nextLine().toLowerCase().charAt(0);

                            if(cancelSeatAgain == 'y') {
                                firstLoop = true;
                                break;  
                                // I was wondering why it turned red.
                                // I checked the spelling thoroughly but didn't
                                // see any mistakes. However, after a few
                                // minutes passed, I realized that
                                // the spelling really was wrong.
                            }else if(cancelSeatAgain == 'n') { 
                                System.out.println("----------------");
                                System.out.println("===== Exit =====");
                                System.out.println("----------------");
                                runAgain = true;
                                firstLoop = false;
                                System.out.println();
                                break;
                            }else {
                                System.out.println("Must be Y or N only!");
                                continue;
                            }

                        }while(true);    
                        
                    }while(firstLoop);
                    
                }
                
                case 3 -> {
                    System.out.println();
                    System.out.println("""
                                       ===================
                                       === Seat Status ===
                                       ===================""");
                    for(int i = 0; i < seatStatus.length; i++) {
                        System.out.println("Seat " + (i + 1) + ": is " + seatStatus[i]);
                    }
                    System.out.println("--------------------\n");
                    runAgain = true;
                }
                

            }
        }while(runAgain);
        
        s.close();
    }
    
}
