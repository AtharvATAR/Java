import java.util.*;

public class bookProject {
    String name, title;
    int acc_no, late;
    double fine;
    public static void main(String[] args) {
        bookProject book = new bookProject();
        book.input();
        book.compute();
        book.display();
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        title = sc.nextLine();
        acc_no = sc.nextInt();
    }

    public void compute() {
        Scanner sc = new Scanner(System.in);
        late = sc.nextInt();
        fine = 2.00 * late;
    }

    public void display() {
        System.out.println("Name of the author: " + name);
        System.out.println("Title of the book: " + title);
        System.out.println("Accesesion number: " + acc_no);
        System.out.println("Total fine: ₹" + fine);
    }
}
