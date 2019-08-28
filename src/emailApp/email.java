package emailApp;

import java.util.Scanner;

public class email {
    // Using encapsulation with private variables
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity;
    private String alternateEmail;

    // Constructor to receive the first name and the last name

    public email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("Email Created: "+this.firstName+"" +this.lastName);

        //Call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Working on "+department);
    }

    // Ask for the department
    public String setDepartment() {
        System.out.println("DEPARTMENT CODES \n1 for Sales \n2 for Development \n3 for Accounting \n0 for none");
        System.out.println("Enter the department code: ");
        Scanner scanner = new Scanner(System.in);
        int depChoice = scanner.nextInt();
        if (depChoice == 1) {
            return "Sales";
        } else if (depChoice == 2) {
            return "Development";
        } else if (depChoice == 3) {
            return "Accounting";
        } else {
            return "None";
        }
    }

    // Generate a random password

    // Set the mailbox capacity

    // Set the alternate email

    // Change the password

}
