import java.util.*;
public class GreatNum
{
    public static void main(String[]args)
    {
       Scanner in = new Scanner(System.in);
       
       
       //inputs
       System.out.print("Input the 1st number: ");
       int num1 = in.nextInt();
       
       System.out.print("Input the 2nd number: ");
       int num2 = in.nextInt();
       
       System.out.print("Input the 3rd number: ");
       int num3 = in.nextInt();
       
       System.out.print("Input the 3rd number: ");
       int num4 = in.nextInt();
       
       //Loops
       if(num1>num2 && num1>num3 && num3>num4)
       {
           System.out.println(num1+" is the greatest number.");
        }
        if(num2>num1 && num2>num3 && num2>num4)
        {
            System.out.println(num2+" is the greatest number.");
        }
        if(num3>num1 && num3>num2 && num3>num4)
        {
            System.out.println(num3+" is the greatest number.");
        }
        if(num4>num1 && num4>num2 && num4>num3)
        {
            System.out.println(num4+" is the greatest number.");
        }
    }
}
        
    
    
   
        
    
 