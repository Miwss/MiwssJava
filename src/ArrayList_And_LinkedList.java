import java.util.ArrayList;
import java.util.LinkedList;
public class ArrayList_And_LinkedList {
    public static void main(String[] args) {
//        ArrayList<Integer> some_dyn = new ArrayList<>(5);
//
//        some_dyn.add(56);
//        some_dyn.add(6);
//        some_dyn.add(5);
//        some_dyn.add(23);
//        some_dyn.add(1);
//        some_dyn.add(123);
//
//        //some_dyn.clear(); - chistit ves massiv
//        //some_dyn.size(); - pokazivaet kolichestvo elementov v massive
//        //some_dyn.remove(1); - ydalyaet element po indeksy
//        for(Integer x:some_dyn)
//        {
//            System.out.println(x);
//        }
        LinkedList<String> names = new LinkedList<>();

        names.add("Tom");
        names.add("Georger");
        names.add("John");

        //some_dyn.clear(); - chistit ves massiv
        //some_dyn.size(); - pokazivaet kolichestvo elementov v massive
        //some_dyn.remove(1); - ydalyaet element po indeksy
        names.add(1, "Artem");
        for(String x:names)
        {
            System.out.println(x);
        }
    }
}
