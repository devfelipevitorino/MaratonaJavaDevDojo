package _05ClassesUtilitarias._05JavaTime._02LocalTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeAula89 {
    public static void main(String[] args) {

        LocalTime time = LocalTime.of(23,32,12);
        LocalTime timeNow = LocalTime.now();
        System.out.println(time);
        System.out.println(timeNow);

        System.out.println(time.getHour());
        System.out.println(time.getMinute());
        System.out.println(time.getSecond());
        System.out.println(time.get(ChronoField.HOUR_OF_DAY));
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MAX);

    }
}
