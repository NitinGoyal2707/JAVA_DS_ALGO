package practiseQuestions;

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int mul = 0;
        for (int i = 1; i <= 10; i++) {
            for (int j = 0; j <= 10; j++) {
                    mul = num * i;
            }
            System.out.print(mul+" ");
        }

    }
}
