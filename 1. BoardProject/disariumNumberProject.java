import java.util.Scanner;

public class disariumNumberProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number, disariumNumber = 0,numLength = 0;
        System.out.println("Enter a number");
        number = sc.nextInt();
        int numTemp = number;
        while (numTemp > 0) {
            numTemp /= 10;
            numLength++;
        }
        numTemp = number;
        for(int i = 0;i < numLength; i++) {
            disariumNumber += (int)Math.pow((numTemp%10),numLength - i);
            numTemp /= 10;
        }
        if (number == disariumNumber) {
            System.out.println("This is a disarium number");
        }else {
            System.out.println("This is not a disarium number");
        }
    }
}
