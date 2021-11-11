import java.util.*;

public class arrayAverageProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name[];
        int totalmarks[];
        int N, wholeMarks = 0;
        double average, deviation;
        System.out.println("Enter the number of students");
        N = sc.nextInt();
        name = new String[N];
        totalmarks = new int[N];
        System.out.println("Enter names and marks");
        for (int i = 0; i < name.length; i++) {
            name[i] = sc.next();
            totalmarks[i] = sc.nextInt();
            wholeMarks += totalmarks[i];
        }
        average = wholeMarks / N;
        System.out.println("Average of the total marks of the students are: " + average);
        for (int i = 0; i < totalmarks.length; i++) {
            deviation = totalmarks[i] - average;
            System.out.println("The deviation of the marks of " + name[i] + " is " + deviation);
        }
    }
}
