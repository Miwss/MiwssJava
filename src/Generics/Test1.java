package Generics;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Privet");
        System.out.println(info1);
        String s = info1.getValue();
        Info<Integer> info2 = new Info<>(123);
        System.out.println(info2);
        Integer i = info2.getValue();

    }
//    public void abc(Info<String> info){
//        String s = info.getValue();
//    }
//    public void abc(Info<Integer> info){//эти методы хорошо существуют по отдельности, но не одновременно, потому что компилятор видит их как.
//        Integer i = info.getValue();
//    }
    //public void abc(Info info); //p.s. хоть и типы разные, компилятор их опускает и кастит в момент копмиляции
}
class Info<T>{
    private T value;
    public Info(T value){
        this.value = value;
    }

    public String toString(){
        return "[{" + value +  "}]";
    }
    public T getValue(){
        return value;
    }
}
class Parent{
    public void abc(Info<String> info){
       String s = info.getValue();
    }
}
//class Child extends Parent{
//    public void abc(Info<Integer> info){
//        Integer i = info.getValue();
//    }
//}
//Несмотря на то что, JVM видит эти параметры абсолютно одинаковыми (Info info), несмотря на type erasure, компилятор достаточно умен, что бы понять, что при кастинге в саб классе будут возникать проблемы