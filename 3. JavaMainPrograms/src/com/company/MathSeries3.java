import java.util.*;

/*
EXPLANATION
Q. 3. Write a program to print Pattern A AB ABC
Step1: Initialize the variables
Step2: Initialize the scanner class and title
Step3: Taking input from the user
Step4: taking 2 loops ne for the lines and one for A A+1 A+2
Step4: Close the Scanner class
*/

public class MathSeries3 {
  public static void main(String[] args) {
    // initializing variables
    int loopingVar, loopCap, alphabet;

    // making object of Scanner class
    Scanner input = new Scanner(System.in);

    // title
    System.out.println("-----------------------------");
    System.out.println(" Program To Print : A AB ABC");
    System.out.println("-----------------------------");

    // input
    System.out.print("Lines of series in Alphabet: ");
    loopCap = input.nextInt();

    // calc
    loopCap += 65;

    // loops
    for (loopingVar = 65; loopingVar <= loopCap; loopingVar++) {
      // second loop for in-row looping
      for (alphabet = 65; alphabet <= loopingVar; alphabet++) {
        System.out.print((char) (alphabet));
      }
      System.out.println(" ");
      input.close();
    }
  }
}
