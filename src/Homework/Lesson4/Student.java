package Homework.Lesson4;

public class Student {
    int id;
    String name;
    String lastname;
    int years;
    double math;
    double econ;
    double language;

    double srednieOref(double a, double b, double c)
    {
        math = a;
        econ = b;
        language = c;
        double count1 = (math + econ + language) / 3;
        return count1;
    }

}

class StudentTest{
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.id = 1;
        s1.name = "Petya";
        s1.lastname = "pupkin";
        s1.years = 2;
        double count1 = s1.srednieOref(2.5,3.5,5.5);
//        s1.math = 2.5;
//        s1.econ = 3.5;
//        s1.language = 4.5;
       // double count1 = (s1.math + s1.econ + s1.language) / 3;


        s2.id = 2;
        s2.name = "Vasya";
        s2.lastname = "Vasechkin";
        s2.years = 3;
        s2.math = 3.5;
        s2.econ = 4.5;
        s2.language = 5.5;
        double count2 = (s2.math + s2.econ + s2.language) / 3;


        s3.id = 3;
        s3.name = "Leha";
        s3.lastname = "Javac";
        s3.years = 4;
        s3.math = 4.5;
        s3.econ = 2.5;
        s3.language = 3.5;
        double count3 = (s3.math + s3.econ + s3.language) / 3;
        System.out.println("Средняя оценка " + s1.name +": " + count1);
        System.out.println("Средняя оценка " + s2.name +": " + count2);
        System.out.println("Средняя оценка " + s3.name +": " + count3);
    }
}
