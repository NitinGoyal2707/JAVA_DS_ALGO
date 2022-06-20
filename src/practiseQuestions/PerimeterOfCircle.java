package practiseQuestions;

import java.util.Scanner;

public class PerimeterOfCircle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the radius of the circle : ");
        float radius = scn.nextFloat();

        float area = (float) (2 * 3.14 * radius);
        System.out.println("The perimeter of the circle is :");
        System.out.println(area);
    }
}
