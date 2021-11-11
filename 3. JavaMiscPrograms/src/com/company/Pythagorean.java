import java.util.Scanner;

/**
 * Solve problems with the pythagorean theorem.  Work included.
 * 
 * @author Andrew Bourgeois 
 * @version 2/7/2014
 */
public class Pythagorean
{
    public double a;
    public double b;
    public double c;
    public boolean isPlaying = true;
    public Scanner reader;

    public Pythagorean()
    {
        while(isPlaying)
        {
            reader = new Scanner(System.in);
            String input;

            System.out.println("Solve for a, b, c, or quit?");
            input = reader.nextLine().trim().toLowerCase();

            if(input.equals("a"))
            {
                System.out.println("");
                System.out.println("Length of b?");
                input = reader.nextLine().trim().toLowerCase();
                b = Double.parseDouble(input);

                System.out.println("");
                System.out.println("Length of c?");
                input = reader.nextLine().trim().toLowerCase();
                c = Double.parseDouble(input);

                a();
            }
            else if(input.equals("b"))
            {
                System.out.println("");
                System.out.println("Length of a?");
                input = reader.nextLine().trim().toLowerCase();
                a = Double.parseDouble(input);

                System.out.println("");
                System.out.println("Length of c?");
                input = reader.nextLine().trim().toLowerCase();
                c = Double.parseDouble(input);

                b();
            }
            else if(input.equals("c"))
            {
                System.out.println("");
                System.out.println("Length of a?");
                input = reader.nextLine().trim().toLowerCase();
                a = Double.parseDouble(input);

                System.out.println("");
                System.out.println("Length of b?");
                input = reader.nextLine().trim().toLowerCase();
                b = Double.parseDouble(input);

                c();
            }
            else if(input.equals("quit"))
            {
                isPlaying = false;
                System.out.println("");
                System.out.println("");
            }
        }
    }

    public void a()
    {
        /**
         * Control statements are here to change doubles to ints if the double is a whole number.
         * Code will not work and will end with "NaN = b" if c is less than a.
         */

        //         Line 1
        System.out.println("");
        //         Line 2
        System.out.println("a = ?");
        //         Line 3
        if(b % 1 == 0)
        {
            System.out.println("b = " + (int)b);
        }
        else
        {
            System.out.println("b = " + b);
        }
        //         Line 4
        if(c % 1 == 0)
        {
            System.out.println("c = " + (int)c);
        }
        else
        {
            System.out.println("c = " + c);
        }
        //         Line 5
        System.out.println();
        //         Line 6
        System.out.println("a^2 + b^2 = c^2");
        //         Line 7
        if(b % 1 == 0 && c % 1 == 0)
        {
            System.out.println("a^2 + " + (int)b + "^2 = " + (int)c + "^2");
        }
        else if(b % 1 == 0 && c % 1 != 0)
        {
            System.out.println("a^2 + " + (int)b + "^2 = " + c + "^2");
        }
        else if(b % 1 != 0 && c % 1 == 0)
        {
            System.out.println("a^2 + " + b + "^2 = " + (int)c + "^2");
        }
        else if(b % 1 != 0 && c % 1 != 0)
        {
            System.out.println("a^2 + " + b + "^2 = " + c + "^2");
        }
        //         Line 8
        if(b % 1 == 0 && c % 1 == 0)
        {
            System.out.println("a^2 + " + (int)(b * b) + " = " + (int)(c * c));
        }
        else if(b % 1 == 0 && c % 1 != 0)
        {
            System.out.println("a^2 + " + (int)(b * b) + " = " + c * c);
        }
        else if(b % 1 != 0 && c % 1 == 0)
        {
            System.out.println("a^2 + " + b * b + " = " + (int)(c * c));
        }
        else if(b % 1 != 0 && c % 1 != 0)
        {
            System.out.println("a^2 + " + b * b + " = " + c * c);
        }
        //         Line 9
        if(b % 1 == 0 && c % 1 == 0)
        {
            System.out.println("a^2 = " + (int)(c * c - b * b));
        }
        else if(b % 1 != 0 || c % 1 == 0)
        {
            System.out.println("a^2 = " + (c * c - b * b));
        }
        //         Line 10
        if(Math.sqrt((c * c) - (b * b)) % 1 == 0)
        {
            System.out.println("a = " + (int)(Math.sqrt((c * c) - (b * b))));
        }
        else if(Math.sqrt((c * c) - (b * b)) % 1 != 0)
        {
            System.out.println("a = " + Math.sqrt((c * c) - (b * b)));
        }
        //         Line 11
        System.out.println("");
        //         Line 12
        System.out.println("");

        a = 0;
        b = 0;
        c = 0;
    }

