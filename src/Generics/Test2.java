package Generics;

import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> al1 =new ArrayList<>();
        al1.add(10);
        al1.add(30);
        al1.add(40);
        ArrayList<String> al2 =new ArrayList<>();
        al2.add("a");
        al2.add("b");
        al2.add("c");
        String a = GenMethod.getSecondElement(al2);
        System.out.println(a);
    }
}
class GenMethod{
    public static <T> T getSecondElement(ArrayList<T> al){
        return al.get(1);
    }
}
