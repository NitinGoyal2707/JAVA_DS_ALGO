package practiseQuestions;

import java.util.Scanner;

public class InchesToMeters {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the inches : ");
        float inches = scn.nextFloat();

        float meters = (float) (0.0254 * inches);

        System.out.println("The converted inches onto meters are :");
        System.out.println(meters);
    }
}
