package javaOOPS;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        Animal a1 = new Animal();
        System.out.print("Enter the age of your dog: ");
        a1.age = scn.nextInt();
        scn.nextLine();
        System.out.print("Enter the name of your dog: ");
        a1.name = scn.nextLine();
        a1.bark();
        a1.play();
    }

}

class Animal {
    String name;
    int age;

    void play() {
        System.out.println(name + " is playing.");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}
