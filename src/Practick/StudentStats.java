package Practick;
import Homework.Lesson4.Student;
import Practick.Students;

import java.util.ArrayList;
import java.util.function.Predicate;

public class StudentStats extends Students{
    public void ShowInfo(Students st){
        System.out.println("Name: " + st.getName() + " Age: " + st.getAge() + " Course: " + st.getCourse() + " Avg: "+ st.getAvg());
    }
    public void WhoIsGointToNextCourse(ArrayList<Students> st1, Predicate<Students> T){
        for(Students s: st1){
            if(T.test(s)){
                s.setCourse(4);
                ShowInfo(s);
            }
        }
    }
}
