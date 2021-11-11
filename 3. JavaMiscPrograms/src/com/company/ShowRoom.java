import java.util.*;

public class ShowRoom {

    // intializing variables
    String name;
    long mobileNum;
    double cost, dis, amount;

    public ShowRoom() {
        /* Default constructor */
        name = "";
        mobileNum = 0L;
        cost = 0.0d;
        dis = 0.0d;
        amount = 0.0d;
    }

    void Title() {
        System.out.println("--------------------------");
        System.out.println(" Java program for Showroom");
        System.out.println("--------------------------");
    }

    void Input() {
        /* Input method to take all inputs */
        Scanner input = new Scanner(System.in);

        System.out.print("\n\nEnter your name: ");
        name = input.nextLine(); // takes string as input

        System.out.print("Enter your Mobile Number: ");
        mobileNum = input.nextLong(); // takes a long integer value

        System.out.print("Enter cost of item purchased: ");
        cost = input.nextDouble(); // takes a decimal value

        // closing Scanner object to prevent memory leak
        input.close();
    }

    void Calculate() {
        /* Calculating discount prices */
        if (cost <= 10000) {
            dis = cost * 5 / 100;
            amount = cost - dis;
        } else if (cost > 10000 && cost <= 20000) {
            dis = cost * 10 / 100;
            amount = cost - dis;
        } else if (cost > 20000 && cost <= 35000) {
            dis = cost * 15 / 100;
            amount = cost - dis;
        } else if (cost > 35000) {
            dis = cost * 20 / 100;
            amount = cost - dis;
        }

    }

    void Display() {
        /* Output */
        System.out.println("\n\nName of the customer: " + name);
        System.out.println("Mobile number : " + mobileNum);
        System.out.println("Amount to be paid after discount: " + amount);
    }

    public static void main(String[] args) {
        // making object of ShowRoom class
        ShowRoom customer1 = new ShowRoom();

        customer1.Title();
        customer1.Input();
        customer1.Calculate();
        customer1.Display();
    }
}
