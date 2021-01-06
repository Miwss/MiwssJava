package Lesson20;

public class Test5 {
    public static void main(String[] args) {
        String [] students = { "Ivanpv", "petrov", "Sidorov"};
        String [] exams = {"mat analiz", "filosofiya"};
        for(String s1:students){
            for(String s2:exams){
                System.out.println(s1 + " " + s2);
            }
        }
    }
}
