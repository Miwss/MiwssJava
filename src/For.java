import java.io.IOException;
public class For {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for(num = 1.0; num < 100.0; num++)
        {
            sroot = Math.sqrt(num); //Метод Math.sqrt() — возвращает квадратный корень из аргумента.
            System.out.println("Корень квадратный из: " + num + " равен " + sroot);
            rerr = num - (sroot * sroot);
            System.out.println("Ошибка округления: " + rerr);
            System.out.println();
        }
//        double x;
//        for(x = 100.0; x > -100.0; x -= 5.0){
//            System.out.println(x );
//        }
//        int i, j;
//        for(i = 0, j = 10; i < j; i++, j--)
//        {
//            System.out.println("i and j: " + i + " " + j);
//        }
//            int i;
//        System.out.println("For STOP write S");
//        for(i = 0; (char) System.in.read() != 'S'; i++);
//        System.out.println(" Пpoxoд #" + i); -------------> не работает System.in.read();
   }
   //В следующем примере программы из определения цикла for исключена
    //инициализирующая часть. i = О ; 11 Выно сим инициализацию за пределы цикла
    //for (; i < 10; ) 
   //можно пропускать отдельные части в определении цикла for; (Пример: пропустить итерацию )
}
