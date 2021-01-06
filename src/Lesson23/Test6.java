package Lesson23;

public class Test6 {
}
class Animal1{
     String showName(){
        return "some Animal";
    }
    void showInfoAboutAnimal(){
        System.out.println("Name of animal: " + showName());
    }
}
class Mouse1 extends Animal1{
     String showName(){
        return "Jerry";
    }
    void showInfoAboutMouse(){
        System.out.println("Name of animal: " + showName());
    }
    public static void main(String[] args) {
        Mouse1 a = new Mouse1();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}
//Поставь в шовНейм - статик приписку и посмотри результат. так работает вызов статит метода и нон статик.

