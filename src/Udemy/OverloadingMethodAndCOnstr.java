package Udemy;

public class OverloadingMethodAndCOnstr {
    public static void main(String[] args) {
        Employee emp = new Employee("Artem", 21);
        Employee emp1 = new Employee();
        emp.ShowInfo(emp);
        emp.ShowInfo("Artem" , 21);
    }
}
class Employee{
    String name;
    int age;
    Employee(){}


    Employee(String name){
        this.name = name;
    }


    Employee(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void ShowInfo(Employee e){
        String s = "hello";
        System.out.println(s + ": " + name);
    }
    public void ShowInfo(String s, int a){
        s = "hello";
        System.out.println(s + ": " + name + " your age is: " + age);
    }
}

/*1) Перегрузка методов — это приём программирования, который позволяет разработчику в одном классе для методов с разными параметрами использовать одно и то же имя
* 2) this - это ссылка на текущий объект, метод или конструктор которого вызывают*/