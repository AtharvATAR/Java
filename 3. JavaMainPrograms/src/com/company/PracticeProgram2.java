import java.util.*;

public class PracticeProgram2
{
    //initializing variables
    public static int loopCap, loopingVar; //32 Bits
    public static float result = 0.0F; //32 Bits
    public static boolean NumIsOdd; //1 Bits

    public static void main(String[] args)
    {
        //calling the title method
        title();

        ////calling the input method
        input();

        //calling the calculate method
        calculate();

        //calling the output
        output();
    }

    //making a method for the title
    public static void title()
    {
        //title
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" Program to print sum of the series: 1 - 1/2 + 1/3 - 1/4 +.....1/n (Where n is user specified)");
        System.out.println("----------------------------------------------------------------------------------------------");

        //1- 0.5
    }

    public static void input()
    {
        //making an object of Scanner class
        Scanner input = new Scanner(System.in);

        //taking input
        System.out.print("Please enter the value: ");
        loopCap = input.nextInt(); //using object of the scanner class
        input.close();
    }

    public static void calculate()
    {
        //loop to keep running until the limit specified
        for(loopingVar = 1; loopingVar <= loopCap; loopingVar++)
        {
            //check if denominator is even or odd
            NumIsOdd = loopingVar % 2 != 0;

            //if its odd - sign to it
            if(NumIsOdd)
                result -= 1.0 / loopingVar;
                //if even add it
            else
                result += 1.0 / loopingVar;
        }
    }

    public static void output()
    {
        //output
        System.out.println("\n\nThe Result of the series is: " + Math.abs(result));
        System.out.println("With the Limit specified: " + loopCap);
    }
}
