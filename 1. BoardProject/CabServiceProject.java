import java.util.*;

public class CabServiceProject {
    String carType;
    double km;
    double bill;

    public static void main(String args[]) {
        CabServiceProject cab = new CabServiceProject();
        cab.accept();
        cab.calculate();
        cab.display();
    }

    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car type");
        carType = sc.nextLine();
        System.out.println("Enter KM");
        km = sc.nextInt();
    }

    public void calculate() {
        if (carType.equalsIgnoreCase("AC") && km <= 5) {
            bill = 150;
        } else {
            bill = 10 * km;
        }
        if (carType.equalsIgnoreCase("NON AC") && km <= 5) {
            bill = 120;
        } else {
            bill = 8 * km;
        }
    }

    void display() {
        System.out.println("Car Type: " + carType + "\nDistance: " + km + "\nTotal Bill: " + bill);
    }

}