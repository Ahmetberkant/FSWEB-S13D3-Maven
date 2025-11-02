package org.example;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("John", "Doe", 20);
        Wall wall = new Wall(5, 4);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("Lastname: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Is teen? " + person.isTeen());

        System.out.println("Wall width: " + wall.getWidth());
        System.out.println("Wall height: " + wall.getHeight());
        System.out.println("Wall area: " + wall.getArea());
    }
}
