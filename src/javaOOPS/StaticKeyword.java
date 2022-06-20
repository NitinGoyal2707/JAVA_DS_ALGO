package javaOOPS;

public class StaticKeyword {
    public static void main(String[] args) {

        Person p1 = new Person("Nitin", 23);
        p1.eat();
        System.out.println(Person.count);

    }
}

class Person {
    String name;
    int age;
    static int count;

    public Person() {
        count++;
        System.out.println("Default Constructor.");
    }

    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println("Person is eating");
    }
}
