package practiseQuestions;

import java.util.Scanner;

public class FindGreatestThanAvgInArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the arary : ");
        int len = scn.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scn.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum + arr[i];
        }
        System.out.print("the total sum of the array is: ");
        System.out.println(sum);
        int avg = sum / len;

        System.out.print("The avg of the array is: ");
        System.out.println(avg);

        for (int i = 0; i < len; i++) {
            if (arr[i] > avg) {
                System.out.println("greater than avg "+arr[i]);
            } else {
                System.out.println("smaller than avg "+arr[i]);
            }
        }

    }
}
