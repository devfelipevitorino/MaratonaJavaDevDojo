package _05ClassesUtilitarias._05JavaTime._01LocalDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;

public class LocalDateTestAula88 {
    public static void main(String[] args) {

        LocalDate date = LocalDate.of(2003, Month.FEBRUARY,20);

        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        System.out.println(date.lengthOfMonth());
        System.out.println(date.isLeapYear());

        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        System.out.println(date);

        LocalDate agora = LocalDate.now();
        agora.plusWeeks(4); //ignorado
        agora = agora.plusWeeks(4);
        System.out.println(agora);

        System.out.println(LocalDate.MAX);
        System.out.println(LocalDate.MIN);

    }
}
