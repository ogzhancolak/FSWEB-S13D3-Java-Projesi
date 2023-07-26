package com.workintech.oop;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Person person = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + person.getFirstName());
        System.out.println("Lastname: " + person.getLastName());
        System.out.println("Age: " + person.getAge());
        System.out.println("is Teen: " + person.isTeen());

        System.out.println("*****************************************");

        Wall wall = new Wall(4,5);

        System.out.println("Area: " + wall.getArea());

        wall.setHeight(-1.5);
        //wall.setWidth(-2);
        System.out.println("Width: " + wall.getWidth());
        System.out.println("Height: " + wall.getHeight());
        System.out.println("Area: " + wall.getArea());


    }

}