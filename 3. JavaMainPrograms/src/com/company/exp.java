import java.util.*;
import java.lang.*;
class exp
{
    public static int pow;
    public static int base;
    public static int result = 1;
    public static void main(String[]args)
    {
        ret();
    }
    public static int ret()
    {
        Scanner S = new Scanner(System.in);
        
        System.out.println("Enter The base number: ");
        base = S.nextInt();
        
        System.out.println("Enter The power: ");
        pow = S.nextInt();
        
        for(int i = 1; i <= pow; i++)
        {
            result = base * result; 
        }
        return result;
    }
}