import java.util.*;
public class Char
{
	public static void main(String[]args)
	{
	    int no=0;
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter a character : ");
	    char ch = sc.nextLine().charAt(0);
	
	switch(ch)
	{
	 case  'a' :
	 case 'e'  :
	 case 'i'   :
	 case 'o'  :
	 case 'u'  :
	 case  'A' :
	 case 'E'  :
	 case 'I'   :
	 case 'O'  :
	 case 'U'  :no++;
	}
	if(no==1)
	{
	System.out.println("Entered character "+ch+" is  Vowel");
}
	else 
	{
		if((ch>='a'&& ch<='z')||(ch>='A'&& ch<='Z'))
		{
		System.out.println("Entered character "+ch+" is Consonent");
}
		else
		{
		System.out.println("Not an alphabet");
}
}
	}
}