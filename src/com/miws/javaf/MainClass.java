package com.miws.javaf;

public class MainClass {
    public static void main(String[] args) {
        Human h1 = new Human();
        Cat c1 = new Cat();
        c1.setColor("Red");
        h1.age = 21;
        h1.name = "Artem";
        c1.age = 20;
        c1.name = "Kiba";
        System.out.println("Human: " + h1.age+ " and name: " + h1.name + "\n" + "Cat: " + c1.getColor());
        System.out.println("Cat name: " + c1.name + "\n" + "Cat age: " + c1.age);
    }
}
