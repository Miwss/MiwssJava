package Lesson5;

public class Test20 {
    int summa(int a,int b,int c){
        int result = a+b+c;
        return result;
    }
}
class Test21
{
    public static void main(String[] args) {
        Test20 t = new Test20();
        int summaTrexChisel = t.summa(1,2,3);
        System.out.println(summaTrexChisel);
    }
}
