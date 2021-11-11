import java.util.*;
public class telephoneBillProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int message, custno;
        double bill = 0;
        System.out.println("Enter your customer number and the number of message units");
        custno = sc.nextInt();
        message = sc.nextInt();
        if (message <= 80) {
            bill = 250.00;
        } else if (message <= 140) {
            bill = 250 + (message - 80) * 0.6;
        }
        else if (message <= 200) {
            bill = 250 + (message - 80) * 0.5;
        }
        else {
            bill = 250 + (message - 80) * 0.4;
        }
        System.out.println("Customer no: " + custno + "\nMessage units: " + message+ "\nTotal Bill: "+ bill);
    }
}
