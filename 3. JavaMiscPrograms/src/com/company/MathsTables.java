import java.util.*;
public class MathsTables
{
    public static void main(String[]args)
    {
        Scanner Num = new Scanner(System.in);
        System.out.println("Mathematics Tables");
        System.out.println(" ");
        
        System.out.println("Enter a number:");
        int enteredNum = Num.nextInt();
        
        for(int i = 1;i <= 10;i++)
        {
            int a = i * enteredNum;
            System.out.println(enteredNum + " * " + i + " = " + a);
        }
    }
}