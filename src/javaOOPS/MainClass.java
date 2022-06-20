package javaOOPS;

public class MainClass {
    public static void main(String[] args) {
//        Scanner scn = new Scanner(System.in);

        Animal a1 = new Animal("Tommy", 5);
//        System.out.print("Enter the age of your dog: ");
//        a1.age = scn.nextInt();
//        scn.nextLine();
//        System.out.print("Enter the name of your dog: ");
//        a1.name = scn.nextLine();
        Animal a2 = new Animal("Jack", 7);
        a1.bark();
        a1.play();
        a2.display();
    }

}

class Animal {
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    void play() {
        System.out.println(name + " is playing.");
    }

    void bark() {
        System.out.println(name + " is barking.");
    }
}
