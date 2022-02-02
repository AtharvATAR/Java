import java.util.*;

/*
EXPLANATION
Q. 2. Write a program to print pattern: 1 12 123
Step1: Initialize the variables
Step2: Initialize the scanner class and title
Step3: Taking input from the user
Step4: taking 2 loops ne for the lines and one for 1 1+1 2+1
Step4: Close the Scanner class
*/

public class MathSeries2 {
  public static void main(String[] args) {
    // initializing variables
    int loopingVar, linesCode, PrintingVar;

    // initializing Scanner (input)class
    Scanner input = new Scanner(System.in);

    // title
    System.out.println("-------------------------------");
    System.out.println(" Program for pattern: 1 12 123");
    System.out.println("-------------------------------");

    // input
    System.out.print("How many lines of output do you want: ");
    linesCode = input.nextInt();

    // loop for the lines
    for (loopingVar = 1; loopingVar <= linesCode; loopingVar++) {
      // loop for in line order
      for (PrintingVar = 0; PrintingVar < loopingVar; PrintingVar++) {
        System.out.print(PrintingVar + 1);
      }
      System.out.print(" "); // space for each output
    }
    input.close(); // close scanner class
  }
}
