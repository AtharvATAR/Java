import java.util.Scanner;

public class stringCharProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word;
        int letterCount = 0;
        System.out.println("Enter a word");
        word = sc.nextLine();
        for(int i = 0;i < word.length(); i++) {
            letterCount = 0;
            for(int j = 0;j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    letterCount++;
                }
            }
            if (letterCount > 1) {
                System.out.println("There is a duplicated letter");
                break;
            }
        }
        if (letterCount < 2) {
            System.out.println("There is no duplicate letter");
        }
    }
}
