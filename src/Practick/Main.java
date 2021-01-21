package Practick;
import Homework.Lesson22.Student;
import Practick.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Students> list = new ArrayList<>();
        Students st1 = new Students("Artem", 21, 3, 9.5);
        Students st2 = new Students("Vanya", 20, 3, 7);
        Students st3 = new Students("David", 21, 3, 7.5);
        Students st4 = new Students("Misha", 22, 3, 8);
        Students st5 = new Students("Kolya", 18, 3, 6.5);
        Students s1 = new Students();
        StudentStats sts = new StudentStats();
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        s1.ListStudents(list);
        System.out.println("-------------------------------");
        sts.WhoIsGointToNextCourse(list, (Students s)->{return s.getAvg() >= 8 && s.getCourse() == 3;});

    }
}