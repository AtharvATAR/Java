import java.util.*;
public class NumberGuess
{
    public static void main(String[] args)
    {
        //making object of scanner class
        Scanner scan = new Scanner(System.in);

        //initializing variables
        int randomNumber = (int)(Math.random() * 100);
        int guessedNumber = 0;
        final int OPERATORBYPASS = 999999;

        //title
        System.out.println("-----------------------------------------------");
        System.out.println(" Program To Make The User Guess A Random Number");
        System.out.println("-----------------------------------------------");


        //while loop to run while guessed number is not equal to the random number
        while(guessedNumber != randomNumber)
        {
            System.out.print("Guess what the number is: ");
            guessedNumber = scan.nextInt();

            //operator bypass for game to be easier
            if(guessedNumber == OPERATORBYPASS)
            {
                System.out.println("Operator bypass the random number is: " + randomNumber);
                break;
            }

            //if the guessed number is above the random number it is an incorrect guess
            else if (guessedNumber > randomNumber)
                System.out.println("Incorrect guess!!");

            //if the random number is larger than the guessed number it is incorrect
            else if (guessedNumber < randomNumber)
                System.out.println("Incorrect guess!!");

            //else it is a correct guess
            else
                System.out.println(guessedNumber + " is the correct guess!");
        }
        scan.close();
    }
}