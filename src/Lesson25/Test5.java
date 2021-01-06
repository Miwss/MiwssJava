package Lesson25;

public class Test5 {
}
class test10{
    int a = 5;
    void abc(){
        System.out.println("ok1");
    }
}
class test20 extends test10{
    int a = 10;
    void abc(){
        System.out.println("ok2");
    }
}
class test30 extends test20{
    int a = 15;
    void abc(){
        super.abc();
        System.out.println("ok3");
    }

    public static void main(String[] args) {
        test30 t = new test30();
        System.out.println(((test10)t).a);
        ((test10)t).abc();//происходит run time binding
    }
}
