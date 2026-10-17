package CinemaTicketReservation;
import java.util.Scanner;

public class CinemaTicketReservation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        double adultPrice = 250.0; // Regular 2D Weekday price
       
        System.out.println("==== WELCOME TO CINEMA TICKETING SYSTEM ====");
       
        // 1. Input
        System.out.print("Enter Customer Name: ");
        String name = s.nextLine();
       
        System.out.print("Enter Age: ");
        int age = s.nextInt();
       
        System.out.print("Enter Ticket Type [Regular, Student, Senior, PWD, Child]: ");
        String ticketType = s.next();
       
        System.out.print("Enter Number of Tickets: ");
        int qty = s.nextInt();
       
        double pricePerTicket = adultPrice;
        double discount = 0;
       
        // 2. Process: Determine price based on age and ticket type
        ticketType = ticketType.toLowerCase();
       
        if(ticketType.equals("senior") || ticketType.equals("pwd")) {
            // 20% discount + 12% VAT exempt
            double vatExemptPrice = adultPrice / 1.12;
            pricePerTicket = vatExemptPrice * 0.80;
            discount = adultPrice - pricePerTicket;
           
        } else if(ticketType.equals("student")) {
            // 20% discount only
            discount = adultPrice * 0.20;
            pricePerTicket = adultPrice - discount;
           
        } else if(ticketType.equals("child")) {
            // Check age first. 3-12 years old only
            if(age >= 3 && age <= 12) {
                discount = adultPrice * 0.15; // 15% discount
                pricePerTicket = adultPrice - discount;
            } else {
                System.out.println("Age not qualified for Child ticket. Using Regular Price.");
            }
           
        } else if(ticketType.equals("regular")) {
            // No discount
            discount = 0;
            pricePerTicket = adultPrice;
           
        } else {
            System.out.println("Invalid ticket type. Using Regular Price.");
        }
       
        // 3. Calculate total
        double subtotal = pricePerTicket * qty;
       
        // 4. Output Receipt
        System.out.println("\n======== CINEMA RECEIPT ========");
        System.out.println("Customer Name      : " + name);
        System.out.println("Age                : " + age);
        System.out.println("Ticket Type        : " + ticketType.toUpperCase());
        System.out.println("Price per Ticket   : " + String.format("₱%.2f", pricePerTicket));
        System.out.println("Quantity           : " + qty);
        System.out.println("Discount per Ticket: " + String.format("₱%.2f", discount));
        System.out.println("--------------------------------");
        System.out.println("TOTAL AMOUNT       : " + String.format("₱%.2f", subtotal));
        System.out.println("======== THANK YOU! ============");
       
        s.close();
    }
}