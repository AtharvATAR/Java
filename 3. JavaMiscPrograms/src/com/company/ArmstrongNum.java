import java.util.*;
class ArmstrongNum
{
    public static void main(String[]args)
    {
        int c=0,a,b;
        Scanner Sc = new Scanner(System.in);
        System.out.println("Armstrong Number");
        
        System.out.println(" ");
        
        System.out.println("Enter the number: ");
        int num = Sc.nextInt();
        b=num;
        
        System.out.println("  ");
        
        while(num>0)
        {
            a=num%10;
            num=num/10;
            c=c+(a*a*a);
        }
        if(b==c)
        {
            System.out.println(b + " is an armstrong number");
        }
        else
        {
            System.out.println(b + " is Not an armstrong number");
        }
    }
}