package Lesson23;

public class Test4 {
    void abc(Animal a){
        System.out.println("A");
    }
    void abc(Mouse m){
        System.out.println("M");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        Animal an = new Mouse();
        t.abc(an);// В таком случае компилятор понимает что в вызванном методе абс, аn - это переменная класса Енимал, тем самым вывод будет "А".
        //Но, если вызвать метод через переменную an.abc(); - тогда сработает тайм ран биндинг и будет смотреть на что ссылается переменная, вывод будет "М".
    }
}
class Animal{
    void getBane(){
        System.out.println("Animal");
    }
}
class Mouse extends Animal{
    void getName(){
        System.out.println("Mouse");
    }
}