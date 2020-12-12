package Lesson8;

public class Car {
    String color = "Blue";
    String engine = "v6";
}

class Human{
    String name = "Name";
    final Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
     //   h1.c=new Car();
     //   h1.c=new Car();
        h1.c.engine="v8";
    }
}
