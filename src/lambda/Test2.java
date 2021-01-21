package lambda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test2 {
    public static void main(String[] args) {
        List<String> list = List.of("privet", "poka", "kak dela?", "vse normalno");
//        for(String s: list){
//            System.out.println(s);
//        }
        list.forEach(s -> System.out.println(s));

        ArrayList<Integer> al = new ArrayList<>();
        al.add(7);
        al.add(6);
        al.add(2);
        al.add(4);
        al.add(5);
        al.add(4);
        al.add(1);

       // al.removeIf(element -> element%3 ==0);
//        Predicate<Integer> p = element -> element % 3==0;
//        al.removeIf(p);
        System.out.println(al);
        al.sort((x,y)->x.compareTo(y));
        System.out.println(al);
    }
}

