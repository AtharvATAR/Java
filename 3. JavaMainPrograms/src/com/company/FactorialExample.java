import java.util.*;
class FactorialExample
{
    public static void main(String[]args)
    {
        System.out.print("Factorial Number Calculation ");
        
        //Input
        Scanner sc = new Scanner(System.in);
        int i,fact=1, inp;
        System.out.println(" ");
        System.out.println(" ");
        System.out.print("Enter the number: ");
        inp = sc.nextInt();
        
        //Loops
        for(i=1;i<=inp;i++)
        {
            fact=fact*i;
        }
        if(fact==0)
        {
        //output
        System.out.println("Out of Range");
    }
    else
    {
        System.out.println("Factorial of "+inp+" is: "+fact);
    }
    
    }
}

 
 