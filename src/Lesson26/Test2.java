package Lesson26;
import java.util.ArrayList;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5); // autoboxing
        int a = list.get(0); // unboxing
        System.out.println(a);
        Integer b = new Integer(10);
        int c = b;
        switch(b){}

        String s1 ="50";
        String s2 = "true";
        String s3 = "3.14";
        double d1 = Double.parseDouble(s3);
        boolean b1 = Boolean.parseBoolean(s2);
        int i1 = Integer.parseInt(s1);
        System.out.println(d1);
        System.out.println(i1);
        System.out.println(s2);

        Integer i3 = Integer.valueOf(10);
        System.out.println(i3);

        Double d2 = Double.valueOf(s3);
        System.out.println(d2);
    }
}
