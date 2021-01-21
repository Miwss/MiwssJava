package Lesson26;

public class Test5 {
    void abc(short s){
        System.out.println("byte");
    }
    void abc(int i){
        System.out.println("int");
    }
    void abc(float f){
        System.out.println("float");
    }
    void abc(Object o){
        System.out.println("Object");
    }

    public static void main(String[] args) {
        Test5 t = new Test5();
        char c =55;
        t.abc(c);
        t.abc(false);
        t.abc(3.14);// выводит обжект, потому что дефолтный тип это дабл которого тут нет, в флоат он не зайдет без кастинга, по этому вывод обжект
    }
}
