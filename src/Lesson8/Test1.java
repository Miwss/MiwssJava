package Lesson8;

public class Test1 {
    public  int a = 5;
    Test1(){

    }
    Test1(boolean b){
        a = 15;
    }

    public void abc(short s){
        final byte b;
        b = 10;
        System.out.println(a + b);
    }


    public static void main(String[] args) {
        Test1 t = new Test1();

        System.out.println(t.a);
    }
}
