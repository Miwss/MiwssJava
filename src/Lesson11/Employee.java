package Lesson11;

public class Employee {
    public String name;
    public double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    public double uvelechitel(double a)
    {
        a = a*2;
        return a;
    }
    public double zp2()
    {
        salary = salary * 2;
        return salary;
    }
}

class EmployeeTest{
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ivan", 100.55);
        double count = emp1.uvelechitel(emp1.salary);
        System.out.println(count);
        emp1.zp2();
        System.out.println(emp1.salary);
    }
}
