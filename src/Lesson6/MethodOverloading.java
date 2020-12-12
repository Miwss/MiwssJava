package Lesson6;

public class MethodOverloading {
    void show(int i)
    {
        System.out.println(i);
    }
    void show(String s){
        System.out.println(s);
    }
    void show(boolean j)
    {
        System.out.println(j);
    }
}
class MethodOverloadingTest{
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 100;
        mO.show(a);
        String b = "Hello world";
        mO.show(b);
        boolean l = true;
        mO.show(l);
    }
}
