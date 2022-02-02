import java.util.Scanner;

class Calc {
    int result, loopCap;
    int[] inputs = new int[loopCap];

    public void input() {
        int loopingVar;
        Scanner sc = new Scanner(System.in);

        System.out.print("How many numbers do you want to add: ");
        this.loopCap = sc.nextInt();

        int[] inputs = new int[loopCap];

        for (loopingVar = 1; loopingVar <= loopCap; loopingVar++) {
            System.out.print("Input: ");
            inputs[loopingVar] = sc.nextInt();
            if (loopingVar == loopCap) {
                sc.close();
            }
        }
        sc.close();
    }

    public void add(int... inputs) {
        for (int loopingVar : inputs) {
            result += loopingVar;
        }
        System.out.println(result);
    }
}

public class practice {
    public static void main(String[] args) {
        Calc obj = new Calc();
        obj.input();
        obj.add(obj.inputs);

        // 2:40:28
    }
}