import java.util.*;
public class AreaOf2D
{
    public static void main(String[]args)
    {
        Scanner Sc = new Scanner(System.in);
        //to calculate area of 2d figures
        System.out.println("Area Calculator");
        System.out.println(" ");
        System.out.print("Enter the Shape: ");
        String shape = Sc.nextLine();
        System.out.println(" ");
            
    
        
        //Condition Statements
        if(shape.equals("triangle"))
        {
            
            //base
            System.out.print("Enter the Base: ");
            double Base = Sc.nextDouble();
            
            
            //height
            System.out.print("Enter the Height: ");
            double Height = Sc.nextDouble();
            
            //The formulaes
            double tri = (0.5 * Base * Height);
        
            
            //answer
            System.out.print("The Area of the triangle is: " + tri);
        }
        if(shape.equals("square"))
        {
            //Side
            System.out.print("Enter the Side: ");
            double Side = Sc.nextDouble();
            System.out.println(" ");
            
            //formulae
            double sqr = (Math.pow(Side,2));
            
            //answer
            System.out.print("The Area of the Square is: " + sqr);
        }
        if(shape.equals("rectangle"))
        {
            //Length
            System.out.print("Enter the Length: ");
            double Length = Sc.nextDouble();
            System.out.println(" ");
            
            //Height
            System.out.print("Enter the Height: ");
            double Height = Sc.nextDouble();
            
            //formulaes
            double rec = ((Length * Height));
            
            //answer
            System.out.print("The Area of the Rectangle is: " + rec);
        }
        if(shape.equals("rhombus"))
        {
            //Diagonal1
            System.out.print("Enter the first Diagonal: ");
            double Diagonal1 = Sc.nextDouble();
            System.out.println(" ");
            
            //Diagonal2
            System.out.print("Enter the second Diagonal: ");
            double Diagonal2 = Sc.nextDouble();
            
            //formulae
            double rho = (0.5 * Diagonal1 * Diagonal2);
            
            //answer
            System.out.print("The Area of the Rhombus is: " + rho);
        }
        if(shape.equals("parallelogram"))
        {
            //BasePar
            System.out.print("Enter the Base: ");
            double BasePar = Sc.nextDouble();
            System.out.println(" ");
            
            //Diagonal2
            System.out.print("Enter the second Diagonal: ");
            double HeightPar = Sc.nextDouble();
            
            //formulae
            double par = ( BasePar * HeightPar);
            
            //answer
            System.out.print("The Area of the Parallelogram is: " + par);
        }
        if(shape.equals("kite"))
        {
            //Diagonal1kit
            System.out.print("Enter the first diagonal: ");
            double Diagonal1kit = Sc.nextDouble();
            System.out.println(" ");
            
            //Diagonal2kit
            System.out.print("Enter the second Diagonal: ");
            double Diagonal2kit = Sc.nextDouble();
            
            //formulae
            double kit = (0.5 * Diagonal1kit * Diagonal2kit);
            
            //answer
            System.out.print("The Area of the Kite is: " + kit);
        }
        if(shape.equals("circle"))
        {
            //Diagonal1kit
            System.out.print("Enter the raduis: ");
            double Raduis = Sc.nextDouble();
            System.out.println(" ");
            System.out.println("Is Pi = 22/7 or 3.14159..");
            System.out.println("Type '1' if pi = 22/7 or else type'2'");
            int Pi = Sc.nextInt();
            if(Pi==1)
            {
                //formulae
            double cir = (22 * Math.pow(Raduis, 2))/7;
            
            //answer
            System.out.print("The Area of the Circle is: " + cir);
        }
            
        
        else
        {
            //formulae
            double circle = Math.PI * Math.pow(Raduis,2);
            //answer
            System.out.print("The Area of the Circle is: " + circle);
        }
    }
}
}
    


        
        
   
   
        
      