    public void b()
    {
        /**
         * Control statements are here to change doubles to ints if the double is a whole number.
         * Code will not work and will end with "NaN = b" if c is less than a.
         */

        //         Line 1
        System.out.println("");
        //         Line 2
        if(a % 1 == 0)
        {
            System.out.println("a = " + (int)a);
        }
        else
        {
            System.out.println("a = " + a);
        }
        //         Line 3
        System.out.println("b = ?");
        //         Line 4
        if(c % 1 == 0)
        {
            System.out.println("c = " + (int)c);
        }
        else
        {
            System.out.println("c = " + c);
        }
        //         Line 5
        System.out.println();
        //         Line 6
        System.out.println("a^2 + b^2 = c^2");
        //         Line 7
        if(a % 1 == 0 && c % 1 == 0)
        {
            System.out.println((int)a + "^2 + " + "b^2 = " + (int)c + "^2");
        }
        else if(a % 1 == 0 && c % 1 != 0)
        {
            System.out.println((int)a + "^2 + " + "b^2 = " + c + "^2");
        }
        else if(a % 1 != 0 && c % 1 == 0)
        {
            System.out.println(a + "^2 + " + "b^2 = " + (int)c + "^2");
        }
        else if(a % 1 != 0 && c % 1 != 0)
        {
            System.out.println(a + "^2 + " + "b^2 = " + c + "^2");
        }
        //         Line 8
        if(a % 1 == 0 && c % 1 == 0)
        {
            System.out.println((int)a + "^2 + b^2 = " + (int)c + "^2");
        }
        else if(a % 1 == 0 && c % 1 != 0)
        {
            System.out.println((int)a + "^2 + b^2 = " + c + "^2");
        }
        else if(a % 1 != 0 && c % 1 == 0)
        {
            System.out.println(a + "^2 + b^2 = " + (int)c + "^2");
        }
        else if(a % 1 != 0 && c % 1 != 0)
        {
            System.out.println(a + "^2 + b^2 = " + c + "^2");
        }
        //         Line 9
        if(a % 1 == 0 && c % 1 == 0)
        {
            System.out.println((int)(a * a) + " + b^2 = " + (int)(c * c));
        }
        else if(a % 1 == 0 && c % 1 != 0)
        {
            System.out.println((int)(a * a) + " + b^2 = " + c * c);
        }
        else if(a % 1 != 0 && c % 1 == 0)
        {
            System.out.println(a * a + " + b^2 = " + (int)(c * c));
        }
        else if(a % 1 != 0 && c % 1 != 0)
        {
            System.out.println(a * a + " + b^2 = " + c * c);
        }
        //         Line 10
        if(a % 1 == 0 && c % 1 == 0)
        {
            System.out.println("b^2 = " + (int)(c * c - a * a));
        }
        else if(a % 1 != 0 || c % 1 == 0)
        {
            System.out.println("b^2 = " + (c * c - a * a));
        }
        //         Line 11
        if(Math.sqrt((c * c) - (a * a)) % 1 == 0)
        {
            System.out.println("b = " + (int)(Math.sqrt((c * c) - (a * a))));
        }
        else if(Math.sqrt((c * c) - (a * a)) % 1 != 0)
        {
            System.out.println("b = " + Math.sqrt((c * c) - (a * a)));
        }
        //         Line 12        
        System.out.println("");
        //         Line 13
        System.out.println("");

        a = 0;
        b = 0;
        c = 0;
    }

    public void c()
    {
        /**
         * Control statements are here to change doubles to ints if the double is a whole number.
         */

        //         Line 1
        System.out.println("");
        //         Line 2
        if(a % 1 == 0)
        {
            System.out.println("a = " + (int)a);
        }
        else
        {
            System.out.println("a = " + a);
        }
        //         Line 3
        if(b % 1 == 0)
        {
            System.out.println("b = " + (int)b);
        }
        else
        {
            System.out.println("b = " + b);
        }
        //         Line 4
        System.out.println("c = ?");
        //         Line 5
        System.out.println();
        //         Line 6
        System.out.println("a^2 + b^2 = c^2");
        //         Line 7
        if(a % 1 == 0 && b % 1 == 0)
        {
            System.out.println((int)a + "^2 + " + (int)b + "^2 = c^2");
        }
        else if(a % 1 == 0 && b % 1 != 0)
        {
            System.out.println((int)a + "^2 + " + b + "^2 = c^2");
        }
        else if(a % 1 != 0 && b % 1 == 0)
        {
            System.out.println(a + "^2 + " + (int)b + "^2 = c^2");
        }
        else if(a % 1 != 0 && b % 1 != 0)
        {
            System.out.println(a + "^2 + " + b + "^2 = c^2");
        }
        //         Line 8
        if(a % 1 == 0 && c % 1 == 0)
        {
            System.out.println((int)a + "^2 + b^2 = " + (int)c + "^2");
        }
        else if(a % 1 == 0 && c % 1 != 0)
        {
            System.out.println((int)a + "^2 + b^2 = " + c + "^2");
        }
        else if(a % 1 != 0 && c % 1 == 0)
        {
            System.out.println(a + "^2 + b^2 = " + (int)c + "^2");
        }
        else if(a % 1 != 0 && c % 1 != 0)
        {
            System.out.println(a + "^2 + b^2 = " + c + "^2");
        }
        //         Line 9
        if(a % 1 == 0 && b % 1 == 0)
        {
            System.out.println((int)(a * a) + " + " + (int)(b * b) + " = c^2");
        }
        else if(a % 1 == 0 && b % 1 != 0)
        {
            System.out.println((int)(a * a) + " + " + b * b + " = c^2");
        }
        else if(a % 1 != 0 && b % 1 == 0)
        {
            System.out.println(a * a + " + " + (int)(b * b) + " = c^2");
        }
        else if(a % 1 != 0 && b % 1 != 0)
        {
            System.out.println(a * a + " + " + b * b + " = c^2");
        }
        //         Line 10
        if((a * a + b * b) % 1 == 0)
        {
            System.out.println((int)(a * a + b * b) + " = c^2");
        }
        else if((a * a + b * b) % 1 != 0)
        {
            System.out.println((a * a + b * b) + " = c^2");
        }
        //         Line 11
        if(Math.sqrt(a * a + b * b) % 1 == 0)
        {
            System.out.println((int)(Math.sqrt(a * a + b * b)) + " = c^2");
        }
        else if(Math.sqrt(a * a + b * b) % 1 != 0)
        {
            System.out.println(Math.sqrt(a * a + b * b) + " = c^2");
        }
        //         Line 12        
        System.out.println("");
        //         Line 13
        System.out.println("");

        a = 0;
        b = 0;
        c = 0;
    }
}