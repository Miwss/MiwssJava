package Homework.lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    double salary;
    String department;

    Employee(int id1, String surname1, int age1, double salary1, String department1){
       id = id1;
       surname = surname1;
       age = age1;
       salary = salary1;
       department = department1;
    }

    double ZP(double zp2)
    {
        zp2 = salary;

        return zp2 * 2;
    }
}
class EmployeeTest{
    Employee emp1 = new Employee(1, "Petrov", 20, 100.0, "IT");
    Employee emp2 = new Employee(2, "Valeiy", 21, 120.0,"HR");


}
