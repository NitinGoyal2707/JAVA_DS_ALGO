package practiseQuestions;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        

        System.out.println("Enter your physics marks :");
        float physics = scn.nextFloat();
        System.out.println("Enter your chemistry marks :");
        float chemistry = scn.nextFloat();
        System.out.println("Enter your maths marks :");
        float maths = scn.nextFloat();

        float avgMarks = (physics + chemistry + maths) / 3;


        if (avgMarks > 90) {
            System.out.println("Your grade is A");
        } else if (avgMarks > 80) {
            System.out.println("Your grade is B");
        } else if (avgMarks > 70) {
            System.out.println("Your grade is C");
        } else if (avgMarks > 60) {
            System.out.println("Your grade is D");
        } else {
            System.out.println("Your grade is E");
        }
    }
}
