package Lesson26;

public class Test4 {
    static void abc(String s){ //1 //owibka
        System.out.println("A");
    }
    static void abc(String ... s){  //3 //2 esli vveli 2 i bolwe parametrov
        System.out.println("B");
    }
    static void abc(Object s){ //2 //owibka
        System.out.println("C");
    }
    static void abc(String s1, String s2){ //owibka esli 1 parametr vveden //1 esli parametrov 2
        System.out.println("D");
    }

    public static void main(String[] args) {
        Test4 t = new Test4();
        t.abc("ok", "!!!");
    }
}
