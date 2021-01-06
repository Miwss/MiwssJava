package Lesson16;

public class Test1 {

    public static void main(String[] args) {
        String s1 = new String("aPrivet");
        int a = s1.length();
        System.out.println(a);

        char c1 = s1.charAt(3);
        System.out.println(c1);

        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("t");
        System.out.println(i2);

        int i4 = s1.indexOf('z', 5);
        System.out.println(i4);

        boolean i5 = s1.startsWith("a");
        System.out.println(i5);


    }
}
