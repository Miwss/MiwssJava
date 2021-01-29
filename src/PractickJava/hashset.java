package PractickJava;

import java.lang.reflect.Array;
import java.util.*;

public class hashset {
    int a;
    hashset(int i){
        a = i;
    }
    public void swap(hashset i, hashset j){
        int t;
        t = i.a;
        i.a = j.a;
        j.a = t;
    }

        //ArrayList<String> al = new ArrayList<>();
//        al.add("test1");
//        al.add("test2");
//        al.add("test3");
//        al.add("test4");
//        al.add("test5");
//        al.add("test6");
//
//        HashMap<Integer, String> hs = new HashMap<>();
//        for (int i = 0; i < al.size(); i++) {
//            hs.put(i, al.get(i));
//        }
//        System.out.println(hs);

}