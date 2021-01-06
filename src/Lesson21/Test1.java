package Lesson21;
import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList List = new ArrayList();
        List.add("Privet");
        List.add(798);

        ArrayList<String> List2 = new ArrayList();
         List.add("Poka");
        List.add(123);
        ArrayList<StringBuilder> list3 =new ArrayList();

        ArrayList<String> list = new ArrayList<>();

        list.add("qwe");
        list.add(0,"qqqq");
        for(String s:list){
            System.out.println(s);
        }

    }
}

