import java.util.Scanner;

class StringTypeNum {
    // variables
    public static int loopVar, charNum = 0, wordNum = 0;
    public static String string = " ";

    public static void main(String[] args) {
        // making object of Scanner class
        Scanner input = new Scanner(System.in);

        // input
        System.out.println("---------------------------");
        System.out.print("Please enter your String: ");
        string = input.nextLine();

        // condition statements
        for (loopVar = 0; loopVar < string.length(); loopVar++) {
            if (string.charAt(loopVar) == ' ') {
                wordNum++;
            } else {
                charNum++;
            }
            input.close();
        }
        // quick cheat
        wordNum++;

        // output
        System.out.println("---------------------------");
        System.out.format("The Number of Words: %d\nThe Number of Characters: %d", wordNum, charNum);
        System.out.println("---------------------------");
    }
}