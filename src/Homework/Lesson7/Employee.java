package Homework.Lesson7;

public class Employee {
    int id;
    public String surname;
    int age;
    private double salary;
    String department;

    public Employee(int id1, String surname1, int age1, double salary1, String department1){
        id = id1;
        surname = surname1;
        age = age1;
        salary = salary1;
        department = department1;
    }

    Employee(String surname1,int id1,int age1, double salary1){
        surname = surname1;
        id = id1;
        age = age1;
        salary = salary1;
    }
    private Employee(int age1, double salary1, String department1){
        age = age1;
        salary = salary1;
        department = department1;
    }
    public void print1(String name){
        surname = name;
        System.out.println(surname);
    }
    public void print2(int id2){
        id = id2;
        System.out.println(id);
    }
    public void print3(double a){
        salary = a;
        System.out.println(salary);
    }

    double ZP(double zp2)
    {
        zp2 = salary;

        return zp2 * 2;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee mp = new Employee(1, "name",21, 100.00,"IT");
        Employee mp2 = new Employee("Vasya", 2, 22, 200.00);
       // Employee mp3 = new Employee(1, 100.00, "HR");
        mp.print1(mp.surname);
        mp.print2(mp.id);
        //mp.print3(mp.salary);

    }
}
