import java.util.*;
public class EvenorOdd
{
    public static void main(String[]args)
    {
        Scanner ok = new Scanner(System.in);
        System.out.println("Odd Or Even");
        System.out.println( );
        
        System.out.println("Enter a number:");
        int Num = ok.nextInt();
        if(Num%2==0)
        {
            System.out.println("The number(" + Num +")is Even");
        }
        else
        {
            System.out.println("The number(" + Num +")is Odd");
        }
    }
}

        
        
       
    