import java.util.*;
public class CompoundInterest extends SimpleInterest
{
    public static void main(String[]args)
    {
        //Title and scanner
        Scanner Sc = new Scanner(System.in);
        System.out.println("Compound Interest");
        System.out.println(" ");
        
        //Displays and information
        System.out.print("If any info not known Please enter '0' in the input");
        
        System.out.println(" "); 
        
        System.out.print("Enter the principal: ");
        double P = Sc.nextDouble();
        
        System.out.println(" ");
        
        System.out.print("Enter the Rate: ");
        double R = Sc.nextDouble();
        
        System.out.println(" ");
        
        System.out.print("Enter the Time: ");
        double T = Sc.nextDouble();
        
        System.out.println(" ");
        
        System.out.print("Enter the Compound interest(if known): ");
        double CI = Sc.nextDouble();
        
        System.out.println(" ");
        
        System.out.print("Enter the Amount(if known): ");
        double Amt = Sc.nextDouble();
        
       
        //The Formulas
        double CompoundInterest = P * Math.pow((1+(R/100)),T);
        double CompoundInterestPAmt = (P + Amt);
        double Amount = (P * Math.pow((1+(R/100)),T)) + P;
        double AmountPCI = ( CompoundInterest + P);
        double Principal = ((CI * 100)/(T * R));
        double Rate = ((CI * 100)/(T * P));
        double Time = ((CI * 100)/(P * R));
        
        //If Statements
        if(CI==0 && Amt==0)
        {
            System.out.println("The Compound interest is: " + CompoundInterest);
            System.out.println(" ");
            System.out.println("The Amount is: " + AmountPCI);
        }
        if(P==0)
        {
            System.out.println("The Principal is: " + Principal);
            System.out.println(" ");
            System.out.println("The Amount is: " + AmountPCI);
        }
        if(R==0)
        {
            System.out.println("The Rate is: " + Rate);
            System.out.println(" ");
            System.out.println("The Amount is: " + AmountPCI);
        }
        if(T==0)
        {
            System.out.println("The Time is: " + Time);
            System.out.println(" ");
            System.out.println("The Amount is: " + AmountPCI);
        }
        if(R== 0 && T== 0)
        {
            System.out.println("The Time is: " + CompoundInterestPAmt);
            System.out.println(" ");
            System.out.println("The Rate is: " + Rate);
            System.out.println("The Time is: " + Time);
        }
    }
}
        

    
    
    
    
           
        
           
    





    
