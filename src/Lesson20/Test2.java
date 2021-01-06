package Lesson20;

public class Test2 {
    static void summa(String s, int ... a){ //varags parametr
        int summa = 0;
        for(int i = 0; i<a.length; i++)
        {
            summa += a[i];
        }
        System.out.println(summa);
        System.out.println(s);
    }
    public void abc(int[] ... array){}// можем вводить 1,2,3 массива интов, сколько захотим
    public static void main(String[] args) {
        summa("ok", 123,42,14);
    }

}
