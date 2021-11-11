import java.util.*;
class arrays
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        
        for (int i = 0; i < cars.length; i++) 
        {
            System.out.println(cars[i]);
        }
        
        System.out.println("Enter in a car brand: ");
        cars[3] = Sc.nextLine();
        
        for (int i = 0; i < cars.length; i++) 
        {
            System.out.println(cars[i]);
        }
    }
}