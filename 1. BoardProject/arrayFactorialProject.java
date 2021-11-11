
public class arrayFactorialProject {
    public static void main(String[] args) {
        int array[] = new int[10];
        int factorial = 1;
        for (int i = 0; i < array.length; i++) {
            factorial *= (i + 1);
            array[i] = factorial;
            System.out.println(array[i]);
        }
    }
}
