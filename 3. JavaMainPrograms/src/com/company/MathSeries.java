/*
* EXPLANATION
* Q1: Write a programs to print ASCII code of A to Z.
* First: Initialize two variables(1 char and another one int)
* Second: Printing the title to show what this code is about.
* Third: Taking a loop from A to Z, using the char variables
* Fourth: change the char to integer class, and print both.
*/

public class MathSeries
{
  public static void main(String[]args)
  {
    //initializing variables
    int ASCII; //integer var(stores numbers)
    char Alphabet; //character var(stores a single character)

    //title
    System.out.println("--------------------");
    System.out.println(" ASCII Code : A to Z");
    System.out.println("--------------------");

    for(Alphabet = 'A'; Alphabet <= 'Z'; Alphabet++)
    {
      ASCII = Alphabet; //changing from character to integer,which stores the ASCII values
      System.out.println(Alphabet + ": " + ASCII); //printing the output
    }
  }
}
