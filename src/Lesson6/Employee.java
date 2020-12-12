package Lesson6;

public class Employee {
    int id;
    String name;
    int age;
    String department;
    double salary;


    Employee(int id1, String name1, int age1){
        this(name1, age1);
        id = id1;
    }
    public Employee(String name2, int age2)
    {
        name = name2;
        age = age2;
    }
    Employee(int id3, String name3, int age3, String department3, double salary3)
    {
        this(id3,name3,age3);
        //id = id3;
        //name = name3;
        //age = age3;
        department = department3;
        salary = salary3;
    }
}
class EmployeeTest{
    public static void main(String[] args) {
        Employee mp = new Employee("test", 21);
        System.out.println(mp.age);
        Employee mp2 = new Employee(1, "test1",22);
        System.out.println(mp2.name);
    }
}
