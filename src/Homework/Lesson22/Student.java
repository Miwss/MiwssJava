package Homework.Lesson22;

public class Student {
    private StringBuilder name;
    private int course;
    private double grade;

    public  StringBuilder getName(){
        return name;
    }
    public void setName(StringBuilder name1){
        if(name1.length() > 2){
            name = name1;
        }
        else{
            name1 = new StringBuilder("Слишком короткое имя");
            name = name1;
        }
    }
    public int getCourse(){
        return course;
    }
    public void setCourse(int i){
        if(i > 0 && i < 4)
        course = i;
    }
    public double isGrade(){
        return grade;
    }
    public void setGrade(double gR){
        if(gR > 1 && gR < 10)
            grade = gR;
    }
    public void ShoeInfo(){
        System.out.println("Имя студента: " + getName());
        System.out.println("Курс студента: " + getCourse());
        System.out.println("Оценка студента: " + isGrade());
    }
}
class TestStudent{
    public static void main(String[] args) {
        Student st = new Student();
        st.setCourse(3);
        st.setGrade(9.5);
        st.setName(new StringBuilder("Kol"));

        st.ShoeInfo();
//        System.out.println(st.getCourse());
//        System.out.println(st.getName());
//        System.out.println(st.isGrade());
    }
}