package practiseQuestions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the year : ");
        int year = scn.nextInt();

        if (year % 4 == 0) {
            System.out.println("Yes, it is a leap year.");
        } else {
            System.out.println("No, its not a leap year.");
        }


    }
}
