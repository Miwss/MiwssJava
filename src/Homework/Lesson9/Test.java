package Homework.Lesson9;

public class Test {
    int i;

    Test(int i)
    {
        this.i = i;
    }
}
class TestTest{
    public static void main(String[] args) {
        Test t1 = new Test(1);
        Test t2 = new Test(2);
        Test t3 = new Test(3);
        Test t4 = new Test(4);
        Test t5 = new Test(5);
        Test t6 = new Test(6);
        Test t7 = new Test(7);
        System.out.println(t7);
        Test t8 = new Test(8);
        System.out.println(t8);
        t1 = null;
        t2 = null;
        t3 = null;
        t4 = null;
        t5 = null;
        t6 = null;


    }
}
