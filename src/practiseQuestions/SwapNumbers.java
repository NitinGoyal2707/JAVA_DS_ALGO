package practiseQuestions;

import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int a = scn.nextInt();
        int b = scn.nextInt();

        System.out.println("Before swapping : " + a + " " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping : " + a + " " + b);
    }
}
