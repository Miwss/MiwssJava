package Lesson27;

public class Test1 {
    public static void main(String[] args) {
        Animal an = new Tiger();
        System.out.println(an.a);
        System.out.println(an.b);
        an.abc();
        an.def();
    }
}
class Animal{
    int a = 5;
    static int b = 10;
    void abc(){
        System.out.println("non-static metod iz klassa Animal");
    }
    static void def(){
        System.out.println("static metod iz klassa Animal");
    }
}
class Tiger extends Animal{
    int a = 15;
    static int b = 20;
    void abc(){
        System.out.println("non-static method iz klassa Tiger");
    }
    static void def(){
        System.out.println("static metod iz klassa Tiger");
    }
}
//из за того что А и Б переменные, коплайл тайм определяет что АН это тип Анимал, значит переменные А и Б будут браться из класса Анимал.
//Какой метод АБС будет вызыватся, компайл тайм не определяется, это определяется в ран тайм, джава увидит что АБС должен вызыватся из класса Тайгер, потому что АН ссылается на новый объект класса тайгер.
//ДЕФ является статическим, поэтому компайл тайм может определить что он будет вызыватся из класса Анимал, почему? Потому что АН - типа Анимал.