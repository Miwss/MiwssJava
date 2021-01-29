package PractickJava;

import java.util.Date;

public class Upper {
    public static void main(String[] args) {
        String s = firstUpperCase("qwe eqw qwe ");
        System.out.println(s);
    }
    public static String firstUpperCase(String word){
        String s2 = "";
        s2 = s2 + word.substring(0,1).toUpperCase();
        for (int i = 0; i < word.length(); i++) {
           if(" ".equals(word.substring(i-1, i)))
            s2 = s2+word.substring(i, i+1).toUpperCase();
           else{
               s2 = s2 +word.substring(i, i+1);
           }
        }

        return word;
    }
}
//не работает