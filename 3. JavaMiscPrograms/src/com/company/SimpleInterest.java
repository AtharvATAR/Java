import java.util.*;
public class SimpleInterest
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        System.out.print("Enter the Principal: ");
        double P = Sc.nextDouble();
        System.out.println(" ");
        System.out.print("Enter the Rate: ");
        int R = Sc.nextInt();
        System.out.println(" ");
        System.out.print("Enter the Time: ");
        int T = Sc.nextInt();
        
        double SI = (P * R * T)/100;
        
        System.out.print("The Simple Interest is: " + SI);
    }
}