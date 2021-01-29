package Udemy;

public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder sb =  new StringBuilder();


        sb.append("hello");
        System.out.println(sb);
        show(sb);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


//        String s = "world";
//        System.out.println(s);
//        show(s);
//        System.out.println(s);

    }
    public static void show(StringBuilder s){
        s.append("world");
        System.out.println(s);
    }
}
