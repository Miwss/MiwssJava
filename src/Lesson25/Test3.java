package Lesson25;

public class Test3 {
    public static void main(String[] args) {
        Employee1 emp1 = new Doctor1();
        Employee1 emp2 = new Driver1();
        Employee1 emp3 = new Teacher1();
        Employee1 emp4 = new Employee1();
        Employee1 [] array = {emp1, emp2, emp3, emp4};
        for(Employee1 e: array){
            if(e instanceof Driver1){
                System.out.println(((Driver1)e).nazvanieMashini);
                ((Driver1)e).vodit();
            }
        }


        //Doctor1 d1 = (Doctor1) emp1;//тут говорится"Поверь мне, переменная емп1 это тип Доктор а не Имплои"
        //System.out.println(d1.specializaciya);
//        System.out.println(((Doctor1)emp1).specializaciya); //так мы показываем, специализацию какого объекта мы будем вызывать!
//        //.lechit();
//        emp1.age = 10;
//        ((Doctor1) emp1).lechit();
    }
}
class Employee1{
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
class Doctor1 extends Employee1{
    String specializaciya = "Xirurg";
    void lechit(){
        System.out.println("Leschit");
    }
    void eat(){
        System.out.println("Da da");
    }
}
class Teacher1 extends Employee1{
    void uschit(){
        System.out.println("Uchit");
    }
}
class Driver1 extends Employee1{
    String nazvanieMashini ="Ferrari";
    void vodit(){
        System.out.println("Vodit");
    }
}
