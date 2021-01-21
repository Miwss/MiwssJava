package Homework.Lesson30;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Employee {
    String name;
    String department;
    double salary;
    Employee(String name, String department, double salary){
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
}
class TestEmployee{
    void printEmployee(Employee emp){
        System.out.println("Имя работника: " +emp.name+ " Он работает в отделе: " + emp.department+ " Его зарплата: " +emp.salary);
    }
    void filtraciyaRabotnikov(ArrayList<Employee> aL, Predicate<Employee> e){
        for(Employee emp : aL){
            if(e.test(emp))
            {
                printEmployee(emp);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        Employee emp1 =  new Employee("Artem", "IT", 3500);
        Employee emp2 =  new Employee("Eavid", "E", 460);
        Employee emp3 =  new Employee("Bar", "Bar", 1200);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        TestEmployee em = new TestEmployee();
        em.filtraciyaRabotnikov(list, (Employee emp)->{return emp.department == "IT" && emp.salary > 200;});
        em.filtraciyaRabotnikov(list, (Employee emp)->{return  emp.name.startsWith("E")  && emp.salary != 450;});
        em.filtraciyaRabotnikov(list, (Employee emp)->{return emp.name == emp.department;});

    }

}