import java.util.Scanner;

class OddOrEven {
    public static void main(String[] args) {
        // initializing variables
        int inputNum;

        // making object of Scanner class
        Scanner input = new Scanner(System.in);

        // title
        System.out.println("--------------------------------------------");
        System.out.println(" Program to check if a number is Odd or Even");
        System.out.println("--------------------------------------------");

        // input
        System.out.print("Please enter the number: ");
        inputNum = input.nextInt();

        // conditional statements
        if (inputNum % 2 == 0) {
            System.out.println("\n\nThe given number (" + inputNum + ") is Even!");
        } else {
            System.out.println("\n\nThe given number (" + inputNum + ") is Odd!");
        }

        // closing the object to prevent memory leak
        input.close();
    }
}