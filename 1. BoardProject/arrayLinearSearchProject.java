
import java.util.*;

public class arrayLinearSearchProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int search;
        int array[] = new int[5];
        boolean found = false;
        System.out.println("Enter the numbers of the Array");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the numbers you want to search");
        search = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == search) {
                System.out.println("Element is found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element is not found");
        }
    }
}
