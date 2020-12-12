package Homework.lesson6;

public class Student {
    int id;
    String name;
    String surname;
    int course;
    int years;

    Student(int id1, String name1, String surname1,int course1, int years1){
        id = id1;
        name = name1;
        surname = surname1;
        course1 = course;
        years = years1;
    }
    Student(int id2, String name2, String surname2, int course2)
    {

        this(id2, name2, surname2, course2, 0);
    }
    Student(){}
}
class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student(1,"test1","test11", 1,1);
        Student st2 = new Student(2,"test2","test22",2);
        Student st3 = new Student();

        System.out.println(st1.id);
        System.out.println(st2.id);
        System.out.println(st2.years);
        System.out.println(st3);
        System.out.println(st3.name);


    }
}
