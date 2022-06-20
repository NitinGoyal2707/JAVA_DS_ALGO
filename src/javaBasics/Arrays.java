package javaBasics;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int len = scn.nextInt();
        int[] arr = new int[len];

        for (int i = 0; i < len; i++) {
            arr[i] = scn.nextInt();
        }

        for (int data : arr) {
            System.out.print(data + " ");
        }
        System.out.println();


        int[] arr2 = {1, 2, 3, 4, 5};
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        int[][] arr3 = new int[3][2];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                arr3[i][j] = scn.nextInt();
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
        }
    }
}
