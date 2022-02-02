import java.util.Date;
import java.util.Scanner;

/*
* MEGA JAVA MENU PROJECT!
*/

class MenuDrivenMathSeries {
  public static double radiusOfCylinder = 0;
  public static double radiusOfCircle = 0;
  public static double sideOfSquare = 0;
  public static double sideOfCube = 0;
  public static double heightOfCone = 0;
  public static double radiusOfCone = 0;

  public static void main(String[] args) {
    // initializing variables
    String Series;

    // initializing Scanner(input)
    Scanner input = new Scanner(System.in);

    // title
    System.out.println("---------------------------------------------");
    System.out.println(" Menu driven program in java || Ask anything!");
    System.out.println("---------------------------------------------");

    // input
    System.out.print("Which series do you want to choose: ");
    Series = input.next().toLowerCase().trim();
    System.out.println();

    // conditional statements
    switch (Series) {
      case "cylinder" -> {
        System.out.print("What is the radius: ");
        radiusOfCylinder = input.nextDouble();
        SeriesOne_Cylinder(radiusOfCylinder);
      }
      case "circle" -> {
        System.out.print("What is the radius: ");
        radiusOfCircle = input.nextDouble();
        SeriesTwo_Circle(radiusOfCircle);
      }
      case "square" -> {
        System.out.print("What is the side: ");
        sideOfSquare = input.nextDouble();
        SeriesThree_Square(sideOfSquare);
      }
      case "time", "date" -> {
        System.out.println("Date and time is: ");
        System.out.println();
        SeriesFour_Date();
      }
      case "cube" -> {
        System.out.print("What is the side: ");
        sideOfCube = input.nextDouble();
        SeriesFive_Cube(sideOfCube);
      }
      case "cone" -> {
        System.out.println("What is the Height: ");
        heightOfCone = input.nextDouble();
        System.out.println("What is the radius: ");
        radiusOfCone = input.nextDouble();
        SeriesSix_Cone(heightOfCone, radiusOfCone);
      }
      default -> System.err.println("No Series with the name: " + Series);
    }

    input.close();
  }

  public static void SeriesOne_Cylinder(double radiusCylinder) {
    // initializing variables
    double volumeCylinder;
    radiusOfCylinder = radiusCylinder;

    // formulae
    volumeCylinder = (4.0 / 3.0) * Math.PI * Math.pow(radiusCylinder, 3);

    // output
    System.out.println(volumeCylinder + " : is the volume");
  }

  public static void SeriesTwo_Circle(double radiusInMethod) {
    // initializing variables
    double areaCircle,perimeterCircle;
    radiusOfCircle = radiusInMethod;

    // formulae
    areaCircle = Math.PI * Math.pow(radiusOfCircle, 2);
    perimeterCircle = 2 * Math.PI * radiusOfCircle;

    // output
    System.out.println(areaCircle + " : is the Area");
    System.out.println(perimeterCircle + " : is the Perimeter");
  }

  public static void SeriesThree_Square(double sideInMethod) {
    // initializing variables
    double areaSquare;
    areaSquare = sideInMethod;

    // formulae
    areaSquare = Math.pow(sideInMethod, 2);

    // output
    System.out.println(areaSquare + " : is the Area");
  }

  public static void SeriesFour_Date() {

    // making the object
    Date now = new Date();

    // printing the date
    System.out.println(now.toString());
    System.out.println("----------------------------");
  }

  public static void SeriesFive_Cube(double sideOfCube) {

    // initialzing variables
    double areaOfFaces, volumeOfCube, perimeterOfCube;

    // formulae
    areaOfFaces = 6 * Math.pow(sideOfCube, 2);
    volumeOfCube = Math.pow(sideOfCube, 3);
    perimeterOfCube = (12 * sideOfCube);

    // output
    System.out.println("The Area of all faces is: " + areaOfFaces);
    System.out.println("The Volume is: " + volumeOfCube);
    System.out.println("The Perimeter of Whole CUBE is: " + perimeterOfCube);
  }

  public static void SeriesSix_Cone(double height, double radii) {

  }
}