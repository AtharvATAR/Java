import java.util.*;

class TelephoneBill {
    // calling variables
    public static int message, custno;
    public static double bill;

    public static void main(String[] args) {
        // making object of Scanner class
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("----------------------------");
        System.out.print("Enter your Customer Number: ");
        custno = input.nextInt();
        System.out.print("Enter the number of Message Units: ");
        message = input.nextInt();
        System.out.println("----------------------------");

        // conditional statements
        if (message <= 80) {
            bill = 250.00d;
        } else if (message <= 140) {
            bill = 250 + (message - 80) * 0.6;
        } else if (message <= 200) {
            bill = 250 + (message - 80) * 0.5;
        } else {
            bill = 250 + (message - 80) * 0.4;
        }

        // output
        System.out.format("Customer No: %d\nMessage Units: %d\nTotal Bill: %.2f\n", custno, message, bill);
        System.out.println("----------------------------");

        // closing object of Scanner Class
        input.close();
    }
}