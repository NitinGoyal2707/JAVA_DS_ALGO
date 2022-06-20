package javaBasics;

import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        /*Java has provides 3 types of Control Flow statements :
            1. Decision Making statements :
                (i) if-else statements
                (ii) switch statements
            2. Loop statements :
                (i) for loop / for each loop
                (ii) while loop / do while loop
            3. Jump statements :
                (i) break
                (ii) continue*/

        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        if (a > b) {
            if (a > c)
                System.out.println("a is greater than b and c.");
            else
                System.out.println("c is greater than a and b.");
        } else if (b > a) {
            if (b > c)
                System.out.println("b is greater than a and c.");
            else
                System.out.println("c is greater than a and b.");
        }


    }
}
