package Lesson29;
import java.time.*;

public class Test5 {
    public static void main(String[] args) {
        LocalDateTime lft = LocalDateTime.of(2016, Month.SEPTEMBER,1,16,40);
        LocalTime lt = LocalTime.of(10,30);
        //Period p = Period.ofDays(10).ofDays(10); это метод chaining он не работает в класе период, по скольку каждый метод является статическим
        Period p = Period.ofMonths(3);
        Duration d = Duration.ofMinutes(3);
        System.out.println(lft.plus(d).plus(p));
    }
}
