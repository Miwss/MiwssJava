package Lesson20;

public class Test7 {
    public static void main(String[] args) {
         String[] array = {"privet", "poka", "ok"};
         for(String s : array){
             s = new String("hello");
        //        int[] array = {0,6,4,1};
//        for(int i = 0; i < array.length; i++){
//            array[i] = 3;
//        }
        //for(int a: array){ //не меняет примитивные типы данных
          //  a=3;
        }
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i] + " ");
        }
    }
}
//с помощью метода, мы можем менят значение объекта, но не сам объект