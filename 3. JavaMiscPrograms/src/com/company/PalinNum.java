import java.util.*;
class PalinNum
{
    public static void main(String[]args)
    {
        //inputs
        int r,sum=0,a;
        System.out.println("Palindrome Number");
        
        Scanner Sc = new Scanner(System.in);
        System.out.println(" ");
        
        
        System.out.print("Enter the number: ");
        int n = Sc.nextInt();
        a=n;
        
        //loops
        while(n>0)
        {
            r=n%10;
            sum=(sum*10)+r;
            n=n/10;
        }
        
        //conditional statements
        if(a==sum)
        {
           System.out.println(a +" is a palindromic number "); 
        }
        else
        {
            System.out.println(a+" is Not a palindromic number");
        }
    }
}