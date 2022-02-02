import java.util.Scanner;
public class SpyNumber 
{
	public static void main(String[] args)
	{   
		int n,product=1,sum=0;
		int ld;

		
		Scanner sc = new Scanner(System.in);

		
		System.out.print("Enter the number: " );
                n=sc.nextInt();

		//loops
		while(n>0)
		{
			ld=n%10;
			sum=sum+ld;
			product=product*ld;
			n=n/10;
		}

		// conditional statements
		if(sum==product)
		{
			System.out.println("Given number is spy number");
}
		else
		{
			System.out.println("Given number is not spy number");
}
	}
}