package Homework.Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Mechenosec m = new Mechenosec("Bob");
        System.out.println(m.name);
        m.eat();
        m.sleep();
        m.swim();

        Speakable p = new Pingvin("Kodi");
        //Pingvin p = new Speakable();
        p.speak("Hello");

        Animal l = new Lev("Vasiliy");
        System.out.println(l.name);
        l.eat();
        l.sleep();

        Mammal l2 = new Lev("Grigoriy");
        System.out.println(l2.name);
        l2.run();
        l2.eat();
        l2.sleep();
        l2.speak("q");

    }
}

abstract class Animal{
    String name;
    Animal(String name){
        this.name = name;
    }

    abstract void eat();
    abstract void sleep();
}


abstract class Fish extends Animal{
    Fish(String name){
        super(name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Vsegda interesno nablydat, kak spyat ribi");
    }
    abstract void swim();
}
abstract class Bird extends Animal implements Speakable{
    Bird(String name){
        super(name);
        this.name = name;
    }
    abstract void fly();
}
abstract class Mammal extends Animal implements Speakable{
    Mammal(String name){
        super(name);
        this.name=name;
    }
    abstract void run();
}

interface Speakable{
    default void speak(String s){
        System.out.println(s + " sings");
    }
}
class Mechenosec extends Fish{
    Mechenosec(String name){
        super(name);
        this.name = name;
    }
    public void swim(){
        System.out.println("Mechenosec krasivaya riba, kotoraya bistro plavaet!");
    }
    public void eat(){
        System.out.println("Mechenosec ne xishnaya riba, i  ona est obichniy ribiy korm!");
    }
//Не уверен что нужно, мб делать класс абстрактным...

    public void sleep() {}
}

class Pingvin extends Bird{
    Pingvin(String name){
        super(name);
        this.name = name;
    }
    public void eat(){
        System.out.println("Pingvin lyubit est ribu!");
    }
    void sleep(){
        System.out.println("Pingvini spyat prijavshis dtug k drugu!");
    }
    void fly(){
        System.out.println("Pingvini ne umeyut letat!");
    }
    void speak(){
        System.out.println("Pingvini ne umeyut pet kak solovyi");
    }
}
class Lev extends Mammal{
    Lev(String name){
        super(name);
        this.name = name;
    }
    void eat(){
        System.out.println("Lev, kak lyuboy xishnik, lyubit myaso!");
    }
    void sleep(){
        System.out.println("Bolshuyu chast dnya lev spit!");
    }
    void run(){
        System.out.println("Lev-eto ne samaya bistraya koshka");
    }
}