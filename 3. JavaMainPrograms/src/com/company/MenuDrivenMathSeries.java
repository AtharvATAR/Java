import java.util.*;

/*
QUESTION Make a menu driven program with 3 options:
1) take r(double) and return 4/3 * 22/7 * Math.pow(r, 3)
2) double volume(double h, double r) raduis and height and return: v= 22/7 * Math.pow(r, 2) * h
3) double volume(double L, double B, Double H) and return: v = b * h * L
*/
public class MenuDrivenMathSeries
{
  public static double a = 0;

  public static void main(String[]args)
  {
    //initializing variables
    int Series;

    //initializing Scanner(input)
    Scanner input = new Scanner(System.in);

    //title
    System.out.println("-------------");
    System.out.println(" Math Series");
    System.out.println("-------------");

    //input
    System.out.print("Which series do you want to choose: ");
    Series = input.nextInt();

    //conditional statements
    if(Series == 1)
    {
      System.out.println("What is the radius?");
      a = input.nextDouble();

      volume(a);
    }
  }

  public static double volume(double r)
  {
    //initializing variables
    double v;

    a = r;

    //formulae
    v = (4/3) * (22/7) * Math.pow(r, 3);
    return v;
  }
}
