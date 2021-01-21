package Practick;

import java.util.ArrayList;

public class Students {
    private String name;
    private int age;
    private int course;
    private double avg;

    Students(){}

    Students(String name, int age, int course, double avg){
        this.name = name;
        this.age = age;
        this.course = course;
        this.avg = avg;

    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
    public double getAvg() {
        return avg;
    }

    public void setAvg(double avg) {
        this.avg = avg;
    }

    public void ListStudents(ArrayList<Students> aL){
        for(Students s: aL){
            System.out.println("Name: " + s.name + " Age: " +s.age+ " Course: " + s.course + " Avg: " + s.avg);
        }
    }
}
