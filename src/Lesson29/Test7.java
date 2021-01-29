package Lesson29;

public class Test7 implements EU{

    public static void main(String[] args) {
        EU a = new Test7();
        double i = a.USD(100);
        System.out.println(i);
        double i1 = a.GrnToUsde(12.99);
        System.out.println(i1);
    }
    @Override
    public double USD(double rub){
        double kurs = 28.7;
        double i = rub / kurs;
        return i;
    }
    @Override
    public double EU(double rub){
        double kurs = 33.2;
        double i = rub / kurs;
        return i;
    }
    @Override
    public double GrnToUsde(double usd){
        double kurs = 28.7;
        double i = usd * kurs;
        return i;
    }
}

interface EU {
    double USD(double i);
    double EU(double i);
    double GrnToUsde(double i);
}

