package com.company;
import java.util.Scanner;

class PerfectNum {
    public static void main(String[] arg) {
        int inputNum, resultNum = 0, loopingVar = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        inputNum = input.nextInt();

        while (loopingVar <= inputNum / 2) {
            if (inputNum % loopingVar == 0) {
                resultNum += loopingVar;
            }
            loopingVar++;
        }
        if (resultNum == inputNum) {
            System.out.println(inputNum + " is a perfect number");
        } else
            System.out.println(inputNum + " is not a  perfect number");

        input.close();
    }
}
