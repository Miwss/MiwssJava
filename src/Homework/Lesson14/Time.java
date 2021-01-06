package Homework.Lesson14;

public class Time {
    public static void Method1() {

        int chas = 0;
        OUTER:
        while(chas < 6)
        {
            int minuta = -1;
            MIDDLE:
            do{
                minuta++;
                if(chas > 1 && minuta % 10 == 0)
                {
                    break OUTER;
                }
                int second = 0;
                INNER:
                while(second < 60){
                    if(second * chas >minuta){
                        continue MIDDLE;
                    }
                    System.out.println(chas + ":" + minuta + ":" + second);
                    second++;
                }
            }while (minuta < 59);
            chas++;
        }
    }

    public static void main(String[] args) {
        Method1();
    }
}