package Homework.Lesson21;
import java.util.*;

public class Test {

       public ArrayList<String> abc(String ... s) {
           ArrayList<String> aL = new ArrayList<>();
           for(String s1: s){
                   aL.add(s1);

           }
           Collections.sort(aL);
           System.out.println(aL);
           return aL;
        }

    public static void main(String[] args) {
        Test t1 = new Test();
        t1.abc("artem", "vasya", "bogdan", "privet", "kak dela?", "ok", "hello");
    }
}
