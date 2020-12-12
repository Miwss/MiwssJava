package Homework.Lesson8;

public class Test1 {

    static public double pi = 3.14;

    static public int sum(int a, int b, int c) {
        return a * b *c;
    }

    static public void sum1(double a, double b){
       double count = a / b;
        System.out.println("Результат деления: " + count);
    }

    double radius(double i, double j) {
        double plosha = pi * i * j;
        return plosha;
    }

    static double result(double r){
        double dlinna = 2 * pi * r;

        return dlinna;
    }
}
class TestTest{
    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println(Test1.sum(1,2,3));
        Test1.sum(2,2,2);

        Test1.sum1(123.00, 123.00);
        Test1.sum1(101231,123);

        System.out.println(t1.radius(1.2,32.2));

        System.out.println(Test1.result(121.3296));
    }
}
