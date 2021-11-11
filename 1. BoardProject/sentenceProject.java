import java.util.*;

public class sentenceProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sentence;
        int whiteSpace = 0, vowel = 0, consonant = 0, word = 1;
        System.out.println("Enter a sentence");
        sentence = sc.nextLine();
        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                whiteSpace++;
                word++;
            } else if (sentence.charAt(i) == ' ') {
                whiteSpace++;
            }
            if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
                    || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u' || sentence.charAt(i) == 'A'
                    || sentence.charAt(i) == 'E' || sentence.charAt(i) == 'I' || sentence.charAt(i) == 'O'
                    || sentence.charAt(i) == 'U') {
                vowel++;
            } else {
                consonant++;
            }
        }
        System.out.println(
                "Word: " + word + "\nVowels: " + vowel + "\nWhitespace: " + whiteSpace + "\nconsonant: " + consonant);
    }
}
