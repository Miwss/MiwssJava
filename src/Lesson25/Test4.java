package Lesson25;

public class Test4 {
    public static void main(String[] args) {
        String [] array1 ={"privet", "poka"};
        Object [] array2 = array1; //upcasting - Потому что любой массив является массивом типа Object
        String [] array3 = (String[])array2; //downcasting
//        array3[0] = new StringBuilder("ok");//owibka
//        array2[0]  = new StringBuilder("ok");//owibka

    }
}
