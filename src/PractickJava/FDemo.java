package PractickJava;

public class FDemo {
    int x;
    FDemo(int i){
        x =i;
    }
    protected void finalize(){
        System.out.println("Финализация: " + x);
    }
    void generator(int i){
        FDemo o = new FDemo(i);
    }
}
class Finalize{
    public static void main(String[] args) {
        int count;
        int k =0;

        FDemo ob = new FDemo(0);
        for (count  = 1; count <  1000000; count++) {
            ob.generator(count);
            k++;
        }
    }
}
class MyCounter{
    MyCounter counter = new MyCounter();
    public double myMeth(int a, int b){
        double d = a+b;

        return d;
    }
}