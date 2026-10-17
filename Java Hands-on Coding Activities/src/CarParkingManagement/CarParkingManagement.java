package CarParkingManagement;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Asus
 */
public class CarParkingManagement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        
        int count = 50;
        String[] parkingSlot = new String[count];
        for(int i = 0; i < count; i++) {
            parkingSlot[i] = "Vacant.";
        }
        
        String[] choices = {"1.Park",
            "2.Parking Number Status",
            "3.Available Parking Space",
            "4.Exit"
        };
        int choice;
        boolean mainMenu = true;
        
        while(mainMenu) {
            System.out.println("------------------------------");
            System.out.println("===== Car Parking System =====");
            System.out.println("------------------------------");
            System.out.println("Service/s:");
            for(int i = 0; i < choices.length; i++) {
                System.out.println(choices[i]);
            }
            System.out.println("------------------------------");

            do {
                try {
                    System.out.print("Choice: ");
                    choice = s.nextInt(); 

                    if(choice >= 1 && choice <= 4) {
                        break;
                    }else {
                        System.out.println("Must be between 1 to " + choices.length);
                        continue;
                    }
                }catch(InputMismatchException e) {
                    s.nextLine();
                    System.out.println("Input number Only!");
                }
                
            }while(true);

            int parkingNumChoice;
            switch(choice) {
                
                case 1 -> {
                    
                    boolean subMenu = true;
                    
                    while(subMenu) {
                        System.out.println("-------------------------------");
                        System.out.println();
                        System.out.println("-------------------------------");
                        System.out.println("Want to park?");
                        System.out.println("Just choose between 1 to " + parkingSlot.length);
                        System.out.println("-------------------------------");
                        do {
                            try {
                                System.out.print("Select parking number: ");
                                parkingNumChoice = s.nextInt(); 

                                if(parkingNumChoice >= 1 && parkingNumChoice <= parkingSlot.length) {
                                    System.out.println("-------------------------------");
                                    break;
                                }else {
                                    System.out.println("Must be between 1 to " + parkingSlot.length);
                                    continue;
                                }
                            }catch(InputMismatchException e) {
                                s.nextLine();
                                System.out.println("Input Number Only!");
                            }
                            
                        }while(true);

                        if("Occupied.".equals(parkingSlot[parkingNumChoice - 1])) {
                            System.out.println("--------------------------------");
                            System.out.println();
                            System.out.println("Parking #" + parkingNumChoice + " is already occupied!");
                        }else if("Vacant.".equals(parkingSlot[parkingNumChoice - 1])) {
                            parkingSlot[parkingNumChoice - 1] = "Occupied.";
                            System.out.println();
                            System.out.println("--------------------------------");
                            System.out.printf("Parking #%d Succesfully Occupied.\n", parkingNumChoice);
                            System.out.println("--------------------------------");
                        }

                        String exit;
                        
                        s.nextLine();
                        System.out.println();
                        System.out.println("Back to main menu?");
                        do {
                            
                            System.out.print("Just type Y or N: ");
                            exit = s.nextLine();

                            if(exit.equalsIgnoreCase("y")) {
                                System.out.println();
                                subMenu = false;
                                break;
                            }else if(exit.equalsIgnoreCase("n")) {
                                System.out.println();
                                break;
                            }else {
                                System.out.println();
                                System.out.println("Y or N Only!");
                                continue;
                            }
                            
                        }while(true);
                    }
                } // done withh this logic, the first thing you should do is to proceed to the next case!
                
                case 2 -> {
                    System.out.println("""
                                       
                                    ---------------------------------
                                    ===== Parking Number Status =====
                                    ---------------------------------""");
                    for(int i = 0; i < count; i++) {
                            System.out.println((i + 1) + ". " + parkingSlot[i]);
                    }
                    System.out.println();
                }
                
                case 3 -> {
                    System.out.println("""
                                       
                                       -----------------------------------
                                       ===== Available Parking Space =====
                                       -----------------------------------""");
                    
                    for(int i = 0; i < count; i++) {
                        if("Vacant.".equals(parkingSlot[i])) {
                            System.out.println((i + 1) + ". Vacant.");
                        }
                    }
                    System.out.println();
                }
                
                case 4 -> {
                    System.out.println("exiting.........");
                    System.out.println();
                    System.out.println("""
                                       ----------------
                                       ===== Exit =====
                                       ----------------""");
                    mainMenu = false;
                }
            }
        }
        
        s.close();
    }
    
}
