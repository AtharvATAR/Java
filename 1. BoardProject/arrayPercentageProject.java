
import java.util.*;

public class arrayPercentageProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int subjectMarks[] = new int[6];
        double sum = 0;
        double percentage;
        System.out.println("Enter your marks out of 100");
        for (int i = 0; i < subjectMarks.length; i++) {
            subjectMarks[i] = sc.nextInt();
            if (subjectMarks[i] > 100) {
                System.out.println("This is not a valid input");
                break;
            }
            sum += subjectMarks[i];
        }
        percentage = (sum / 600) * 100;
        System.out.println("Your total percentage is " + percentage + "%");
    }
}