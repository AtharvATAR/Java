import java.util.*;

class RhombusSimple {
    public static void main(String[] args) {
        //
        Scanner input = new Scanner(System.in);

        int inputNum, loopVar, loopVar2, loopVar3;

        System.out.print("Enter The Number Of Rows/Columns: ");
        inputNum = input.nextInt();

        for (loopVar = 1; loopVar <= inputNum; loopVar++) {
            for (loopVar2 = 1; loopVar2 <= inputNum - loopVar; loopVar2++) {
                System.out.print(" ");
            }
            for (loopVar3 = 1; loopVar3 <= inputNum; loopVar3++) {
                System.out.println("* ");
            }
            System.out.println();
        }

        input.close();
    }
}