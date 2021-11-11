import java.util.*;

public class doubleLettersProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input;
        int repeat = 0;
        System.out.println("Enter A String");
        input = sc.nextLine();
        input = input.toUpperCase();
        for (int i = 0; i < input.length()-1; i++) {
            if (input.charAt(i) == input.charAt(i+1)) {
                repeat++;
            }
        }
        System.out.println(input + " " + repeat);
    }
}
