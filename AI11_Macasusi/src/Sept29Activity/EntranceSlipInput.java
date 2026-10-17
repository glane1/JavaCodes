package Sept29Activity;

import java.util.Scanner;

public class EntranceSlipInput {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String schoolName;
        String schoolYear;
        String schoolLocation;
        int enrollAndAssessmentFormNo;
        
        int IDNo;
        String lastName;
        String firstName;
        String middleName;
        int year;
        String entranceSlipReleased;
        
        String collegeDept;
        String sectionName;
        
        String programName;

        System.out.print("Enter School Name: ");
        schoolName = s.nextLine();
        
        System.out.print("Enter School Year(ex. 2025-2026): ");
        schoolYear = s.nextLine();
        
        System.out.print("Enter School Location: ");
        schoolLocation = s.nextLine();
        
        System.out.print("Enter Enrolment and Assessment Form No.: ");
        enrollAndAssessmentFormNo = s.nextInt();
        
        System.out.print("Enter Your ID No.: ");
        IDNo = s.nextInt();
        s.nextLine();
       
        System.out.print("Enter Your Last Name: ");
        lastName = s.nextLine();
        
        System.out.print("Enter Your First Name: ");
        firstName = s.nextLine();
        
        System.out.print("Enter Your Middle Name: ");
        middleName = s.nextLine();
        
        System.out.print("Enter What Year Are You(ex. 1): ");
        year = s.nextInt();
        s.nextLine();
        
        System.out.print("Enter the Date of E-Slip Released(mm/dd/yy): ");
        entranceSlipReleased = s.nextLine();
   
        System.out.print("Enter Your College Departent: ");
        collegeDept = s.nextLine();
        
        System.out.print("Enter Your Section: ");
        sectionName = s.nextLine();
        
        System.out.print("Enter Your Program Name: ");
        programName = s.nextLine();
        
        System.out.println();
        System.out.println(schoolName + "\t\t\t\t\t\t\t\t\t\t\tFirst Semester " + schoolYear);
        System.out.println(schoolLocation + "\t\t\t\t\t\t\t\t\t       Enrolment and Assessment Form No. " + enrollAndAssessmentFormNo);
        System.out.println("___________________________________________________________________________________________________________________________________");
        System.out.println("ID No. " + IDNo + "\t\tName: " + lastName + ", " + firstName + " " + middleName + "\t\t\t\tYear: " + year + "\t\t\t\t       " + entranceSlipReleased);
        System.out.println("College: " + collegeDept + "\t\t\t\t\t\t\tSection: " + sectionName);
        System.out.println("Course: " + programName);
        System.out.println("___________________________________________________________________________________________________________________________________");
            
        s.close();
    }
    
}
