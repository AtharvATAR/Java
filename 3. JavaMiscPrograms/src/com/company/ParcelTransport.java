import java.util.*;
class ParcelTransport
{
    public static void main(String[]args)
    {
        String name;
        int a;
        int charge;
        
        //Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Weight of the parcel in kg: ");
        a = sc.nextInt();
        
        //calculations via loops
        if(a <= 10)
        {
            charge = a * 25;
        }
        else if(a <= 30)
        {
            charge = 250 + (a - 10) * 20;
        }
        else
        {
            charge = 450 + (a - 30) * 10;
        }
        charge += (int)(5.0 / 100 * charge);
        
        //Output
        System.out.println("Name\tWeight\tBill Amount");
        System.out.println(name + "\t" + a + "\t" + charge);
    }
}
    
    