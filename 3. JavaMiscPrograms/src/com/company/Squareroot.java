import java.util.*;
public class Squareroot
{
    public static void main(String[]args)
    {
        Scanner Num = new Scanner(System.in);
        double Process;
        
        System.out.print("Enter the number: ");
        Process = Num.nextDouble();
        
        double Output = Math.sqrt(Process);
        System.out.println(" ");
        System.out.println("Your Square root is: " + Output);
    }
}