package Lesson24;

public class Test2 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        System.out.println(h.a);
        h.pomosh();
        h.tushitPojar("Voda");
        s.swim();
    }
}
class Employee{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;

    void eat(){
        System.out.println("Kushat");
    }
    void sleep(){
        System.out.println("Spat");
    }
}
class Driver extends Employee implements Help_able, Swim_able{
    String nazvanieMashini;

    void vodit(){
        System.out.println("Vodit");
    }
    public void pomosh(){
        System.out.println("Driver pomogaet");
    }
    public void tushitPojar(String s){
        System.out.println("Driver tushit pojar " + s);
    }
    public void swim(){
        System.out.println("Driver plavaet");
    }
}

class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;

    void uchit(){
        System.out.println("Uchit");
    }
    public void pomosh(){
        System.out.println("Teacher pomogaet");
    }
    public void tushitPojar(String s){
        System.out.println("Teacher tushit pojar " + s);
    }
}

interface Help_able{
    void pomosh();
    void tushitPojar(String predmet);
    int a = 10;
}
interface Swim_able{
    void swim();
}

abstract class Y implements Swim_able{}
abstract class X extends Y{}
class Z extends Y{
    public void swim(){

    }
}