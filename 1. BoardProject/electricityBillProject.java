import java.util.*;

public class electricityBillProject {
    String name;
    int units;
    double bill;

    public static void main(String[] args) {
        electricityBillProject bill = new electricityBillProject();
        bill.accept();
        bill.calculate();
        bill.display();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you name");
        name = sc.nextLine();
        System.out.println("Enter you units");
        units = sc.nextInt();
    }

    public void calculate() {
        if (units <= 100) {
            bill = units * 2.00;
        } else if (units <= 300 && units > 200) {
            bill = units * 3.00;
        } else {
            bill = units * 5.00;
            double surcharge = (bill * 2.5) / 100;
            bill += surcharge;
        }
    }

    public void display() {
        System.out.println("Your name: " + name + "\nUnits consumed: " + units + "\nTotal bill: " + bill);
    }
}
