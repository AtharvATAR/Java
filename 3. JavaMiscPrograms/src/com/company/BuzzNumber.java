import java.util.*;
public class BuzzNumber
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int a = Sc.nextInt();
        if(a % 7==0 || a % 10==7)
        {
            System.out.println("Entered number " + a +" is a Buzz number.");
        }
        else
        {
            System.out.println("Entered number " + a +" is not a Buzz number.");
        }
    }
}