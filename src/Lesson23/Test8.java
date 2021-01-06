package Lesson23;

public class Test8 {
    String s1 = "privet";
    static double Pi = 3.14;
    int summa(int ... i){
        int result = 0;
        for(int a : i){
            result+=a;
        }
        return result;
    }
    static void abc(){
        System.out.println("static method");
    }
}

class B10 extends Test8{
    //String s1 = super.s1 + ", drug!";
   // boolean s1 = true;
   // static String s1 = super.s1; - статической переменной, нельзя назначить переменную, которая связвна с объектом, убрав статик, то можно будет, пример ниже.
    String s1 = super.s1;
    double Pi = super.Pi;//Почему в таком случае можно обратиться к статик переменной, потому что с помощью объекта вы можете обратиться к статической переменной(объект - super в таком случае)


    int summa(int ... i){
        int result = super.summa(i);
        System.out.println("Summa: " + result);
        super.abc();//В описании про статик методы и супер, читать ниже
        return result;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
      //  System.out.println(super.s1);
    }
}
//Супер используется тогда, когда переменную делаем hide
//Если в суперклассе вы сделали переменную hide, то в саб классе к ней можно обратиться с помощью слова super.

//как и кллючевое слово this, мы не можем использовать слово супер с статик объектами

//вне статик методе, с помощью супер мы можем вызвать статический метод из суперкласса