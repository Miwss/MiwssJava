package Lesson16;

import java.sql.Struct;

public class Test2 {
    public static void main(String[] args) {
        String s1 = new String("acbabcabcasc");

        String s10 = s1.substring(3);
        System.out.println(s10);

        String s12 = s1.trim();
        System.out.println(s12);

        String s13 = s1.replace("acb", "privet");
        System.out.println(s13);

        String s5 = "privet, ";
        String s6 = "drug";
        System.out.println(s5.concat(s6));
    }
}
