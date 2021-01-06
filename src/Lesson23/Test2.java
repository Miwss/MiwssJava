package Lesson23;

import p4.D;
import p4.p5.E;

public class Test2 {
//Если между объктами есть связь is, то так делать разрешенно, пример: Doctor  d = new Xirurg(); --- Каждый хирург есть доктор!!(Так можно), но, Если было бы наоборот, Каждый доктор есть хирург, то, это не верное утверждение!
    public static void main(String[] args) {
        Doctor d = new Doctor();
        TEacher t = new TEacher();
        Driver dr =new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);//Референс переменная имплои может ссылатся на референс переменную Доктор, это означает что Доктор есть Имплои.
        Employee emp2 = new TEacher();
        Employee emp3 = new Driver();
        //Doctor dd = new Xirurg();//Мы не можем таким образом обратится переменной к методам и переменным дочернего класса Хирург, потому что, таких методов нет в Классе Дорктор либо Имплои(Материнском классе)
        Xirurg x = new Xirurg();// В классе хирург, мы можем обратится к методам и переменным класса Доктор и Имплои, если хирург наследник класса доктоа, а доктор наследник класса Имплои, то и хирург будет иметь все методы этого класса
        x.Skalpel = "est";
        x.lechit();
        x.sleep();

        emp1.eat();
        emp1.sleep();
        //emp1.lechit();//Компилятор в таких случаях всегда смотрит на тип данных переменной, в классе имплои нет такого метода, хоть он и ссылается на класс Доктор
    }
}

class Employee{
    double salary = 100;
    String name = "Kolya";
    int age;
    int experience;
    void eat(){
        System.out.println("Kyshat");
    }
    void sleep(){
        System.out.println("Spit");
    }
}
class Doctor extends Employee{
    void lechit(){
        System.out.println("Lechit");
    }
}
class TEacher extends Employee{
    int KolichestvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}

class Driver extends Employee{
    String nazvanieMashini;
    void voidt(){
        System.out.println("vodit");
    }
}
class Xirurg extends Doctor{
    String Skalpel;
    void rejit(){
        System.out.printf("Rejit");
    }
}