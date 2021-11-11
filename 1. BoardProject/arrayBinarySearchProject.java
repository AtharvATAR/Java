import java.util.*;

public class arrayBinarySearchProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array[] = { 5, 7, 9, 11, 15, 20, 30, 45, 89, 97 };
        boolean flag = true, found = false;
        int temp, search;
        int firstTerm = 0, lastTerm = array.length - 1, midTerm;
        System.out.println("Enter the number you want to find");
        search = sc.nextInt();
        while (flag) {
            flag = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    flag = true;
                }
            }
        }
        while (firstTerm <= lastTerm) {
            midTerm = (firstTerm + lastTerm) / 2;
            if (search == array[midTerm]) {
                System.out.println("The number " + search + " is found at index " + midTerm);
                found = true;
                break;
            } else if (search > array[midTerm]) {
                firstTerm = midTerm + 1;
            } else if (search < array[midTerm]) {
                lastTerm = midTerm - 1;
            }
        }
        if (!found) {
            System.out.println("The search for " + search + " was not found");
        }
    }
}
