import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
		int year, month;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month and the year: ");
		month = sc.nextInt();
		year = sc.nextInt();
		if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
			System.out.print("Number of days is 31");
		else if((month == 2) && ((year%400==0) || (year%4==0 && year%100!=0)))
		{
			System.out.print("Number of days is 29 and it is a leap year");
		}
		else if(month == 2)
		{
			System.out.print("Number of days is 28");
		}
		else
			System.out.println("Number of days is 30");
	}
}