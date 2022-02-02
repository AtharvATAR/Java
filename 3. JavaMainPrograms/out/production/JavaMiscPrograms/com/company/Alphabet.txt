import java.util.*;
public class Alphabet
 {

    public static void main(String[] args)
    {
        Scanner Sc = new Scanner (System.in);
        System.out.println("Enter a charecter: ");
        char c = Sc.next().charAt(0);


        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}