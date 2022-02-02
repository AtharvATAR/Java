import java.util.*;

class PracticeProgram
{
    public static void main(String[]args)
    {
        //initializing variables
        int loopCap; //int: 32 Bits
        float result = 0.0F, loopingVar = 1F; //float: 32 Bits

        //making an object of the Scanner class
        Scanner input = new Scanner(System.in);

        //calling the title method
        title();

        //taking input
        System.out.print("Please enter the value: ");
        loopCap = input.nextInt(); //using object of the scanner class

        //lopping if looping variable is less than the input
        while(loopingVar <= loopCap)
        {
            //then due to increment we can use loopingVar for the series
            result += 1.0 / loopingVar; //assigning the result variable

            //incrementing loopingVar
            loopingVar++;
        }

        //output
        System.out.println("The sum of the series is = " + result);
        input.close();
    }

    //making a new method for the title
    private static void title()
    {
        System.out.println("----------------------------------------------------------------------------------------------");
        System.out.println(" Program to print sum of the series: 1 + 1/2 + 1/3 + 1/4 +.....1/n (Where n is user specified)");
        System.out.println("----------------------------------------------------------------------------------------------");

    }
}