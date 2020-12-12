package Homework.Lesson14;

public class Time {
    public static void Method()
    {
        OUTER:
        for(int chas = 0; chas <= 6; chas++)
        {
            MIDDLE:
            for(int minuta = 0; minuta <=59; minuta++)
            {
                if(chas > 1 && minuta % 10 ==0)
                {
                    break OUTER;
                }
                INNER:
                for(int second = 0; second <=59; second++) {
                    if(second * chas > minuta)
                    {
                        continue INNER;
                    }
                    System.out.println(chas + ":" + minuta + ":" + second);
                }
            }
        }
    }

    public static void main(String[] args) {
        Method();
    }

}
