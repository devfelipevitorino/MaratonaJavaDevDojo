package _05ClassesUtilitarias._05JavaTime._05Duration;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationAula92 {
    public static void main(String[] args) {

        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2).plusMinutes(8);

        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hourrs = LocalTime.now().minusHours(7);

        Duration d1 = Duration.between(now, nowAfterTwoYears);
        System.out.println(d1);

        Duration d2 = Duration.between(timeNow, timeMinus7Hourrs);
        System.out.println(d2);

        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d3);

        Duration d4 = Duration.ofDays(20);
        System.out.println(d4);

        Duration d5 = Duration.ofMinutes(3);
        System.out.println(d5);

        Duration d6 = Duration.of(3, ChronoUnit.HOURS);
        System.out.println(d6);

    }
}
