package Lesson24;

public class Test3 {
    Jumpble j1 = new Human();
    Jumpble j2 = new Animal();
}
class Human implements Jumpble{
    public void jump(){
        System.out.println("Hu,am jumps");
    }
}
class Animal implements Jumpble{
    public void jump(){
        System.out.println("Animal jumps");
    }
}
interface Jumpble{
    void jump();
}

interface A1{
    void abc();
}
interface B1 extends A1, Jumpble{
    void def();
}