package practiseQuestions;

import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        smallest(a, b, c);

    }

    static void smallest(int a, int b, int c) {
        if (a < b) {
            if (a < c) {
                System.out.println("a is smallest");
            } else {
                System.out.println("c is the smallest");
            }
        } else if (b < a) {
            if (b < c) {
                System.out.println("b is the smallest");
            } else {
                System.out.println("c is the smallest");
            }
        }
    }
}
