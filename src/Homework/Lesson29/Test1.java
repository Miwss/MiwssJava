package Homework.Lesson29;
import java.time.*;
import java.time.format.*;
public class Test1 {
    DateTimeFormatter d1 = DateTimeFormatter.ofPattern("yyyy, MMMM-MM, !! hh:mm");
    DateTimeFormatter d2 = DateTimeFormatter.ofPattern("hh:mm, MM/MMMM/yy");

     public void smena(LocalDateTime first, LocalDateTime second, Period p, Duration d){
        while(first.isBefore(second)){
            System.out.println("Работаем с: "+ first.format(d1));
            first = first.plus(p);
            System.out.println("До: " + first.format(d1));
            System.out.println();
            System.out.println("Отдыхаем с: " + first.format(d2));
            first= first.plus(d);
            System.out.println("До: " + first.format(d2));
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Test1 t1 = new Test1();
         LocalDateTime ldt1 = LocalDateTime.of(2016, 01, 01, 9,0,0);
        LocalDateTime ldt2 = LocalDateTime.of(2016,10,31,18,0,0);
        Period p = Period.of(0,1,2);
        Duration d = Duration.ofMinutes(600);
        t1.smena(ldt1,ldt2,p,d);
    }

}
