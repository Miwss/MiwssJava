import java.util.ArrayList;

public class Arrays {
    public static void main(String[] args) {
        //ArrayList list = new ArrayList();
        // int number = 10; примитивный тип данных
        int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++)//одномерный массив
        {
            numbers[i] = i+1;
            System.out.println(numbers[i]);
        }
        System.out.println();
        for(int number:numbers)
            System.out.println(number);

        System.out.println();

        int[] x = {1,2,3};
        double sqrt = 0;
        for(int j:x)
        {
            sqrt = sqrt + j;
            sqrt = Math.sqrt(sqrt);
            System.out.println(sqrt);
        }

        System.out.println();

        int[] q  = new int[100];
        double sqrt1 = 0;
        for(int i = 0; i < q.length; i++)
        {
            double r = i;
            System.out.println(r);
            r = Math.sqrt(r);
            System.out.println(r); //правильно
//            for(double j = 1.0; j < r; j++) // не правильно
//            {
//                j = Math.sqrt(j);
//                System.out.println(j);
//            }
        }

//        for(int w:q)
//        {
//            sqrt1 = sqrt1+w; // не правильно
//            sqrt1 = Math.sqrt(sqrt1);
//            System.out.println(sqrt1);
//        }
    }
}
