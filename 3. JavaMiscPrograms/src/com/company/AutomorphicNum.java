import java.util.*;
 
public class AutomorphicNum
{
    public static void main(String[]args)
    {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        Integer inputNumber = scan.nextInt();
        int ab = inputNumber * inputNumber;
        
        String num = Integer.toString(inputNumber);
        
        String square = Integer.toString(ab);
        
        if(square.endsWith(num))
        {
            System.out.println(inputNumber + " is an Automorphic Number");
        }
        else
        {
            System.out.println(inputNumber + " is NOT an Automorphic Number");
        }
    }
}