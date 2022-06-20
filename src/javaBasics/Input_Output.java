package javaBasics;

import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter your age : ");
//        int age = scn.nextInt();
//        scn.nextLine();
//        System.out.println("Enter your name : ");
//        String name = scn.nextLine();
//        System.out.println(age);
//        System.out.println(name);

        System.out.println("Enter the first number : ");
        int firstNumber = scn.nextInt();
        System.out.println("Enter the second number : ");
        int secondNumber = scn.nextInt();

        int product = firstNumber * secondNumber;
        System.out.println("The product of first and second number : " + product);


    }
}
