package Lesson23;

public class Test3 {
    public static void main(String[] args) {
         Employee e = new Teacher1();
         e.eat();
    }
}
class Employee1{
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
class Teacher1 extends Employee{
    void eat(){
        System.out.println("Kyshaet Ychitel");
    }
    int KolichestvoUchenikov;
    void uchit(){
        System.out.println("Uchit");
    }
}
class A{
    Employee objectCreation(){
    return new Employee();
    }
}

class B extends  A{
    Employee objectCreation(){
        System.out.println("ok");//мы можем вернуть тип класса Тичер, потому что он является саб классом Имплои!
        return new Teacher1();
    }
}
//внутри саб класса, вы можите указывать какие-то методы и объекты которых нет у суперк класса, так же можно менять методы, перезаписывать, которые были унаследованы у суперкласса