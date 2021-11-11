import java.util.*;
public class Palindrome {

    public static void main(String[] args) {

        int num , reversedInteger = 0, remainder, originalInteger;
        Scanner Sc = new Scanner(System.in);
        System.out.println("enter the number: ");
        num= Sc.nextInt();

        int ori = num;

        
        while( num != 0 )
        {
            remainder = num % 10;
            reversedInteger = reversedInteger * 10 + remainder;
            num  /= 10;
        }

        
        if (ori == reversedInteger)
            System.out.println(ori + " is a palindrome.");
        else
            System.out.println(ori + " is not a palindrome.");
    }
}