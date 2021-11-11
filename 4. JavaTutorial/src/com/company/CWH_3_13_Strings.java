package com.company;

import java.util.Scanner;

public class CWH_3_13_Strings {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.format("The name is: %s\nThe Length is: %d", name, name.length());

    }
}
