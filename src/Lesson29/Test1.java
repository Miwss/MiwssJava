package Lesson29;

import java.time.*;

public class Test1 {
    public static void main(String[] args) {
//        System.out.println(LocalDate.now());
//        System.out.println(LocalTime.now());
//        System.out.println(LocalDateTime.now());

//        LocalDate ld1 = LocalDate.of(2014,5,15);
//        System.out.println(ld1);
//        LocalDate ld2 = ld1.minusDays(5);
//        System.out.println(ld2);

        LocalTime lt1 = LocalTime.of(15,30);
        System.out.println(lt1);
        lt1 = lt1.plusHours(1).minusMinutes(10).plusSeconds(18).minusNanos(5);
        lt1 = lt1.minusMinutes(10);
        lt1 = lt1.plusSeconds(18);
        lt1 = lt1.minusNanos(5);
        System.out.println(lt1);
//
//        LocalDateTime ldt1 = LocalDateTime.of(2015,Month.SEPTEMBER,10, 17,25);
//        System.out.println(ldt1);

    }
}
