package _05ClassesUtilitarias._05JavaTime._03LocalDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTestAula90 {
    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate date = LocalDate.parse("2025-08-06");
        LocalTime time = LocalTime.parse("09:45:00");

        System.out.println(date);
        System.out.println(time);

        LocalDateTime localDateTime1 = date.atTime(time);
        System.out.println(localDateTime1);

        LocalDateTime localDateTime2 = time.atDate(date);
        System.out.println(localDateTime2);
    }
}
