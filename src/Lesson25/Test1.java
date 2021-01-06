package Lesson25;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();

        System.out.println(emp1 instanceof Employee);

//        Employee [] array2 = {emp1, emp2, emp3};
//        for(Employee emp:array2){   //Пример работы полиморфизма, где один метод может работать по разному
//            emp.work();
//        }

//        Driver [] array1 = {new Driver(), new Driver()};
//        Employee [] array2 = {new Driver(), new Teacher(), new Doctor()};
//        Help_able [] array3 = {new Driver(), new Teacher(), new Doctor()};


        //Help_able h = new Teacher();
        //h.work();

        //emp1.help();

//        emp1.work();
//        emp2.work();
//        emp3.work();

    }
}
abstract class Employee {
    void sleep()
    {
        System.out.println("Employee sleeps");
    }
    abstract void work();
}
class Teacher extends Employee implements Help_able{
    public void help(){}
    void work(){
        System.out.println("Teacher works");
    }
}
class Driver extends Employee implements Help_able{
    public void help(){
        System.out.println("Driver Helps");
    }
    void work(){
        System.out.println("Driver works");
    }
}
class Doctor extends Employee implements Help_able{
    public void help(){
        System.out.println("Doctor Helps");
    }
    void work(){
        System.out.println("Doctor works");
    }
}
interface Help_able{
    void help();
}
