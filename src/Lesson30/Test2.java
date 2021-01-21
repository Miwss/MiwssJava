package Lesson30;

import java.util.ArrayList;

public class Test2 {
}
//class Student{
//    String name;
//    char sex;
//    int age;
//    int course;
//    double avgGrade;
//    Student(String name, char sex, int age, int course, double avgGrade){
//        this.name = name;
//        this.sex = sex;
//        this.age = age;
//        this.course = course;
//        this.avgGrade = avgGrade;
//    }
//}
//
//class StudentInfo{
//    void printStudent(Student st){
//        System.out.println("Imya studenta: "+ st.name+ ", pol "+ st.sex + ", vozrast: " + st.age+", kurs: "+st.course+", srednyaya ocenka: " + st.avgGrade);
//    }
//    void testStudents(ArrayList<Student> aL, StudentChecks sc){
//         for(Student s : aL){
//             if(sc.test(s)){
//                 printStudent(s);
//             }
//         }
//    }
//
//    public static void main(String[] args) {
//        ArrayList<Student> list = new ArrayList<>();
//        Student st1 = new Student("Ivan", 'm', 22,3,8.3);
//        Student st2 = new Student("Nikolay", 'm', 28,2,6.4);
//        Student st3 = new Student("Elena", 'f', 19,1,8.9);
//        Student st4 = new Student("Petr", 'm', 35,4,7);
//        Student st5 = new Student("Mariya", 'f', 23,3,9.1);
//        list.add(st1);
//        list.add(st2);
//        list.add(st3);
//        list.add(st4);
//        list.add(st5);
//        StudentInfo si = new StudentInfo();
//        FindStudentsOverGrade fsog = new FindStudentsOverGrade();
//        FindStudentsUnderGrade fsug = new FindStudentsUnderGrade();
//        FindStudentsOverAge fsoa = new FindStudentsOverAge();
//        FindStudentsUnderAge fsua = new FindStudentsUnderAge();
//        FindStudentsBySex fsbs = new FindStudentsBySex();
//        FindStudentsMixCondition fsmc = new FindStudentsMixCondition();
//
//
//        si.testStudents(list, fsog);
//        System.out.println("-----------------------");
//        si.testStudents(list, fsug);
//    }
//}
//interface StudentChecks{
//    boolean test(Student s);
//}
//class FindStudentsOverGrade implements StudentChecks{
//    public boolean test(Student s) {
//        return s.avgGrade > 8.5;
//    }
//}
//class FindStudentsUnderGrade implements StudentChecks{
//    public boolean test(Student s) {
//        return s.avgGrade < 9;
//    }
//}
//class FindStudentsOverAge implements StudentChecks{
//    public boolean test(Student s) {
//        return s.age > 25;
//    }
//}
//class FindStudentsUnderAge implements StudentChecks{
//    public boolean test(Student s) {
//        return s.age < 27;
//    }
//}
//class FindStudentsBySex implements StudentChecks{
//    public boolean test(Student s) {
//        return s.sex =='m';
//    }
//}
//class FindStudentsMixCondition implements StudentChecks{
//    public boolean test(Student s) {
//        return (s.avgGrade > 7.2 && s.age < 23 && s.sex == 'm');
//    }
//}
