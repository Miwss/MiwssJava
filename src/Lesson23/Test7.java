package Lesson23;

public class Test7 {
    public static void main(String[] args) {
        A1 c1 = new C1();
        c1.abc(new B1());
    }
}
class A1{
    void abc(A1 a){
        System.out.println("A");
    }
}
class B1 extends A1{
    void abc(B1 b){
        System.out.println("B");
    }
}
class C1 extends B1{
    void abc(B1 b2){
        System.out.println("C");
    }
}
//Методы в классе В и С есть перезаписанны, но, метод класса А не перезаписал, по скольку у него другие параметры, таким образом, при вызове, у нас выведет А, потому что метод к которому мы обращаемся есть в классе А, типом данных переменной которая ей является, только он есть внутри класса А, остальные методы перегружены а не перезаписанны.