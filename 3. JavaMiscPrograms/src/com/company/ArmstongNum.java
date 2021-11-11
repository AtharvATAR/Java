import java.util.*;

class ArmstrongNum {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int armCheck = 0, cubedNum, numCheck;
    int armstrongCand = input.nextInt();

    numCheck = armstrongCand;

    while (armstrongCand > 0) {

      cubedNum = armstrongCand % 10;
      armstrongCand = armstrongCand / 10;
      armCheck = armCheck + (cubedNum * cubedNum * cubedNum);
    }

    if (numCheck == armCheck)
      System.out.println("armstrong number");
    else
      System.out.println("Not armstrong number");

    input.close();
  }
}
